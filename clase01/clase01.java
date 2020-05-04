
package clase01;

import java.util.Scanner;

public class clase01 extends Thread{

Scanner dato = new Scanner(System.in);
String nombre, dia;
double hora;
public clase01(String nombre, String dia, double hora){
    this.nombre = nombre;
    this.dia = dia;
    this.hora = hora;
    System.out.println("Ingrese Nombre: ");
    nombre = dato.nextLine();
    System.out.println("Ingresar Dia: ");
    dia = dato.nextLine();
    System.out.println("Ingresar Hora");
    hora = dato.nextDouble();
}
@Override
public void run(){
    if(hora<13){
        System.out.println(nombre + "llego tarde el dia"+ dia);
    }else{
        System.out.println(nombre + "llego temprano el dia"+ dia);
    }
}

    public static void main(String[] args) throws Exception {

        Thread alum1 = new clase01("","",0);
        alum1.start();
        Thread.sleep(3000);
        Thread alum2 = new clase01("","",0);
        alum2.start();
        System.out.println("Hello Java");
    }
}