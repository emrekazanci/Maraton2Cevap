package maratonsoru1.entity;

public class Sirket {

    private Integer id;
    private String sirketIsmi;
    private String sirketSahibi;
    private String unvan;
    private String faaliyetAlani;
    private int kurulusYili;

    public Sirket(Integer id) {
        this.id = id;
    }

    public Sirket(Integer id, String sirketIsmi) {
        this.id = id;
        this.sirketIsmi = sirketIsmi;
    }

    public Sirket(String sirketIsmi, String sirketSahibi, String unvan, String faaliyetAlani, int kurulusYili) {
        this.sirketIsmi = sirketIsmi;
        this.sirketSahibi = sirketSahibi;
        this.unvan = unvan;
        this.faaliyetAlani = faaliyetAlani;
        this.kurulusYili = kurulusYili;
    }

    public Sirket(Integer sirketId, String sirketIsmi, String sirketSahibi, String unvan, String faaliyetAlani, int kurulusYili) {
        this.id = sirketId;
        this.sirketIsmi = sirketIsmi;
        this.sirketSahibi = sirketSahibi;
        this.unvan = unvan;
        this.faaliyetAlani = faaliyetAlani;
        this.kurulusYili = kurulusYili;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSirketIsmi() {
        return sirketIsmi;
    }

    public void setSirketIsmi(String sirketIsmi) {
        this.sirketIsmi = sirketIsmi;
    }

    public String getSirketSahibi() {
        return sirketSahibi;
    }

    public void setSirketSahibi(String sirketSahibi) {
        this.sirketSahibi = sirketSahibi;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getFaaliyetAlani() {
        return faaliyetAlani;
    }

    public void setFaaliyetAlani(String faaliyetAlani) {
        this.faaliyetAlani = faaliyetAlani;
    }

    public int getKurulusYili() {
        return kurulusYili;
    }

    public void setKurulusYili(int kurulusYili) {
        this.kurulusYili = kurulusYili;
    }

    @Override
    public String toString() {
        return "Sirket{" +
                "Id=" + id +
                ", sirketIsmi='" + sirketIsmi + '\'' +
                ", sirketSahibi='" + sirketSahibi + '\'' +
                ", unvan='" + unvan + '\'' +
                ", faaliyetAlani='" + faaliyetAlani + '\'' +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
