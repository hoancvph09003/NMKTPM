/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.dao;

import com.qlns.model.BangTKNhanVien;
import com.qlns.model.NhanVien;
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
public class NhanVienDAO {
    public List<NhanVien> getListNhanVien(){
        List<NhanVien> list=null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        try {
            String hql = "from NhanVien";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        session.close();
        return list;
    }
    
    public List<NhanVien> getListNhanVienPB(String tpb){
        List<NhanVien> list=null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        try {
            String hql = "from NhanVien where phongBan.tenPhongBan =:tpb";
            Query query = session.createQuery(hql);
            query.setParameter("tpb", tpb);
            list = query.list();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        session.close();
        return list;
    }
    
    public NhanVien findById(String id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        NhanVien nv = (NhanVien) session.get(NhanVien.class, id);
        session.close();
        return nv;
    }
    public void addNhanVien(NhanVien nv){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.save(nv);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    public void update(NhanVien nv){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.update(nv);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    public void delete(NhanVien nv){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.delete(nv);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    
    public List<BangTKNhanVien> getListTK(String tpb){
        List<BangTKNhanVien> listNV = new ArrayList<>();
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        String hql = "SELECT nhanVien.maNhanVien, nhanVien.tenNhanVien, nhanVien.phongBan.tenPhongBan, ngayCong*nhanVien.luongCoBan FROM LuongThuong l WHERE nhanVien.phongBan.tenPhongBan = :tpb";
        Query query = session.createQuery(hql);
        query.setParameter("tpb", tpb);
        List<Object[]> list = query.list();
        Iterator it = list.iterator();
            while(it.hasNext()){
                Object[] line = (Object[]) it.next();
                BangTKNhanVien nv = new BangTKNhanVien();
                nv.setMaNhanVien((String) line[0]);
                nv.setHoTen((String) line[1]);
                nv.setPhongBan((String) line[2]);
                nv.setTongLuong((Double) line[3]);
                listNV.add(nv);
            }
        session.close();
        return listNV;
    }
    
}
