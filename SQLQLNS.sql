if OBJECT_ID('QLNS') is not null
drop database QLNS
go

Create database QLNS
go

use QLNS
go

if OBJECT_ID('sp_TKLuong') is not null
drop Procedure sp_TKLuong
go

Create Procedure sp_TKLuong
As
	Select SQ.maPhongBan, SQ.tenPhongBan, SUM(TongLuong) as LuongTheoPhong 
	FROM (Select PhongBan.maPhongBan, PhongBan.tenPhongBan, ngayCong*NhanVien.luongCoBan as TongLuong 
			FROM LuongThuong inner join NhanVien on LuongThuong.maNhanVien = NhanVien.maNhanVien
							 inner join PhongBan on PhongBan.maPhongBan = NhanVien.maPhongBan) as SQ
	Group by SQ.maPhongBan, SQ.tenPhongBan
Go

if OBJECT_ID('PhongBan') is not null
drop table PhongBan
go 

Create table PhongBan(
	maPhongBan varchar(6) not null,
	tenPhongBan nvarchar(50) not null,
	mota nvarchar(200) null,
	Constraint PK_PhongBan Primary key (maPhongBan)
)

insert into PhongBan(maPhongBan, tenPhongBan, mota) values  ('KT', N'Kinh Tế', '1231')
insert into PhongBan(maPhongBan, tenPhongBan, mota) values  ('NS', N'Nhân sự', '32131')

if OBJECT_ID('ChucVu') is not null
drop table ChucVu
go 

Create table ChucVu(
	maChucVu varchar(6) not null,
	chucVu nvarchar(50) not null,
	Constraint PK_ChucVu Primary key (maChucVu)
)

insert into ChucVu(maChucVu, chucVu) values ('TP', 'Trưởng phòng')
insert into ChucVu(maChucVu, chucVu) values ('NV', 'Nhân viên')
insert into ChucVu(maChucVu, chucVu) values ('GD', 'Giám đốc')
insert into ChucVu(maChucVu, chucVu) values ('BV', 'Bảo vệ')

if OBJECT_ID('NhanVien') is not null
drop table NhanVien
go 

Create table NhanVien(
	maNhanVien varchar(6) not null,
	matKhau varchar(20) not null,
	tenNhanVien nvarchar(50) not null,
	maPhongBan varchar(6) not null,
	maChucVu varchar(6) not null,
	luongCoBan float not null,
	ngaySinh date not null,
	diaChi nvarchar(200) not null,
	email varchar(100) not null,
	Constraint PK_NhanVien Primary key (maNhanVien),
	Constraint FK_NhanVien_PhongBan Foreign key (maPhongBan) references PhongBan(maPhongBan),
	Constraint FK_NhanVien_ChucVu Foreign key (maChucVu) references ChucVu(maChucVu)
)
insert into NhanVien(maNhanVien, matKhau, tenNhanVien, maPhongBan, maChucVu, luongCoBan, ngaySinh, diaChi, email) values ('NV01', 'quan','Hoang Quan', 'KT', 'TP', 1000000, '1-1-1998','Thai Binh','a@gmail.com')

if OBJECT_ID('LuongThuong') is not null
drop table LuongThuong
go 

Create table LuongThuong(
	maTinhLuong int identity not null,
	maNhanVien varchar(6) not null,
	ngayCong int null,
	tangCa int null,
	tienThuong float null,
	tienPhat float null,
	Constraint PK_LuongThuong Primary key (maTinhLuong),
	Constraint FK_LuongThuong_NhanVien Foreign key (maNhanVien) references NhanVien(maNhanVien)
)

insert into LuongThuong (maNhanVien, ngayCong, tangCa, tienThuong, tienPhat) values ('NV01', 20, 10, 100000, 50000)