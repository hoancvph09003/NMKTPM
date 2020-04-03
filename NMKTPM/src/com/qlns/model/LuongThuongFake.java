/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.model;

/**
 *
 * @author Admin
 */
public class LuongThuongFake {
     private String maNhanVien;
     private String hoTen;
     private String phongBan;
     private Integer ngayCong;
     private Integer tangCa;
     private Double tienThuong;
     private Double tienPhat;
     private Double luongCoBan;

    public LuongThuongFake() {
    }

    public LuongThuongFake(String maNhanVien, String hoTen, String phongBan, Integer ngayCong, Integer tangCa, Double tienThuong, Double tienPhat,Double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.ngayCong = ngayCong;
        this.tangCa = tangCa;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCoBan = luongCoBan;
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

    public Integer getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(Integer ngayCong) {
        this.ngayCong = ngayCong;
    }

    public Integer getTangCa() {
        return tangCa;
    }

    public void setTangCa(Integer tangCa) {
        this.tangCa = tangCa;
    }

    public Double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(Double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public Double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(Double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public Double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
}
