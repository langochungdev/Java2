package Test1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class NguoiHoc {
    private String maKH;
    private String hoTen;
    private boolean gioiTinh;
    private String ngaySinh;
    private String dienThoai;
    private String mail;
    private String maNV;
    private String ngayDK;
    private String ghiChu;

    public NguoiHoc(String maKH, String hoTen, boolean gioiTinh, String ngaySinh, String dienThoai, String mail, String maNV, String ngayDK, String ghiChu) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.mail = mail;
        this.maNV = maNV;
        this.ngayDK = ngayDK;
        this.ghiChu = ghiChu;
    }

    public NguoiHoc() {
    }
    
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.dienThoai = DienThoai;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(String ngayDK) {
        this.ngayDK = ngayDK;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
    public Object[] toRow(){
        return new Object[]{ maKH, hoTen, gioiTinh, ngaySinh, dienThoai, mail, maNV, ngayDK};
    }  
}
