package model;

public class Makine {

    private int id;
    private String makineTipi;
    private String makineKodu;
    private String bolum;
    private String kapasite;
    private String bakimPeriyodu;
    private String lokasyon;

    public Makine(String makineTipi, String makineKodu, String bolum,
                  String kapasite, String bakimPeriyodu, String lokasyon) {

        this.makineTipi = makineTipi;
        this.makineKodu = makineKodu;
        this.bolum = bolum;
        this.kapasite = kapasite;
        this.bakimPeriyodu = bakimPeriyodu;
        this.lokasyon = lokasyon;
    }

    public int getId() {
        return id;
    }

    public String getMakineTipi() {
        return makineTipi;
    }

    public String getMakineKodu() {
        return makineKodu;
    }

    public String getBolum() {
        return bolum;
    }

    public String getKapasite() {
        return kapasite;
    }

    public String getBakimPeriyodu() {
        return bakimPeriyodu;
    }

    public String getLokasyon() {
        return lokasyon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMakineTipi(String makineTipi) {
        this.makineTipi = makineTipi;
    }

    public void setMakineKodu(String makineKodu) {
        this.makineKodu = makineKodu;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setKapasite(String kapasite) {
        this.kapasite = kapasite;
    }

    public void setBakimPeriyodu(String bakimPeriyodu) {
        this.bakimPeriyodu = bakimPeriyodu;
    }

    public void setLokasyon(String lokasyon) {
        this.lokasyon = lokasyon;
    }
}
