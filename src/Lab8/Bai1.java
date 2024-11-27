package Lab8;

import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList ds = new ArrayList();
        ds.add(9);
        ds.add(3.5);
        ds.add("FPT");
        ds.add(true);
        
        int a = (int) ds.get(0);
        System.out.println(ds.toString());
    }
    
}
