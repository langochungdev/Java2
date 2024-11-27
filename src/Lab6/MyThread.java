package Lab6;

public class MyThread implements Runnable{

    @Override
    public void run() {
       for(int i=1; i<=10; i++){
           System.out.println(i);
           try {
               Thread.sleep(500);
           }catch(Exception e){}
       }
    }
    
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread th1 = new Thread(mt);
        Thread th2 = new Thread(mt);
        
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);
        
        th1.start();
        th2.start();
    }
}
