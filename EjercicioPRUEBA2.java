public class EjercicioPRUEBA2{
  public static void main (String[] args){
    Fecha cumple= new Fecha();  // new hace que la maquina recerve la direccion en memoria del tamaño de la Fecha (declaracion de variable creada por el usuario)
    System.out.println(cumple.dia+" "+" "+cumple.mes+" "+cumple.anio);
    Fecha cumple2=setCumpleanios(cumple);
    System.out.println(cumple2.dia+" "+cumple2.mes+" "+cumple2.anio);
    setCumpleanios2(cumple);
    System.out.println(cumple.dia+" "+cumple.mes+" "+cumple.anio);
      
  }
  public static Fecha setCumpleanios(Fecha cumple){
    cumple.dia=16;
    cumple.mes=05;
    cumple.anio=1969;
    return cumple;
  }
  
   public static void setCumpleanios2(Fecha cumple){
    cumple.dia=16;
    cumple.mes=05;
    cumple.anio=1969;
  }
}