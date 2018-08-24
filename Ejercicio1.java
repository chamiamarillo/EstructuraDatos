import java.util.*;

public class Ejercicio1{
  public static void main (String[] args){
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    int valorIngresado=teclado.nextInt();
    // hasta aca
    int resultado=valorIngresado * 2;
    System.out.println ("El doble del numero es " + resultado);
     
  }
}