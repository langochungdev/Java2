package Lab3;

import java.io.Serializable;

public class Staff implements Serializable{
    private String ten;
    private double luong;
    
    public Staff(String ten, double luong) {
        this.ten = ten;
        this.luong = luong;
    }
    public Staff() {
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
    public Object[] toRow(){
        return new Object[]{ten,luong};
    }
}
