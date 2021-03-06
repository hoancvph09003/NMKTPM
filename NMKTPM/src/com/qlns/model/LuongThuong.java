package com.qlns.model;
// Generated 03/04/2020 11:10:44 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LuongThuong generated by hbm2java
 */
@Entity
@Table(name="LuongThuong"
    ,schema="dbo"
    ,catalog="QLNS"
)
public class LuongThuong  implements java.io.Serializable {


     private int maTinhLuong;
     private NhanVien nhanVien;
     private Integer ngayCong;
     private Integer tangCa;
     private Double tienThuong;
     private Double tienPhat;

    public LuongThuong() {
    }

	
    public LuongThuong(int maTinhLuong, NhanVien nhanVien) {
        this.maTinhLuong = maTinhLuong;
        this.nhanVien = nhanVien;
    }
    public LuongThuong(int maTinhLuong, NhanVien nhanVien, Integer ngayCong, Integer tangCa, Double tienThuong, Double tienPhat) {
       this.maTinhLuong = maTinhLuong;
       this.nhanVien = nhanVien;
       this.ngayCong = ngayCong;
       this.tangCa = tangCa;
       this.tienThuong = tienThuong;
       this.tienPhat = tienPhat;
    }
   
     @Id 

    
    @Column(name="maTinhLuong", unique=true, nullable=false)
    public int getMaTinhLuong() {
        return this.maTinhLuong;
    }
    
    public void setMaTinhLuong(int maTinhLuong) {
        this.maTinhLuong = maTinhLuong;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="maNhanVien", nullable=false)
    public NhanVien getNhanVien() {
        return this.nhanVien;
    }
    
    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    
    @Column(name="ngayCong")
    public Integer getNgayCong() {
        return this.ngayCong;
    }
    
    public void setNgayCong(Integer ngayCong) {
        this.ngayCong = ngayCong;
    }

    
    @Column(name="tangCa")
    public Integer getTangCa() {
        return this.tangCa;
    }
    
    public void setTangCa(Integer tangCa) {
        this.tangCa = tangCa;
    }

    
    @Column(name="tienThuong", precision=53, scale=0)
    public Double getTienThuong() {
        return this.tienThuong;
    }
    
    public void setTienThuong(Double tienThuong) {
        this.tienThuong = tienThuong;
    }

    
    @Column(name="tienPhat", precision=53, scale=0)
    public Double getTienPhat() {
        return this.tienPhat;
    }
    
    public void setTienPhat(Double tienPhat) {
        this.tienPhat = tienPhat;
    }




}


