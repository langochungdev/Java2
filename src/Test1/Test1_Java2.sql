create database Test1_java2


CREATE TABLE NhanVien (
    MaNV NVARCHAR(50) PRIMARY KEY,
    MatKhau NVARCHAR(50) NOT NULL,
    HoTen NVARCHAR(50) NOT NULL,  
    VaiTro BIT NOT NULL            
);


CREATE TABLE ChuyenDe (
    MaCD NCHAR(5) PRIMARY KEY,   
    TenCD NVARCHAR(50) NOT NULL, 
    HocPhi FLOAT NOT NULL,       
    ThoiLuong INT NOT NULL,     
    Hinh NVARCHAR(50) NOT NULL,  
    MoTa NVARCHAR(255) NOT NULL  
);


CREATE TABLE KhoaHoc (
    MaKH INT PRIMARY KEY IDENTITY(1,1),
    MaCD NCHAR(5) NOT NULL,            
    HocPhi FLOAT NOT NULL,             
    ThoiLuong INT NOT NULL,            
    NgayKG DATE NOT NULL,              
    GhiChu NVARCHAR(50),              
    MaNV NVARCHAR(50) NOT NULL,        
    NgayTao DATE NOT NULL,             
    CONSTRAINT FK_KhoaHoc_ChuyenDe FOREIGN KEY (MaCD) REFERENCES ChuyenDe(MaCD),
    CONSTRAINT FK_KhoaHoc_NhanVien FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);


CREATE TABLE NguoiHoc (
    MaNH NCHAR(7) PRIMARY KEY,        
    HoTen NVARCHAR(50) NOT NULL,      
    NgaySinh DATE NOT NULL,           
    GioiTinh BIT NOT NULL,            
    DienThoai NVARCHAR(50) NOT NULL,  
    Email NVARCHAR(50) NOT NULL,      
    GhiChu NVARCHAR(MAX),            
    MaNV NVARCHAR(50) NOT NULL,       
    NgayDK DATE NOT NULL,             
    CONSTRAINT FK_NguoiHoc_NhanVien FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);

ALTER TABLE NguoiHoc
ALTER COLUMN MaNV NVARCHAR(50) NULL;

ALTER TABLE NguoiHoc
ALTER COLUMN NgayDK DATE NULL;


CREATE TABLE HocVien (
    MaHV INT PRIMARY KEY IDENTITY(1,1), 
    MaKH INT NOT NULL,                  
    MaNH NCHAR(7) NOT NULL,            
    Diem FLOAT,                   
    CONSTRAINT FK_HocVien_KhoaHoc FOREIGN KEY (MaKH) REFERENCES KhoaHoc(MaKH),
    CONSTRAINT FK_HocVien_NguoiHoc FOREIGN KEY (MaNH) REFERENCES NguoiHoc(MaNH)
);



INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa)
VALUES
('CD001', 'Lập trình Java', 3000000, 60, 'java.png', 'Khóa học lập trình Java cơ bản'),
('CD002', 'Lập trình C#', 3500000, 75, 'csharp.png', 'Khóa học lập trình C# cơ bản'),
('CD003', 'Lập trình Python', 2800000, 50, 'python.png', 'Khóa học lập trình Python cơ bản'),
('CD004', 'Thiết kế web', 4000000, 80, 'web.png', 'Khóa học thiết kế website'),
('CD005', 'Học máy cơ bản', 4500000, 90, 'ml.png', 'Khóa học học máy cơ bản'),
('CD006', 'Lập trình JavaScript', 3200000, 70, 'js.png', 'Khóa học lập trình JavaScript'),
('CD007', 'SQL Server', 3000000, 60, 'sql.png', 'Khóa học SQL Server'),
('CD008', 'Khoa học dữ liệu', 5000000, 100, 'data.png', 'Khóa học khoa học dữ liệu'),
('CD009', 'Phân tích dữ liệu', 4800000, 95, 'data_analysis.png', 'Khóa học phân tích dữ liệu'),
('CD010', 'Quản trị dự án', 4000000, 85, 'pm.png', 'Khóa học quản trị dự án');


INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro)
VALUES
('NV001', '123456', 'Nguyen Van A', 1),
('NV002', '123456', 'Tran Thi B', 0),
('NV003', '123456', 'Le Van C', 0),
('NV004', '123456', 'Pham Thi D', 1),
('NV005', '123456', 'Hoang Van E', 0),
('NV006', '123456', 'Nguyen Thi F', 1),
('NV007', '123456', 'Tran Van G', 0),
('NV008', '123456', 'Le Thi H', 1),
('NV009', '123456', 'Pham Van I', 0),
('NV010', '123456', 'Hoang Thi J', 1);


INSERT INTO KhoaHoc ( MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao)
VALUES
('CD001', 3000000, 60, '2024-01-10', 'Lớp 1', 'NV001', '2024-01-01'),
('CD002', 3500000, 75, '2024-02-15', 'Lớp 2', 'NV002', '2024-02-01'),
('CD003', 2800000, 50, '2024-03-20', 'Lớp 3', 'NV003', '2024-03-01'),
('CD004', 4000000, 80, '2024-04-25', 'Lớp 4', 'NV004', '2024-04-01'),
('CD005', 4500000, 90, '2024-05-30', 'Lớp 5', 'NV005', '2024-05-01'),
('CD006', 3200000, 70, '2024-06-10', 'Lớp 6', 'NV006', '2024-06-01'),
('CD007', 3000000, 60, '2024-07-15', 'Lớp 7', 'NV007', '2024-07-01'),
('CD008', 5000000, 100, '2024-08-20', 'Lớp 8', 'NV008', '2024-08-01'),
('CD009', 4800000, 95, '2024-09-25', 'Lớp 9', 'NV009', '2024-09-01'),
('CD010', 4000000, 85, '2024-10-30', 'Lớp 10', 'NV010', '2024-10-01');


INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK)
VALUES
('NH001', 'Nguyen Van A', '1995-01-15', 1, '0901234567', 'a@gmail.com', 'Ghi chú 1', 'NV001', '2024-01-01'),
('NH002', 'Tran Thi B', '1998-02-20', 0, '0901234568', 'b@gmail.com', 'Ghi chú 2', 'NV002', '2024-02-01'),
('NH003', 'Le Van C', '1997-03-25', 1, '0901234569', 'c@gmail.com', 'Ghi chú 3', 'NV003', '2024-03-01'),
('NH004', 'Pham Thi D', '1996-04-30', 0, '0901234570', 'd@gmail.com', 'Ghi chú 4', 'NV004', '2024-04-01'),
('NH005', 'Hoang Van E', '1999-05-05', 1, '0901234571', 'e@gmail.com', 'Ghi chú 5', 'NV005', '2024-05-01'),
('NH006', 'Nguyen Thi F', '2000-06-10', 0, '0901234572', 'f@gmail.com', 'Ghi chú 6', 'NV006', '2024-06-01'),
('NH007', 'Tran Van G', '2001-07-15', 1, '0901234573', 'g@gmail.com', 'Ghi chú 7', 'NV007', '2024-07-01'),
('NH008', 'Le Thi H', '2002-08-20', 0, '0901234574', 'h@gmail.com', 'Ghi chú 8', 'NV008', '2024-08-01'),
('NH009', 'Pham Van I', '2003-09-25', 1, '0901234575', 'i@gmail.com', 'Ghi chú 9', 'NV009', '2024-09-01'),
('NH010', 'Hoang Thi J', '2004-10-30', 0, '0901234576', 'j@gmail.com', 'Ghi chú 10', 'NV010', '2024-10-01');


INSERT INTO HocVien (MaKH, MaNH, Diem)
VALUES
(1, 'NH001', 8.5),
(2, 'NH002', 7.0),
(3, 'NH003', 9.0),
(4, 'NH004', 6.5),
(5, 'NH005', 8.0),
(6, 'NH006', 7.5),
(7, 'NH007', 8.2),
(8, 'NH008', 9.5),
(9, 'NH009', 6.8),
(10, 'NH010', 7.9);



