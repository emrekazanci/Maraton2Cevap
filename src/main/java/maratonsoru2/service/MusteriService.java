package maratonsoru2.service;

import maratonsoru2.entity.Musteri;
import maratonsoru2.entity.Siparis;
import maratonsoru2.entity.SiparisKalemi;
import maratonsoru2.repository.MusterDao;

import java.util.List;

public class MusteriService {

    static MusterDao musteriDao = new MusterDao();

    public static void getAll() {
        //2-B
        try {
            List<Musteri> musteriList = musteriDao.getAll();
            for (Musteri item : musteriList) {
                int toplamHarcama = 0;
                System.out.println("Müşteri id: " + item.getId() + ", Müşteri Ad: " + item.getMusteriAd()
                        + ", Müşteri Soyad: " + item.getMusteriSoyad()
                );
                for (Siparis item2 : item.getSiparisler()) {
                    System.out.println("Sipariş id: " + item2.getId());
                    for (SiparisKalemi item3 : item2.getSiparisKalemleri()) {
                        toplamHarcama += item3.getUrun().getFiyat() * item3.getUrunAdet();
                        System.out.print(" Ürün: " + item3.getUrun().getUrunAdi() + ", Fiyat: " + item3.getUrun().getFiyat() +", Adet: "+item3.getUrunAdet() + ", \n");
                    }
                }
                System.out.println("TOplam harcama: " + toplamHarcama +"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
