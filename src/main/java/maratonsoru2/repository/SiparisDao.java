package maratonsoru2.repository;

import maratonsoru2.entity.Siparis;
import maratonsoru2.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class SiparisDao {

    public void save(Siparis siparis) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(siparis);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public List<Siparis> getAll() {
        List<Siparis> list = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            list = session.createQuery("select siparis from Siparis siparis").list();
            session.getTransaction().commit();
        } catch (Exception e) {
           e.printStackTrace();
        }
        return list;
    }

}
