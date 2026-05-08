package model;

public class DurusKayip {

    private int id;
    private String makineTipi;
    private String makineKodu;
    private String baslangic;
    private String bitis;
    private String sure;
    private String durusTuru;
    private String durusNedeni;
    private String aciklama;

    public DurusKayip(String makineTipi, String makineKodu, String baslangic,
                      String bitis, String sure, String durusTuru,
                      String durusNedeni, String aciklama) {
        this.makineTipi = makineTipi;
        this.makineKodu = makineKodu;
        this.baslangic = baslangic;
        this.bitis = bitis;
        this.sure = sure;
        this.durusTuru = durusTuru;
        this.durusNedeni = durusNedeni;
        this.aciklama = aciklama;
    }

    public DurusKayip(int id, String makineTipi, String makineKodu, String baslangic,
                      String bitis, String sure, String durusTuru,
                      String durusNedeni, String aciklama) {
        this.id = id;
        this.makineTipi = makineTipi;
        this.makineKodu = makineKodu;
        this.baslangic = baslangic;
        this.bitis = bitis;
        this.sure = sure;
        this.durusTuru = durusTuru;
        this.durusNedeni = durusNedeni;
        this.aciklama = aciklama;
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

    public String getBaslangic() {
        return baslangic;
    }

    public String getBitis() {
        return bitis;
    }

    public String getSure() {
        return sure;
    }

    public String getDurusTuru() {
        return durusTuru;
    }

    public String getDurusNedeni() {
        return durusNedeni;
    }

    public String getAciklama() {
        return aciklama;
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

    public void setBaslangic(String baslangic) {
        this.baslangic = baslangic;
    }

    public void setBitis(String bitis) {
        this.bitis = bitis;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public void setDurusTuru(String durusTuru) {
        this.durusTuru = durusTuru;
    }

    public void setDurusNedeni(String durusNedeni) {
        this.durusNedeni = durusNedeni;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
