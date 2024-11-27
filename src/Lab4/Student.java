package Lab4;

public class Student {
    private String maSV;
    private String tenSV;
    private String email;
    private String sdt;
    private boolean gioiTinh;
    private String diaChi;

    public Student(String maSV, String tenSV, String email, String sdt, boolean gioiTinh, String diaChi) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public Student() {
    }
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String MaSV) {
        this.maSV = MaSV;
    }
    public String getTenSV() {
        return tenSV;
    }
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
    public Object[] toRow(){
        return new Object[]{
            maSV, tenSV, email, sdt, gioiTinh, diaChi
        };
    }
}
