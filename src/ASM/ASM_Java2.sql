create database ASM_Java2

create table users(
	Username varchar(50) not null primary key,
	Password varchar(50) not null,
	role varchar(50) not null )

insert into users
values('gv','gv123','gv'),
	('cbdt','cbdt123','cbdt')


create table student(
	MaSV nvarchar(10) primary key,
	HoTen nvarchar(50),
	Email nvarchar(150),
	SDT varchar(13),
	GioiTinh bit,
	DiaChi nvarchar(150),
	HinhAnh nvarchar(250),
	TiengAnh float,
	TinHoc float,
	GDTC float)

INSERT INTO student
VALUES
('SV001', 'Nguyen Van A', 'nguyenvana@gmail.com', '0901234567', 1, '123 Le Loi, Ha Noi', 'hinh1.jpg', 8.5, 7.0, 9.0),
('SV002', 'Tran Thi B', 'tranthib@gmail.com', '0902234567', 0, '45 Tran Phu, Da Nang', 'hinh2.jpg', 7.5, 8.0, 8.5),
('SV003', 'Le Van C', 'levanc@gmail.com', '0903234567', 1, '67 Hai Ba Trung, TP HCM', 'hinh3.jpg', 6.5, 7.0, 7.5),
('SV004', 'Pham Thi D', 'phamthid@gmail.com', '0904234567', 0, '89 Nguyen Hue, Hue', 'hinh4.jpg', 9.0, 8.5, 9.5),
('SV005', 'Hoang Van E', 'hoangvane@gmail.com', '0905234567', 1, '101 Ly Thuong Kiet, Quang Ninh', 'hinh5.jpg', 7.0, 6.5, 7.0),
('SV006', 'Vu Thi F', 'vuthif@gmail.com', '0906234567', 0, '32 Le Thanh Ton, Hai Phong', 'hinh6.jpg', 8.0, 7.5, 8.5),
('SV007', 'Ngo Van G', 'ngovang@gmail.com', '0907234567', 1, '15 Le Hong Phong, Ha Noi', 'hinh7.jpg', 6.0, 6.0, 7.0),
('SV008', 'Bui Thi H', 'buithih@gmail.com', '0908234567', 0, '120 Tran Quoc Toan, Da Nang', 'hinh8.jpg', 7.5, 8.0, 8.5),
('SV009', 'Dang Van I', 'dangvani@gmail.com', '0909234567', 1, '75 Vo Thi Sau, Vung Tau', 'hinh9.jpg', 9.0, 8.5, 9.5),
('SV010', 'Nguyen Thi K', 'nguyenthik@gmail.com', '0910234567', 0, '30 Nguyen Dinh Chieu, Binh Duong', 'hinh10.jpg', 8.0, 7.0, 8.5);

