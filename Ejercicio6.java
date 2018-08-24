import java.util.*;

public class Ejercicio6{
  public static void main (String[] args){
    System.out.println("Ingrese n numero reales y cuando coloque un 0 mostrar la suma por pantalla");
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    float valorIngresado=teclado.nextFloat();
    // hasta aca
    float resultado=valorIngresado; // ya empiezo almacenar el valor de teclado
    for (;valorIngresado!=0;){
      valorIngresado=teclado.nextFloat();
      resultado=resultado+valorIngresado; // para poder salir del for la variable valorIngresado almacena lo que carga en teclado   
    }
    System.out.println("La suma de de los numeros es " + resultado);
  }
}