import java.util.*;

public class Ejercicio2{
  public static void main (String[] args){
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    double valorIngresado=teclado.nextDouble();
    // hasta aca
    double resultado=valorIngresado % 2;
    if (resultado==0){
     System.out.println ("El número es PAR"); 
    } else {
      System.out.println ("En número es IMPAR");
    }
  }
}