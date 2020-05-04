package clase01;


public class clase06 {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<15;i+=2) {
            System.out.println("==================================");
            
            System.out.println(i);
          System.out.println("====================================");
     
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=15;i+=2) {
            System.out.println("==================================");
            System.out.println(i);
            System.out.println("==================================");
  
        }
    }
}