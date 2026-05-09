package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import database.Session;

public class AnaMenuEkrani extends JFrame {

    private static final long serialVersionUID = 1L;

    protected JPanel contentPane;

    protected final Color ARKA_PLAN = new Color(142, 155, 213);
    protected final Color HEADER = new Color(63, 81, 181);
    protected final Color HOVER_RENK = new Color(160, 172, 225);
    protected final Color BASILI_RENK = new Color(120, 135, 200);

    
    protected final int MENU_START_X = 175;
    protected final int MENU_ICON_Y = 250;
    protected final int MENU_LABEL_Y = 375;
    protected final int MENU_GAP = 220;

    public AnaMenuEkrani(String baslik) {

        setTitle(baslik);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBackground(ARKA_PLAN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        headerOlustur();
    }

    private void headerOlustur() {

        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(HEADER);
        headerPanel.setBounds(0, 0, 1100, 80);
        headerPanel.setLayout(null);
        contentPane.add(headerPanel);

        JLabel lblTitle = new JLabel("Hoşgeldiniz, " + Session.aktifKullanici + "!");
        lblTitle.setBounds(0, 20, 1100, 40);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(lblTitle);

        JButton btnCikis = new JButton("ÇIKIŞ");
        btnCikis.setBounds(950, 25, 100, 30);
        headerPanel.add(btnCikis);

        btnCikis.addActionListener(e -> cikisYap());
    }

    
    protected void ortakMenuElemanlariniEkle() {

        menuElemaniEkle("Raporlar", "/ui/raporlar.png",
                MENU_START_X,
                MENU_ICON_Y,
                MENU_LABEL_Y,
                "rapor");

        menuElemaniEkle("Makine Girişi", "/ui/makineGirisi.png",
                MENU_START_X + MENU_GAP,
                MENU_ICON_Y,
                MENU_LABEL_Y,
                "makine");

        menuElemaniEkle("Planlama", "/ui/planlama.png",
                MENU_START_X + MENU_GAP * 2,
                MENU_ICON_Y,
                MENU_LABEL_Y,
                "planlama");
    }

    protected void menuElemaniEkle(String labelText, String iconPath,
                                   int x, int iconY, int labelY,
                                   String hedefEkran) {

        ImageIcon icon = iconOlustur(iconPath);

        JButton btn = butonOlustur(x, iconY, icon);
        contentPane.add(btn);

        JLabel lbl = labelOlustur(labelText, x, labelY);
        contentPane.add(lbl);

        btn.addActionListener(e -> ekranaGit(hedefEkran));
    }

    private void ekranaGit(String hedefEkran) {

        switch (hedefEkran) {

            case "rapor":
                new RaporEkrani().setVisible(true);
                dispose();
                break;

            case "makine":
                new MakineGirisEkrani().setVisible(true);
                dispose();
                break;

            case "planlama":
                new PlanlamaEkrani().setVisible(true);
                dispose();
                break;

            case "siparis":
                new SiparisEkrani().setVisible(true);
                dispose();
                break;

            case "durus":
                new DurusKayipEkrani().setVisible(true);
                dispose();
                break;

            default:
                System.out.println("Geçersiz ekran: " + hedefEkran);
                break;
        }
    }

    private void cikisYap() {

        Session.aktifKullanici = "";
        Session.aktifRol = "";

        new GirisEkrani().setVisible(true);
        dispose();
    }

    protected ImageIcon iconOlustur(String path) {

        URL url = getClass().getResource(path);

        if (url == null) {
            System.err.println("Resim bulunamadı: " + path);
            return new ImageIcon();
        }

        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        return new ImageIcon(img);
    }

    protected JButton butonOlustur(int x, int y, ImageIcon icon) {

        JButton btn = new JButton(icon);

        btn.setBounds(x, y, 150, 120);
        btn.setBackground(ARKA_PLAN);
        btn.setOpaque(true);
        btn.setContentAreaFilled(true);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);

        btn.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                btn.setBackground(HOVER_RENK);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                btn.setBackground(ARKA_PLAN);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                btn.setBackground(BASILI_RENK);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                btn.setBackground(HOVER_RENK);
            }
        });

        return btn;
    }

    protected JLabel labelOlustur(String text, int x, int y) {

        JLabel lbl = new JLabel(text);

        lbl.setBounds(x, y, 150, 30);
        lbl.setFont(new Font("Tahoma", Font.BOLD, 18));
        lbl.setForeground(HEADER);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);

        return lbl;
    }
}
