package ui;

public class AdminMenuEkrani extends AnaMenuEkrani {

    private static final long serialVersionUID = 1L;

    public AdminMenuEkrani() {
        super("Admin Menü");

        ortakMenuElemanlariniEkle();

        menuElemaniEkle("Sipariş Girişi", "/ui/siparis.png",
                MENU_START_X + MENU_GAP * 3,
                MENU_ICON_Y,
                MENU_LABEL_Y,
                "siparis");
    }

    public static void main(String[] args) {
        new AdminMenuEkrani().setVisible(true);
    }
}
