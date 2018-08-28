import java.util.*;

public class Ejercicio12{
  public static void main (String[] args){
   
    /*
     * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

Entre 1 y 100 hay 25 números primos! Todos estos números son impartes, a excepción del número dos que es el único número primo que es par en 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
    Scanner sc = new Scanner(System.in);
    int a=0,i,n,j;
    System.out.println("Ingrese numero");
    n=sc.nextInt();
    for(i=1;i<(n+1);i++){
      if(n%i==0){
        a++;
        
      }
        for(j=1;j<(n-1);j++){
           if(n%j==0){
        a++;
        
      }
    }
    if(a!=2){
      System.out.println("No es Primo");
      System.out.println("los primos son "+a);
    }else{
      System.out.println("Si es Primo");
      System.out.println("los primos son "+a);
    }
 }
}
}