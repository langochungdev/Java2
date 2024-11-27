package Lab2;

public class Student {
    private String ten;
    private double diem;
    private String khoaHoc;
    public Student(String ten, double diem, String khoaHoc) {
        this.ten = ten;
        this.diem = diem;
        this.khoaHoc = khoaHoc;
    }
    public Student() {
    }
    
    
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public double getDiem() {
        return diem;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
    public String getKhoaHoc() {
        return khoaHoc;
    }
    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    
    
    public String getXepHang(){
        if(diem<3) return "kem";
        if(diem<5) return "yeu";
        if(diem<6.5) return "trung binh";
        if(diem<7.5) return "kha";
        if(diem<9) return "gioi";
        return "xuat sac";
    }
    
    public boolean getThuong(){
        return diem>=7.5;
    }
    
    public Object[] toRow(){
        return new Object[]{
            ten,diem,khoaHoc,getXepHang(),getThuong() ? "co" : "khong"
        };
    }
}
