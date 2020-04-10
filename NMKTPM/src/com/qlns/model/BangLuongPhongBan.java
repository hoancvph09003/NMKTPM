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
public class BangLuongPhongBan {
    String maPhongBan;
    String tenPhongBan;
    Double luongPhongBan;

    public BangLuongPhongBan() {
    }

    public BangLuongPhongBan(String maPhongBan, String tenPhongBan, Double luongPhongBan) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.luongPhongBan = luongPhongBan;
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

    public Double getLuongPhongBan() {
        return luongPhongBan;
    }

    public void setLuongPhongBan(Double luongPhongBan) {
        this.luongPhongBan = luongPhongBan;
    }
    
}
