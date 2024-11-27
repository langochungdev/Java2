package Lab6;

public class OddThread extends Thread{
@Override
    public void run() {
        for(int i=1; i<=15; i+=2){
            System.out.println("OddThread "+ i);
            try {
                Thread.sleep(100);
            }catch(Exception e){
            }
        }
    }
 
}
