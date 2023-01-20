package maratonsoru1.entity;

public class Calisan {

    private Integer calisanId;
    private String isim;
    private int yas;
    private int maas;
    private String departman;
    private Sirket sirket;

    public Calisan(String isim, int yas, int maas, String departman, Sirket sirket) {
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.departman = departman;
        this.sirket = sirket;
    }

    public Calisan(Integer calisanId, String isim, int yas, int maas, String departman, Sirket sirket) {
        this.calisanId = calisanId;
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.departman = departman;
        this.sirket = sirket;
    }

    public Integer getCalisanId() {
        return calisanId;
    }

    public void setCalisanId(Integer calisanId) {
        this.calisanId = calisanId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public Sirket getSirket() {
        return sirket;
    }

    public void setSirket(Sirket sirket) {
        this.sirket = sirket;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "calisanId=" + calisanId +
                ", isim='" + isim + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                ", departman='" + departman + '\'' +
                ", sirket=" + sirket +
                '}';
    }
}
