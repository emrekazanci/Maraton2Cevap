package maratonsoru2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Musteri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String musteriAd;
    private String musteriSoyad;

    @OneToMany(mappedBy = "musteri",fetch = FetchType.EAGER)
    private List<Siparis> siparisler;

    public Musteri(String musteriAd, String musteriSoyad) {
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
    }

    public Musteri(Integer id, String musteriAd, String musteriSoyad) {
        this.id = id;
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
    }

    public Musteri(String musteriAd, String musteriSoyad, List<Siparis> siparisler) {
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
        this.siparisler = siparisler;
    }
}
