/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.dao;

import com.qlns.model.LuongThuong;
import com.qlns.model.BangLuongThuong;
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
public class LuongThuongDAO {

    public void chamCong(String mnv){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        String hql = "UPDATE LuongThuong SET ngayCong = ngayCong +1 WHERE nhanVien.maNhanVien = :mnv";
        Query query = session.createQuery(hql);
        query.setParameter("mnv", mnv);
        int result = query.executeUpdate();
        session.close();
    }
    
    public List<BangLuongThuong> getListLuongThuong() {
        List<BangLuongThuong> listBL = new ArrayList<>();
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        String hql = "SELECT nhanVien.maNhanVien, l.nhanVien.tenNhanVien, nhanVien.luongCoBan,l.nhanVien.phongBan.tenPhongBan, ngayCong, tangCa, tienThuong, tienPhat FROM LuongThuong l";
        Query query = session.createQuery(hql);
        List<Object[]> list = query.list();
        Iterator it = list.iterator();
            while(it.hasNext()){
                Object[] line = (Object[]) it.next();
                BangLuongThuong bl = new BangLuongThuong();
                bl.setMaNhanVien((String) line[0]);
                bl.setHoTen((String) line[1]);
                bl.setLuongCoBan((Double) line[2]);
                bl.setPhongBan((String) line[3]);
                bl.setNgayCong((Integer) line[4]);
                bl.setTangCa((Integer) line[5]);
                bl.setTienThuong((Double) line[6]);
                bl.setTienPhat((Double) line[7]);
                listBL.add(bl);
            }
        session.close();
        return listBL;
    }
    
    public void add(LuongThuong lt){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.save(lt);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    
    public void update(LuongThuong lt){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.update(lt);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
    public void delete(LuongThuong lt){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.delete(lt);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally{
            session.close();
        }
    }
}
