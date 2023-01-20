package maratonsoru2;

import maratonsoru2.entity.Musteri;
import maratonsoru2.entity.Siparis;
import maratonsoru2.entity.SiparisKalemi;
import maratonsoru2.entity.Urun;
import maratonsoru2.service.MusteriService;
import maratonsoru2.service.SiparisService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Musteri musteri1 = new Musteri("Emre","Kazancı");
        Musteri musteri2 = new Musteri("Berke","Kazancı");

        Urun urun1 = new Urun("İphone 14 Pro Max",49999);
        Urun urun2 = new Urun("Macbook Air M2",29999);
        Urun urun3 = new Urun("Termos",615);
        Urun urun4 = new Urun("Kaz tüyü yorgan",1250);

        SiparisKalemi siparisKalemi1 = new SiparisKalemi(urun1,1);
        SiparisKalemi siparisKalemi2 = new SiparisKalemi(urun2,2);
        Siparis siparis1 = new Siparis(musteri1, Arrays.asList(siparisKalemi1,siparisKalemi2));

        SiparisKalemi siparisKalemi3 = new SiparisKalemi(urun3,3);
        SiparisKalemi siparisKalemi4 = new SiparisKalemi(urun4,1);
        Siparis siparis2 = new Siparis(musteri2,Arrays.asList(siparisKalemi3,siparisKalemi4));

        Siparis siparis3 = new Siparis(musteri2,Arrays.asList(new SiparisKalemi(urun1,1)));

        //SiparisService.save(siparis1);
        //SiparisService.save(siparis2);
        //SiparisService.save(siparis3);

        //SiparisService.getAll();
        MusteriService.getAll();
    }
}
