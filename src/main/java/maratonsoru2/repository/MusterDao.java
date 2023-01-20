package maratonsoru2.repository;

import maratonsoru2.entity.Musteri;
import maratonsoru2.util.HibernateUtil;

import org.hibernate.Session;

import java.util.List;

public class MusterDao {

    public List<Musteri> getAll() {
        List<Musteri> list = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            list = session.createQuery("select musteri from Musteri musteri").list();
            session.getTransaction().commit();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }

    public void getMusteriId() {
        //2-c
        String sql = "";
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
