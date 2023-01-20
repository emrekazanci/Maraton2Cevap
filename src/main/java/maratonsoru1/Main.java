package maratonsoru1;

import maratonsoru1.entity.Calisan;
import maratonsoru1.entity.Sirket;
import maratonsoru1.service.CalisanService;
import maratonsoru1.service.SirketService;

public class Main {
    static SirketService sirketService = new SirketService();
    static CalisanService calisanService = new CalisanService();

    public static void main(String[] args) {
        Sirket sirket1 = new Sirket("Bilgeadam Teknoloji", "Sahibi", "LTD", "Yazılım", 1990);
        Sirket sirket2 = new Sirket("Rönesans", "Erman Ilıcak", "A.Ş.", "İnşaat", 1993);
        //sirketService.create(sirket1);
        //sirketService.create(sirket2);
//      =============================
        Calisan calisan1 = new Calisan("İbrahim Gökyar",45,50000,"Master Trainer",new Sirket(1));
        Calisan calisan2 = new Calisan("Dilara Roserov",28,18000,"Şantiye Mühendisi",new Sirket(2));
        //calisanService.create(calisan1);
        //calisanService.create(calisan2);
//      ============================
        sirketService.read();
        calisanService.read();
//      ============================
        Calisan calisan3 = new Calisan(1,"Arda Ağdemir",26,15000,"Asistan Trainer",new Sirket(1));
        //calisanService.update(calisan3);
//      ============================
        //calisanService.delete(4);

    }
}
