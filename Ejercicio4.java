import java.util.*;

public class Ejercicio4{
  public static void main (String[] args){
    String dias=""; // utilizo esta variable para no estar imprimiendo en cada caso por pantalla
    System.out.println("Ingrese un valor entre 1 y 7 para mostrar los dias de la semana");
    // para leer por teclado
    Scanner teclado=new Scanner(System.in);
    int valorIngresado=teclado.nextInt();
    // hasta aca
    int resultado=valorIngresado;
    // estructura de seleccion multiple
      switch (resultado){
        case 1:
          dias=" corresponde al dia LUNES";
          break;
        case 2:
          dias=" corresponde al dia MARTES";
          break;
        case 3:
          dias=" corresponde al dia MIERCOLES";
          break;
        case 4:
          dias=" corresponde al dia JUEVES";
          break;
        case 5:
          dias=" corresponde al dia VIERNES";
          break;
        case 6:
          dias=" corresponde al dia SABADO";
          break;
        case 7:
          dias=" corresponde al dia DOMINGO";
          break;
        default:
          dias=" no corresponde a un dia de la semana";
          break;
      }
  System.out.println("la opcion " + resultado + dias);
  }
}






