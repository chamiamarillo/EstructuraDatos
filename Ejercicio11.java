import java.util.*;

public class Ejercicio11{
  public static void main (String[] args){
    System.out.println("Ingrese la tabla de multiplicar a mostrar");
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    int a=teclado.nextInt();
    int b, c, d ;  
    b=0 ; 
    c=0 ; 
    d=0 ; 
    System.out.println ("La tabla del " +a+ " es : " ) ; 
    b=1; 
    while (b <= 10) { 
      c= (a*b) ; 
      System.out.println (a+ "X" +b+ "=" +c ) ; 
      b++; 
    } 
    a++ ;
  } 
}