/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.dao;

import com.qlns.model.BangLuongPhongBan;
import com.qlns.model.BangTKNhanVien;
import com.qlns.model.PhongBan;
import com.qlns.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Admin
 */
public class PhongBanDAO {
    public List<PhongBan> getListPhongBan(){
        List<PhongBan> list=null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        try {
            String hql = "from PhongBan";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        session.close();
        return list;
    }
    public PhongBan findById(String id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        PhongBan pb = (PhongBan) session.get(PhongBan.class, id);
        session.close();
        return pb;
    }
    public List<PhongBan> selectByKeyWord(String key){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        String hql = "from PhongBan where tenPhongBan LIKE '%"+key+"%'";
        List<PhongBan> list = session.createQuery(hql).list();
        session.close();
        return list;
    }
    public List<PhongBan> selectById(String id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        String hql = "from PhongBan where maPhongBan LIKE '%"+id+"%'";
        List<PhongBan> list = session.createQuery(hql).list();
        session.close();
        return list;
    }
    
    public void addPhongBan(PhongBan pb){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.save(pb);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    public void update(PhongBan pb){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.update(pb);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    public void delete(PhongBan pb){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.delete(pb);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    
    public List<BangLuongPhongBan> getListTK(){
        List<BangLuongPhongBan> listLP = new ArrayList<>();
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        String hql = "SELECT TL.maPhongBan,TL.tenPhongBan,SUM(TongLuong) as LuongTheoPhong FROM"
                + "(SELECT nhanVien.phongBan.maPhongBan,nhanVien.phongBan.tenPhongBan, ngayCong*nhanVien.luongCoBan as TongLuong FROM LuongThuong l) as TL"
                + "GROUP BY TL.maPhongBan,TL.tenPhongBan";
        Query query = session.createQuery(hql);
//        query.setParameter("tpb", tpb);
        List<Object[]> list = query.list();
        Iterator it = list.iterator();
            while(it.hasNext()){
                Object[] line = (Object[]) it.next();
                BangLuongPhongBan lp = new BangLuongPhongBan();
                lp.setMaPhongBan((String) line[0]);
                lp.setTenPhongBan((String) line[1]);
                lp.setLuongPhongBan((Double) line[2]);
                listLP.add(lp);
            }
        session.close();
        return listLP;
    }
    
}
