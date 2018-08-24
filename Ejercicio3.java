import java.util.*;

public class Ejercicio3{
  public static void main (String[] args){
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    float valorIngresado=teclado.nextFloat();
    // hasta aca
    float resultado=valorIngresado;
    if (resultado==0){
     System.out.println ("El número es CERO"); 
    } else {
      if (resultado>0){
       System.out.println ("EL NUMERO ES POSITIVO"); 
      } else {
       System.out.println ("EL NUMERO ES NEGATIVO"); 
      }
    }
  }
}