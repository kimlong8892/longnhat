
USE master

GO

--Xóa database Quản lý bán hàng nếu như database đó tồn tại

DROP DATABASE IF EXISTS QLBH

GO

--Tạo database Quản lý bán hàng

CREATE DATABASE QLBH

GO

--Sử dụng database Quản lý bán hàng
USE QLBH

GO

--Tạo bảng Nhân viên
CREATE TABLE NHAN_VIEN(

	maNV VARCHAR(6) PRIMARY KEY,
	tenNV NVARCHAR(100) NOT NULL,
	matKhau VARCHAR(6) NOT NULL,
	chuc NVARCHAR(50) NOT NULL,
	quyen INT DEFAULT 0,
	ngayTao DATE DEFAULT GETDATE()
)

GO

INSERT INTO NHAN_VIEN(maNV,matKhau,tenNV,chuc,quyen) VALUES('061071','123456',N'Đỗ Quang Nhật',N'Nhân viên bán hàng',1)
INSERT INTO NHAN_VIEN(maNV,matKhau,tenNV,chuc,quyen) VALUES('061072','080998',N'Nguyễn Kim Long',N'Cửa hàng trưởng :v',0)

GO

--Tạo bảng Nhà cung cấp
CREATE TABLE NCC(

	maNCC VARCHAR(6) PRIMARY KEY,
	tenNCC NVARCHAR(100) NOT NULL UNIQUE,
	sdt CHAR(10) NOT NULL,
	diaChi NVARCHAR(100) NOT NULL,
	ngayTao Date DEFAULT GETDATE()
)

GO

INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('HSA',N'Hoa Sen','0767178241',N'183 Nguyễn Văn Trỗi, Phường 10, Phú Nhuận, Thành phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('HSB',N'Hoa Sen B','0985802039',N'131 đường G 6, Khu Dân Cư Vĩnh Lộc , Phường Bình Hưng Hòa B , Quận Bình Tân, Thành Phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('BK',N'Ba Khánh','0936638711',N' 85 Bà Huyện Thanh Quan, Phường 9, Quận 3, Thành phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('ABC',N'Á Châu ABC','0982660003',N'17 Đường 15, KP 1, Linh Đông, Thủ Đức, Thành phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('KD',N'Kinh Đô','0982660003',N'17 Đường 15, KP 1, Linh Đông, Thủ Đức, Thành phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('SL',N'Seas Link','0938956513',N'4A Đặng Tất, Tân Định, Quận 1, Thành phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('VNM',N'VinaMilk','0929789004',N'10 Tân Trào, Tân Phú, Quận 7, Thành phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('TNT',N'Trần Nguyên Thông','0836387111',N'13 Trần Hưng Đạo, Phường Nguyễn Thái Bình, Quận 1, Thành phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('CC',N'Coca Cola Việt Nam','0838961000',N'485 Xa lộ Hà Nội, Phường Linh Trung, Thủ Đức, Thành phố Hồ Chí Minh')
INSERT INTO NCC(maNCC,tenNCC,sdt,diaChi) VALUES('KTH',N'Kim Tân Hải Bia','0888295178',N'334 Nguyễn Văn Nghi, Phường 7, Quận Gò Vấp, TPHCM')--Bia

GO

--Tạo bảng Loại hàng
CREATE TABLE LOAI_HANG(

	maLoai VARCHAR(6) PRIMARY KEY,
	tenLoai NVARCHAR(100) NOT NULL UNIQUE,
	ngayTao DATE DEFAULT GETDATE()

)

GO

INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('FF1',N'Đồ ăn nhanh loại 1')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('SW',N'Sandwiches')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('RB',N'Rice ball')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('SS',N'Sushi')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('RM',N'Rice meal')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('SL',N'Salad')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('DS',N'Dessert')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('VF',N'Vegetables & Fruit')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('BR',N'Bread')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('DK',N'Drink')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('DM',N'Milk & Papaer packeaged drink')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('SN',N'Snack')
INSERT INTO LOAI_HANG(maLoai,tenLoai) VALUES('IC',N'Ice cream')

GO

--Tạo bảng Mặt hàng
CREATE TABLE MAT_HANG(

	maHang VARCHAR(6) NOT NULL PRIMARY KEY,
	tenHang NVARCHAR(100) NOT NULL,
	soLuong INT NOT NULL DEFAULT 0,
	dvt NVARCHAR(50) NOT NULL DEFAULT N'Chưa xác định',
	gia MONEY NOT NULL,
	maLoai VARCHAR(6) NOT NULL,
	maNCC VARCHAR(6) NOT NULL,
	ngayTao DATE NOT NULL DEFAULT GETDATE(),
	FOREIGN KEY (maLoai) REFERENCES LOAI_HANG(maLoai),
	FOREIGN KEY (maNCC) REFERENCES NCC(maNCC)
)

GO

INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('910579',N'Xúc xích hun khói',20,N'Cái',20000,'FF1','HSB')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('910346',N'Bánh giò',40,N'Cái',11000,'FF1','HSB')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('910344',N'Bánh bao trứng cút',40,N'Cái',14000,'FF1','HSB')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('110104',N'Sandwich trứng mayo',10,N'Cái',12000,'SW','HSA')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('110105',N'Sandwich thanh cua mayo',5,N'Cái',14000,'SW','HSA')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('110106',N'Sandwich xá xíu trứng',6,N'Cái',23000,'SW','HSA')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('110112',N'Sandwich gà karaage trứng',5,N'Cái',27000,'SW','HSA')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('110123',N'Sandwich cá ngừ mayo',10,N'Cái',17000,'SW','HSA')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('120329',N'Cơm gà nướng ngũ vị',3,N'Hộp',25000,'RM','HSB')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('120350',N'Cơm thịt bò hamburg',2,N'Hộp',35000,'RM','HSB')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('130123',N'Salad rong biển thanh cua',1,N'Hộp',16000,'SL','HSB')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('130091',N'Salad gà nướng áp chảo',2,N'Hộp',18000,'SL','HSB')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('140132',N'Chè bưởi',4,N'Ly',9000,'DS','HSA')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('140187',N'Chè bắp',3,N'Ly',9000,'DS','HSA')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('140231',N'Bánh su kem tươi',2,N'Ly',12000,'DS','HSA')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('210012',N'Bánh mì ABC sandwich lại',4,N'Bịch',19000,'BR','ABC')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('210023',N'Bánh mì ABC chà bông kẹp',3,N'Cái',20000,'BR','ABC')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('210320',N'Bánh mì bông lan Kinh Đô hạt chocolate',10,N'Cái',12000,'BR','KD')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('210066',N'Bánh mì Kinh Đô ổ dài nhân bơ sữa',10,N'Cái',7000,'BR','KD')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('240052',N'Aquafina 500ml',40,N'Chai',5000,'DK','SL')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('240053',N'Aquafina 1.5L',30,N'Chai',8000,'DK','SL')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('240275',N'Coca Cola 600ml',45,N'Chai',10000,'DK','CC')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('240072',N'C2 trà chanh',48,N'Chai',11000,'DK','CC')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('240276',N'Sprite chai 600ml',48,N'Chai',10000,'DK','CC')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('240061',N'Sting dâu tây',48,N'Chai',11000,'DK','CC')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('250026',N'Milo nước hộp 180ml',48,N'Hộp',9000,'DM','VNM')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('250090',N'Sữa TH ít đường',72,N'Hộp',9000,'DM','VNM')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('250039',N'Sữa chua VinaMilk có đường',72,N'Hộp',7000,'DM','VNM')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('250362',N'Sữa đậu nành Fami nguyên chất',72,N'Bịch',6000,'DM','VNM')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('310381',N'Snack cua xanh',10,N'Bịch',8000,'SN','TNT')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('310084',N'Snack bí đỏ',10,N'Bịch',7000,'SN','TNT')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('310178',N'Snack Oishi chay vị da heo quay',12,N'Bịch',6000,'SN','TNT')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('270199',N'Kem Paddle Pop dưa hấu',12,N'Cây',12000,'IC','TNT')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('270071',N'Kem MerinoX đậu xanh yến mạch',14,N'Cây',14000,'IC','TNT')
INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('270110',N'Kem Milo Chocolate TH',25,N'Cây',18000,'IC','TNT')

--INSERT INTO MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) VALUES('',N'',,N'',,'','')

GO



CREATE TABLE HOA_DON(

	maHD INT IDENTITY PRIMARY KEY,
	maNV VARCHAR(6) NOT NULL,
	ngayBan DATETIME NOT NULL DEFAULT GETDATE(),
	FOREIGN KEY (maNV) REFERENCES NHAN_VIEN(maNV)
)

GO

CREATE TABLE CHITIET_HOADON(

	maHD INT NOT NULL,
	maHang VARCHAR(6) NOT NULL,
	soLuong INT NOT NULL,
	gia MONEY NOT NULL
)

GO

CREATE TRIGGER AFTER_CTHD_INSERT ON CHITIET_HOADON
FOR INSERT
AS
BEGIN
	
	UPDATE MAT_HANG
	SET 
		soLuong = mh.soLuong - i.soLuong
	FROM
		MAT_HANG mh JOIN inserted i ON mh.maHang = i.maHang

END

GO

CREATE TRIGGER AFTER_NHANVIEN_DELETE ON NHAN_VIEN
FOR DELETE
AS
BEGIN
	
	ALTER TABLE HOA_DON NOCHECK CONSTRAINT all
	ALTER TABLE HOA_DON CHECK CONSTRAINT all

END

GO

select * from NCC

select * from LOAI_HANG

Select * from CHITIET_HOADON

select * from HOA_DON;

Select * from MAT_HANG 

Select * from NHAN_VIEN

Select top 1 maHD from HOA_DON ORDER BY  maHD DESC

Select hd.maHD,tenHang,ct.gia,ct.soluong,ngayban from HOA_DON hd INNER JOIN CHITIET_HOADON ct ON hd.MaHD = ct.MaHD LEFT JOIN MAT_HANG mh ON mh.maHang = ct.maHang