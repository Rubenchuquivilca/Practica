package clase01;


public class clase03 extends Thread {
    String nombre;
    public clase03 (int prioridad,String nombre){
    this.nombre=nombre;
    setPriority(prioridad);
   }
    public void run(){
    for(int c=1;c<=50;c++){
    System.out.print(c+"mt ");
    yield(); 
    }
    System.out.println("\n Llego a la meta " + nombre);
   }
    static clase03 nombre1;
    static clase03 nombre2;
    static clase03 nombre3;
    public static void main(String []args) throws InterruptedException {
        nombre2 = new clase03(1," nom1 ");
    nombre1 = new clase03(5," nom2 ");
    nombre3 = new clase03(8," nom3 ");
    nombre2.start();
    nombre1.start();
    nombre3.start();
    nombre2.join();
    nombre1.join();
    nombre3.join();
    }
   }