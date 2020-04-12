/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.model;

/**
 *
 * @author Quan
 */
public class BangTKLuongPhong {
    String maPhongBan;
    String tenPhongBan;
    Double tongLuong;

    public BangTKLuongPhong() {
    }

    public BangTKLuongPhong(String maPhongBan, String tenPhongBan, Double tongLuong) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.tongLuong = tongLuong;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public Double getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(Double tongLuong) {
        this.tongLuong = tongLuong;
    }
    
}
