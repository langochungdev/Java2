package Lab6;

public class TestThread {
    public static void main(String[] args) {
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();
        
        ot.start();
        try {
            ot.join();
        }catch(Exception e){}
        et.start();
    }
}
