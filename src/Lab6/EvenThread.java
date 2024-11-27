package Lab6;

public class EvenThread extends Thread{
@Override
    public void run() {
        for(int i=2; i<=15; i+=2){
            System.out.println("EvenThread "+ i);
            try {
                Thread.sleep(150);
            }catch(Exception e){
            }
        }
    }
}
