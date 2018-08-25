import java.util.*;

public class Ejercicio8{
  public static void main (String[] args){
    System.out.println("Ingrese la cantidad de empleados a calcular");
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    int empleados=teclado.nextInt();
    float valorIngresado=0; // ya empiezo almacenar el valor de teclado
    int menor80=0;
    int i=0;
    int mayor80=0;
    for (i=0;i<empleados;i++){
      System.out.println("Ingrese el peso del empleado "+ i+1);
      valorIngresado=teclado.nextFloat();
      if (valorIngresado<80){
        menor80++;
      }else{
        mayor80++;
      }   
    }
    System.out.println("EMPLEADOS MENORES DE 80kgs " + menor80);
    System.out.println("EMPLEADOS MAYOR DE 80kgs " + mayor80);
  }
}
