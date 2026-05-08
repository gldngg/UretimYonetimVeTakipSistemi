package model;

public class Siparis {

    private int id;
    private String siparisAdi;
    private String siparisKodu;
    private String musteri;
    private String urunAdi;
    private int miktar;
    private String terminTarihi;

    public Siparis(String siparisAdi, String siparisKodu, String musteri,
                   String urunAdi, int miktar, String terminTarihi) {
        this.siparisAdi = siparisAdi;
        this.siparisKodu = siparisKodu;
        this.musteri = musteri;
        this.urunAdi = urunAdi;
        this.miktar = miktar;
        this.terminTarihi = terminTarihi;
    }

    public Siparis(int id, String siparisAdi, String siparisKodu, String musteri,
                   String urunAdi, int miktar, String terminTarihi) {
        this.id = id;
        this.siparisAdi = siparisAdi;
        this.siparisKodu = siparisKodu;
        this.musteri = musteri;
        this.urunAdi = urunAdi;
        this.miktar = miktar;
        this.terminTarihi = terminTarihi;
    }

    public int getId() {
        return id;
    }

    public String getSiparisAdi() {
        return siparisAdi;
    }

    public String getSiparisKodu() {
        return siparisKodu;
    }

    public String getMusteri() {
        return musteri;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getTerminTarihi() {
        return terminTarihi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSiparisAdi(String siparisAdi) {
        this.siparisAdi = siparisAdi;
    }

    public void setSiparisKodu(String siparisKodu) {
        this.siparisKodu = siparisKodu;
    }

    public void setMusteri(String musteri) {
        this.musteri = musteri;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setTerminTarihi(String terminTarihi) {
        this.terminTarihi = terminTarihi;
    }
}
