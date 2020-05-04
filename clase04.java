
import java.util.*;
public class clase04 extends Thread{
 Scanner ped = new Scanner(System.in);
 public void run(){
 int n;
 int promedio = 0,nota=+1;
 int numero = 0;
 System.out.println("PROMEDIO DE NOTAS");
 while(nota < 6)
 { 
 System.out.println("Ingrese nota " + nota+ "°");
 n = ped.nextInt();
 try
 { Thread.sleep(1500);
 }
 catch (InterruptedException e) {
 }
 nota++;
 numero = numero + n;
 promedio = numero / nota;
 }
 System.out.println("El promedio de las notas es : "+ promedio );
 }
 public static void main(String []args){
clase04 ejer9 = new clase04();
 ejer9.start();
 }
}
