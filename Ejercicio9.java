import java.util.*;

public class Ejercicio9{
  public static void main (String[] args){
    System.out.println("Ingrese cantidad de numeros a trabajar");
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    int valorIngresado=teclado.nextInt();
    // hasta aca
    double carga=0;
    int contador=1;
    double minimo=0, maximo=0, promedio=0;
    System.out.println("Ingrese el numero "+contador);
    carga=teclado.nextDouble(); // con esto teclado.nextDouble() directamente sumo lo que ingresa por teclado
    minimo=carga;
    maximo=carga;
    promedio=carga;
    for (contador=1;contador<valorIngresado;contador++){
      System.out.println("Ingrese el numero "+(contador+1));
      carga=teclado.nextDouble();    
      if (minimo>carga){
        minimo=carga;
      }
      if (maximo<carga){
        maximo=carga;
      }
      promedio=promedio+carga;  
    }
   System.out.println("EL MINIMO ES: " + minimo);
   System.out.println("EL MAXIMO ES: " + maximo);
   System.out.println("EL PROMEDIO ES: " + (promedio/valorIngresado));
  }
}