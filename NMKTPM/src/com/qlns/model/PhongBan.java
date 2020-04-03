package com.qlns.model;
// Generated 03/04/2020 11:10:44 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PhongBan generated by hbm2java
 */
@Entity
@Table(name="PhongBan"
    ,schema="dbo"
    ,catalog="QLNS"
)
public class PhongBan  implements java.io.Serializable {


     private String maPhongBan;
     private String tenPhongBan;
     private String moTa;
     private Set<NhanVien> nhanViens = new HashSet<NhanVien>(0);

    public PhongBan() {
    }

	
    public PhongBan(String maPhongBan, String tenPhongBan, String moTa) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.moTa = moTa;
    }
    public PhongBan(String maPhongBan, String tenPhongBan, String moTa, Set<NhanVien> nhanViens) {
       this.maPhongBan = maPhongBan;
       this.tenPhongBan = tenPhongBan;
       this.nhanViens = nhanViens;
       this.moTa = moTa;
    }
   
     @Id 

    
    @Column(name="maPhongBan", unique=true, nullable=false, length=6)
    public String getMaPhongBan() {
        return this.maPhongBan;
    }
    
    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    
    @Column(name="tenPhongBan", nullable=false)
    public String getTenPhongBan() {
        return this.tenPhongBan;
    }
    
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
    @Column(name="mota", nullable=true)
    public String getMoTa() {
        return this.moTa;
    }
    
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="phongBan")
    public Set<NhanVien> getNhanViens() {
        return this.nhanViens;
    }
    
    public void setNhanViens(Set<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }
    @Override
    public String toString(){
        return this.maPhongBan;
    }

}

