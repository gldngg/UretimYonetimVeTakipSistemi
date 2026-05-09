package ui;

public class OperatorMenuEkrani extends AnaMenuEkrani {

    private static final long serialVersionUID = 1L;

    public OperatorMenuEkrani() {
        super("Operatör Menü");

        ortakMenuElemanlariniEkle();

        menuElemaniEkle("Duruş/Kayıp", "/ui/durusKayip.png",
                MENU_START_X + MENU_GAP * 3,
                MENU_ICON_Y,
                MENU_LABEL_Y,
                "durus");
    }

    public static void main(String[] args) {
        new OperatorMenuEkrani().setVisible(true);
    }
}
