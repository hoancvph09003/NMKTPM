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
public class BangTKNhanVien {
    private String maNhanVien;
    private String hoTen;
    private String phongBan;
    private Double tongLuong;

    public BangTKNhanVien(){
    }
    public BangTKNhanVien(String maNhanVien, String hoTen, String phongBan, Double tongLuong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.tongLuong = tongLuong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Double getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(Double tongLuong) {
        this.tongLuong = tongLuong;
    }
    
}
