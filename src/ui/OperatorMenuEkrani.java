package ui;

public class OperatorMenuEkrani extends AnaMenuEkrani {

    private static final long serialVersionUID = 1L;

    public OperatorMenuEkrani() {
        super("Operatör Menü");

        int startX = 175;
        int iconY = 250;
        int labelY = 375;
        int gap = 220;

        menuElemaniEkle("Raporlar", "/ui/raporlar.png", startX, iconY, labelY, "rapor");

        menuElemaniEkle("Makine Girişi", "/ui/makineGirisi.png", startX + gap, iconY, labelY, "makine");

        menuElemaniEkle("Planlama", "/ui/planlama.png", startX + gap * 2, iconY, labelY, "planlama");

        menuElemaniEkle("Duruş/Kayıp", "/ui/durusKayip.png", startX + gap * 3, iconY, labelY, "durus");
    }

    public static void main(String[] args) {
        new OperatorMenuEkrani().setVisible(true);
    }
}
