import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
     System.out.println("Sistema de secuencias numéricas v1.0");
     while(true){
     System.out.println("Seleccione una opción introduciendo el número de ella");
     System.out.println("1- Serie de Fibonacci");
     System.out.println("2- Serie de Padovan");
     System.out.println("3- Triángulo de Pascal");
     System.out.println("4- Salir");
     Scanner sc = new Scanner(System.in);
     String option = sc.next();
     try{
     if(option.equals("1")){
       System.out.println("Introduzca el número de elementos");
       String limit = sc.next();
       int limitint = Integer.parseInt(limit);
       if(limitint<=0){
         System.out.println("Número de elementos inválido");
       }
       else{
        fibonacci(limitint); 
       }
     } else if(option.equals("2")){
       System.out.println("Introduzca el número de elementos");
       String limit = sc.next();
       int limitint = Integer.parseInt(limit);
       if(limitint<=0){
         System.out.println("Número de elementos inválido");
       }
       else{
       padovan(limitint);
       }
     } else if(option.equals("3")){
       System.out.println("Introduzca el número de renglones");
       String limit = sc.next();
       int limitint = Integer.parseInt(limit);
       if(limitint<=0){
         System.out.println("Número de elementos inválido");
       }
       else{
       pascal(limitint);
       }
     } else if(option.equals("4")){
       System.out.println("bye bye");
       sc.close();
       break;
     } else{
       System.out.println("Introduzca una opción válida");
     }
     } catch(NumberFormatException e){
       System.out.println("Introduczca un límite válido");
     }
     
   }
  }
  
  public static void padovan(int limit){
    
    /*if(limit>3){
      
      return padovan(limit-2) + padovan(limit-3);
    } else if(limit<4 && limit>0){
      return 1;
    } else{
      return -1;
    }*/
    long t1 = 1, t2 = 1, t3=1;
        for (int i = 1; i <= limit; ++i)
        {
            System.out.print(t1 + ", ");

            long sum = t1 + t2;
            t1 = t2;
            t2 = t3;
            t3 = sum;
        }
        System.out.println();
  }

  public static void fibonacci(int limit){
    long t1 = 0, t2 = 1;
        for (int i = 1; i <= limit; ++i)
        {
            System.out.print(t1 + ", ");

            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
  }
  public static void pascal(int limit){
    for(int i = 0; i < limit; i++) {
         for(int j = 0; j <= limit-i; j++){
            System.out.print(" ");
         }
         for(int j = 0; j <= i; j++){
            long facti,i2=i,ij=i-j, factij, j2=j,factj;
            for(facti=1;i2>1;i2--){
              facti*=i2;
            }
            for(factij=1;ij>1;ij--){
              factij*=ij;
            }
            for(factj=1;j2>1;j2--){
              factj*=j2;
            }
            //System.out.println("facti:" + facti + "factij:" + factij + "factj:" + factj);
            long ncr = facti / ( factij * factj);
            System.out.print(" "+ncr);
         }
         System.out.println();
      }
  }
}