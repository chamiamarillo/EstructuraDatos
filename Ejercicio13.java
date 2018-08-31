import java.util.*;

public class Ejercicio13{
  public static void main (String[] args){
    Scanner teclado=new Scanner(System.in);
    int tamanio=0;
    System.out.println("INGRESE EL TAMAÑO DEL CUADRADO");
    tamanio=teclado.nextInt();
    for (int i=1;i<=tamanio;i++){
      for (int j=1;j<=tamanio;j++){
        if (j==1 ||  j==tamanio || i==1 || i==tamanio){
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}