import java.util.*;

public class FuncionRecursiva{
  public static void main (String[] args){
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    long valorIngresado=teclado.nextLong();
    // hasta aca
    //long resultado=valorIngresado * 2;
   // System.out.println ("El doble del numero es " + resultado);
    System.out.println (factorial(valorIngresado));
     
  }
  
  public static long factorial(long fact){
     if (fact == 0)
      return 1;
     
    return fact * factorial(fact-1);
  }
}