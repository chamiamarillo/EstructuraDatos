import java.util.*;

public class Ejercicio5{
  public static void main (String[] args){
    System.out.println("Ingrese un numero entre 1 y 100 para para sumarlos y mostrar por pantalla");
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    double valorIngresado=teclado.nextDouble();
    // hasta aca
    double resultado=0;
    int contador=0;
    while (contador<valorIngresado){
     contador++;
     resultado=resultado+teclado.nextDouble(); // con esto teclado.nextDouble() directamente sumo lo que ingresa por teclado
    }
    System.out.println("La suma de de los numeros es " + resultado);
  }
}