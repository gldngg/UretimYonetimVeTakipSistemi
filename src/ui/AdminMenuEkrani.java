package ui;

public class AdminMenuEkrani extends AnaMenuEkrani {

    private static final long serialVersionUID = 1L;

    public AdminMenuEkrani() {
        super("Admin Menü");

        int startX = 120;
        int iconY = 220;
        int labelY = 350;
        int gap = 200;

        menuElemaniEkle("Raporlar", "/ui/raporlar.png", startX, iconY, labelY, "rapor");

        menuElemaniEkle("Makine Girişi", "/ui/makineGirisi.png", startX + gap, iconY, labelY, "makine");

        menuElemaniEkle("Planlama", "/ui/planlama.png", startX + gap * 2, iconY, labelY, "planlama");

        menuElemaniEkle("Sipariş Girişi", "/ui/siparis.png", startX + gap * 3, iconY, labelY, "siparis");
    }

    public static void main(String[] args) {
        new AdminMenuEkrani().setVisible(true);
    }
}
