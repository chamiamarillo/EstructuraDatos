import java.util.*;

public class Ejercicio7{
  public static final double PI=3.14159265;
  public static void main (String[] args){
    System.out.println("Ingrese el radio de un circulo");
    Scanner teclado=new Scanner(System.in);
    double valorIngresado=teclado.nextDouble();
    double resultado=0;
    int opcion=0;
    if (valorIngresado<=0){
      System.out.println ("ERROR EL RADIO NO PUEDE SER MENOR O IGUAL A 0");
    }else{
      System.out.println ("ELIJA UNA OPCION");
      System.out.println ("1 - CALCULAR PERIMETRO");
      System.out.println ("2 - CALCULAR AREA");
      opcion=teclado.nextInt();
      switch (opcion){
        case 1:
          resultado=2*PI*valorIngresado;
          System.out.println ("El PERIMETRO es "+resultado);
          break;
        case 2:
          resultado=PI*Math.pow(valorIngresado,2);
          System.out.println ("El AREA es "+resultado);
          break;
      }
    }
  }
}