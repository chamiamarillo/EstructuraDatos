import java.util.*;

public class Ejercicio10{
  public static void main (String[] args){
    //System.out.println("Ingrese un numero para jugar a la adivinanza");
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    //int valorIngresado=teclado.nextInt();
    // AHORA USO LA FUNCION RAMDON
    int valorIngresado = (int)(Math.random()*10)+1;
    int carga=0;
    int contador=0;
    while (carga!=valorIngresado){
      System.out.println("Ingrese el numero");
      carga=teclado.nextInt();
      if (carga>valorIngresado){
        System.out.println("EL NUMERO ES MENOR AL QUE USTED INGRESO");
      }else{
        if (carga<valorIngresado){
          System.out.println("EL NUMERO ES MAYOR AL QUE USTED INGRESO");
        }else{
          System.out.println("FELICIDADES ENCONTRO EL NUMERO: "+valorIngresado);
          System.out.println("FELICIDADES ENCONTRO EL NUMERO EN "+contador+" veces");
        }
      }
      contador++;
    }
    
  }
}