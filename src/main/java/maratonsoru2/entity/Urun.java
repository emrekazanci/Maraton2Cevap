package maratonsoru2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Urun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String urunAdi;
    private int fiyat;


    public Urun(String urunAdi, int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public Urun(Integer id, String urunAdi, int fiyat) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }
}
