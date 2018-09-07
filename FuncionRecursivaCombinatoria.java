import java.util.*;

public class FuncionRecursivaCombinatoria{
  public static void main (String[] args){
    // para leer por teclado
    System.out.println("INGRESE LOS NUMERO A CALCULAR LA COMBINATORIA");
    Scanner teclado=new Scanner(System.in);
    long n=teclado.nextLong();
    long r=teclado.nextLong();
    // hasta aca
    // PARA VALIDAR LA CARGA CORRECTA DE VALORES
    if (r>=0 && n>=r){
      System.out.println (factorial(n)/(factorial(n-r)*factorial(r)));
    }else{ System.out.println("ERROR -1 VALORES ERRONEOS"); }
  }
  
  public static long factorial(long fact){
     if (fact == 0)
      return 1;
     
    return fact * factorial(fact-1);
  }
}