CREATE DATABASE Lab4_Java2

CREATE TABLE STUDENT(
	MaSV varchar(10) not null primary key,
	HoTen nvarchar(50) not null,
	Email nvarchar(50) not null, 
	SoDT nvarchar(13) not null,
	GioiTinh bit,
	DiaChi nvarchar(150) not null
)

INSERT INTO STUDENT (MaSV, HoTen, Email, SoDT, GioiTinh, DiaChi) 
VALUES
('SV001', N'Nguyễn Văn A', 'nguyenvana@example.com', '0123456789', 1, N'Số 1, Đường ABC, Quận 1, TP.HCM'),
('SV002', N'Trần Thị B', 'tranthib@example.com', '0123456790', 0, N'Số 2, Đường DEF, Quận 2, TP.HCM'),
('SV003', N'Phạm Văn C', 'phamvanc@example.com', '0123456791', 1, N'Số 3, Đường GHI, Quận 3, TP.HCM'),
('SV004', N'Lê Thị D', 'lethid@example.com', '0123456792', 0, N'Số 4, Đường JKL, Quận 4, TP.HCM'),
('SV005', N'Nguyễn Văn E', 'nguyenvane@example.com', '0123456793', 1, N'Số 5, Đường MNO, Quận 5, TP.HCM'),
('SV006', N'Trần Thị F', 'tranthif@example.com', '0123456794', 0, N'Số 6, Đường PQR, Quận 6, TP.HCM'),
('SV007', N'Phạm Văn G', 'phamvang@example.com', '0123456795', 1, N'Số 7, Đường STU, Quận 7, TP.HCM'),
('SV008', N'Lê Thị H', 'lethih@example.com', '0123456796', 0, N'Số 8, Đường VWX, Quận 8, TP.HCM'),
('SV009', N'Nguyễn Văn I', 'nguyenvani@example.com', '0123456797', 1, N'Số 9, Đường YZA, Quận 9, TP.HCM'),
('SV010', N'Trần Thị J', 'tranthij@example.com', '0123456798', 0, N'Số 10, Đường BCD, Quận 10, TP.HCM');
