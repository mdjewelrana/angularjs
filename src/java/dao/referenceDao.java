/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Product;
import entity.Refer;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author ASUS
 */
public class referenceDao {
    public List<Refer> getAllRefer(){
     SessionFactory factory=HibernateUtil.getSessionFactory();
     Session session = factory.openSession();
     session.beginTransaction();
     Query query = session.createQuery("SELECT p FROM Refer p");
     List<Refer> referList = query.list();
     session.getTransaction().commit();
     session.close();
    return  referList;
  }
  
  public Refer getReferById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT p FROM Refer p where p.id='" + id + "'");
        List<Refer> referList = query.list();
        session.getTransaction().commit();
        session.close();
        return referList.get(0);
    }

    public boolean saveRefer(Refer p) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(p);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
      public boolean updateRefer(Refer p) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(p);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
      
         public boolean deleteRefer(Refer p) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(p);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
