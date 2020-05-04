package clase01;

public class clase02 extends Thread{
    public void run(){
    for(int num =1; num<=25;num++){
    System.out.print(" " +num+" ");
    try {
    sleep (2000);
    }catch(InterruptedException e){
    }
    }
    }
    public static void main(String []args){
        clase02 ejer = new clase02();
    ejer.start();
    }
   }