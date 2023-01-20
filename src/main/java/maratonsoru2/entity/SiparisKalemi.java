package maratonsoru2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class SiparisKalemi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    private Urun urun;
    private int urunAdet;

    public SiparisKalemi(Urun urun, int urunAdet) {
        this.urun = urun;
        this.urunAdet = urunAdet;
    }

    public SiparisKalemi(Integer id, Urun urun, int urunAdet) {
        this.id = id;
        this.urun = urun;
        this.urunAdet = urunAdet;
    }
}
