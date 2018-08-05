/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Perde;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author ASUS
 */
public class pInfoDao {
    public List<Perde> getAllPerde(){
     SessionFactory factory=HibernateUtil.getSessionFactory();
     Session session = factory.openSession();
     session.beginTransaction();
     Query query = session.createQuery("SELECT a FROM Perde a");
     List<Perde> acdeList = query.list();
     session.getTransaction().commit();
     session.close();
    return  acdeList;
  }
  
  public Perde getPerdeById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT a FROM Perde a where a.id='" + id + "'");
        List<Perde> acdeList = query.list();
        session.getTransaction().commit();
        session.close();
        return acdeList.get(0);
    }

    public boolean savePerde(Perde a) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(a);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
      public boolean updatePerde(Perde a) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(a);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
      
         public boolean deletePerde(Perde a) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(a);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
