/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Product;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author JR-34
 */
public class productDao {
  public List<Product> getAllProduct(){
     SessionFactory factory=HibernateUtil.getSessionFactory();
     Session session = factory.openSession();
     session.beginTransaction();
     Query query = session.createQuery("SELECT p FROM Product p");
     List<Product> productList = query.list();
     session.getTransaction().commit();
     session.close();
    return  productList;
  }
  
  public Product getProductById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT p FROM Product p where p.id='" + id + "'");
        List<Product> productList = query.list();
        session.getTransaction().commit();
        session.close();
        return productList.get(0);
    }

    public boolean saveProduct(Product p) {
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
    
      public boolean updateProduct(Product p) {
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
      
         public boolean deleteProduct(Product p) {
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
