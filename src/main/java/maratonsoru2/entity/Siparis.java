package maratonsoru2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Siparis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Musteri musteri;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<SiparisKalemi> siparisKalemleri;

    public Siparis(Musteri musteri, List<SiparisKalemi> siparisKalemleri) {
        this.musteri = musteri;
        this.siparisKalemleri = siparisKalemleri;
    }

    public Siparis(Integer id, Musteri musteri, List<SiparisKalemi> siparisKalemleri) {
        this.id = id;
        this.musteri = musteri;
        this.siparisKalemleri = siparisKalemleri;
    }
}
