class Funciones{
  
   public static long Factorial(long valor){
     long fact=1, i=0;
     if (valor<0){
       return -1;
     }else{ 
       if (valor==0){
         return 1;
       }else{
         for (i=valor;i>0;i--){
           fact=fact*i;   
         }
       }
     }
     return fact;
   }
}

