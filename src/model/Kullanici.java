package model;

public class Kullanici {

    private int id;
    private String kullaniciAdi;
    private String rol;

    public Kullanici(int id, String kullaniciAdi, String rol) {
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.rol = rol;
    }

    public String yetkiBilgisi() {
        if ("Admin".equalsIgnoreCase(rol)) {
            return "Admin yetkisine sahip kullanıcı";
        } else if ("Operator".equalsIgnoreCase(rol) || "Operatör".equalsIgnoreCase(rol)) {
            return "Operatör yetkisine sahip kullanıcı";
        } else {
            return "Genel kullanıcı";
        }
    }

    public int getId() {
        return id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getRol() {
        return rol;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
