package Lab5;

public class SanPham {
    private String ma;
    private String ten;
    private double donGia;
    private int soLuong;
    private String loai;

    public SanPham(String ma, String ten, double donGia, int soLuong, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.loai = loai;
    }

    public SanPham() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    
    public Object[] toRow(){
        return new Object[]{
            ma, ten, loai
        };
    }
}
