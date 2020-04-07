/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.dao;

import com.qlns.model.LuongThuong;
import com.qlns.model.LuongThuongFake;
import com.qlns.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Admin
 */
public class LuongThuongDAO {

    public List<Object[]> getListLuongThuong() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        String hql = "SELECT nhanVien.maNhanVien, l.nhanVien.tenNhanVien, nhanVien.luongCoBan,l.nhanVien.phongBan.maPhongBan, ngayCong, tangCa, tienThuong, tienPhat FROM LuongThuong l";
        Query query = session.createQuery(hql);
        List<Object[]> list = query.list();
        session.close();
        return list;
    }
}
