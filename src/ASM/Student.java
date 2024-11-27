package ASM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ma;
    private String ten;
    private String email;
    private String SDT;
    private boolean gioiTinh;
    private String diaChi;
    private String hinh;
    private float tiengAnh;
    private float tinHoc;
    private float GDTC;
    private float diemTB;
    
    public Student(String ma, String ten, String email, String SDT, boolean gioiTinh, String diaChi, String hinh, float tiengAnh, float tinHoc, float GDTC) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.SDT = SDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.hinh = hinh;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
    }
    public Student() {
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSDT() {
        return SDT;
    }
    public void setSDT(String SDT) {
        this.SDT = SDT;
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
    public String getHinh() {
        return hinh;
    }
    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    public float getTiengAnh() {
        return tiengAnh;
    }
    public void setTiengAnh(float tiengAnh) {
        this.tiengAnh = tiengAnh;
    }
    public float getTinHoc() {
        return tinHoc;
    }
    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }
    public float getGDTC() {
        return GDTC;
    }
    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }
    public float getDiemTB() {
        diemTB = (tiengAnh+tinHoc+GDTC)/3;
        return Math.round(diemTB * 100) / 100f;
    }
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    
    public Object[] QLSVToRow(){
        return new Object[]{
            ma,ten,email,SDT,gioiTinh,diaChi,hinh
        };
    }
    
    
    public Object[] DiemToRow(){
        return new Object[]{
            ma,ten,tiengAnh,tinHoc,GDTC, getDiemTB()
        };
    }
    
    public static List<Student> loadDataToDSSV(){
        String sql = "select*from student";// exec sp_selectAll
        List<Student> dssv = new ArrayList<>();
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Student s = new Student();
                s.setMa(rs.getString("MaSV"));
                s.setTen(rs.getString("HoTen"));
                s.setEmail(rs.getString("Email"));
                s.setSDT(rs.getString("SDT"));
                s.setGioiTinh(rs.getBoolean("GioiTinh"));
                s.setDiaChi(rs.getString("DiaChi"));
                s.setHinh(rs.getString("HinhAnh"));
                s.setTiengAnh(rs.getFloat("TiengAnh"));
                s.setTinHoc(rs.getFloat("TinHoc"));
                s.setGDTC(rs.getFloat("GDTC"));
                dssv.add(s);
            } return dssv;
        }catch(Exception e){
            return null;
        }
    }
}
