package maratonsoru2.service;

import maratonsoru2.entity.Siparis;
import maratonsoru2.entity.SiparisKalemi;
import maratonsoru2.repository.SiparisDao;

import java.util.List;

public class SiparisService {

    static SiparisDao siparisDao = new SiparisDao();

    public static void save(Siparis siparis) {
        siparisDao.save(siparis);
    }

    public static void getAll() {
        //2-A
        List<Siparis> siparisList = siparisDao.getAll();
        for (Siparis item : siparisList) {
            System.out.println("\n Sipariş ID: " + item.getId()
                    + ", Müşteri: " + item.getMusteri().getMusteriAd()+" " + item.getMusteri().getMusteriSoyad()
                    + ", Müşteri ID: " + item.getMusteri().getId()+ ",");
            Integer siparisToplam = 0;
            for (SiparisKalemi item2 : item.getSiparisKalemleri()) {
                siparisToplam += item2.getUrun().getFiyat() * item2.getUrunAdet();
                System.out.print(" Ürün: " + item2.getUrun().getUrunAdi() + ", Fiyat: " + item2.getUrun().getFiyat() +"Adet: "+item2.getUrunAdet() + ", \n");
            }
            System.out.println("Toplam: " + siparisToplam);
        }
    }
}
