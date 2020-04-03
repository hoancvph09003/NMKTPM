/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.dao;


import com.qlns.model.ChucVu;
import com.qlns.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Admin
 */
public class ChucVuDAO {
    public List<ChucVu> getListChucVu(){
        List<ChucVu> list=null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        try {
            String hql = "from ChucVu";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        session.close();
        return list;
    }
     public ChucVu findById(String id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ChucVu cv = (ChucVu) session.get(ChucVu.class, id);
        session.close();
        return cv;
    }
    public void addChucVu(ChucVu cv){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.save(cv);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    public void update(ChucVu cv){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.update(cv);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    public void delete(ChucVu cv){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.delete(cv);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
}
