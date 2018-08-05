/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Bankac;
import entity.Reg;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author ASUS
 */
public class regDao {
    public List<Reg> getAllReg(){
     SessionFactory factory=HibernateUtil.getSessionFactory();
     Session session = factory.openSession();
     session.beginTransaction();
     Query query = session.createQuery("SELECT p FROM Reg p");
     List<Reg> bankacList = query.list();
     session.getTransaction().commit();
     session.close();
    return  bankacList;
  }
  
  public Reg getRegById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT p FROM Reg p where p.id='" + id + "'");
        List<Reg> bankList = query.list();
        session.getTransaction().commit();
        session.close();
        return bankList.get(0);
    }

    public boolean saveReg(Reg p) {
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
    
      public boolean updateReg(Reg p) {
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
      
         public boolean deleteReg(Reg p) {
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

