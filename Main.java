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
     if(option.equals("1")){
       
     } else if(option.equals("2")){
       
     } else if(option.equals("3")){
       
     } else if(option.equals("4")){
       break;
     } else{
       System.out.println("Introduzca una opción válida");
     }
      
     
   }
  }
}