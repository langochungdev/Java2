create database Lab5_Java2


-- san pham 
create table loaisanpham(
	MaLoai int identity primary key,
	TenLoai nvarchar(50) not null
)

create table sanpham(
	MaSanPham nvarchar(10) primary key,
	TenSanPham nvarchar(50),
	DonGia money,
	SoLuong int,
	MaLoai int
)

alter table sanpham 
add constraint fk_sanpham_MaLoai
foreign key (MaLoai) references loaisanpham(MaLoai)


INSERT INTO LOAISANPHAM (TenLoai) 
VALUES 
    (N'Điện thoại'),
    (N'Máy tính bảng'),
    (N'Laptop'),
    (N'Tai nghe'),
    (N'Sạc dự phòng')

select MaSanPham, TenSanPham, DonGia, SoLuong, TenLoai
from sanpham join loaisanpham on sanpham.MaLoai = loaisanpham.MaLoai

UPDATE sanpham SET TenSanPham = ?, DonGia = ?, SoLuong =?, TenLoai = ? WHERE MaSanPham =? 

INSERT INTO SANPHAM (MaSanPham, TenSanPham, DonGia, SoLuong, MaLoai) 
VALUES 
    (N'SP001', N'iPhone 13', 20000000, 50, 1),
    (N'SP002', N'Samsung Galaxy S21', 18000000, 30, 1),
    (N'SP003', N'iPad Air', 15000000, 20, 2),
    (N'SP004', N'Surface Pro 7', 25000000, 15, 3),
    (N'SP005', N'MacBook Pro', 30000000, 10, 3),
    (N'SP006', N'AirPods Pro', 5000000, 60, 4),
    (N'SP007', N'Sony WH-1000XM4', 7000000, 25, 4),
    (N'SP008', N'Anker PowerCore', 800000, 100, 5),
    (N'SP009', N'Xiaomi Power Bank', 600000, 80, 5),
    (N'SP010', N'Galaxy Tab S7', 17000000, 12, 2);

-- thu vien 

CREATE TABLE BOOKS (
	ID INT IDENTITY PRIMARY KEY,
	TITLE NVARCHAR(50),
	PRICE FLOAT
)

INSERT INTO BOOKS (TITLE, PRICE)
VALUES (N'Lập Trình C', 100),
		(N'Lập Trình Java', 200),
		(N'Lập Trình C#', 150)
