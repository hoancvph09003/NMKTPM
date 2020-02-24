if OBJECT_ID('QLNS') is not null
drop database QLNS
go

Create database QLNS
go

use QLNS
go

if OBJECT_ID('PhongBan') is not null
drop table PhongBan
go 

Create table PhongBan(
	maPhongBan varchar(6) not null,
	tenPhongBan nvarchar(50) not null,
	Constraint PK_PhongBan Primary key (maPhongBan)
)

if OBJECT_ID('ChucVu') is not null
drop table ChucVu
go 

Create table ChucVu(
	maChucVu varchar(6) not null,
	chucVu nvarchar(50) not null,
	Constraint PK_ChucVu Primary key (maChucVu)
)

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