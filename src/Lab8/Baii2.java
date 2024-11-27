package Lab8;
import java.util.ArrayList;

public class Baii2 {
    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        
        for(int i=1; i<=10; i++){
            ds.add(i);
        }
        
        ds.forEach((x)-> {System.out.println(x);});
    }
}
