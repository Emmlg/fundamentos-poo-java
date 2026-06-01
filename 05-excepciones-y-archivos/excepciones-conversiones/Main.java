

import java.util.Scanner;


public class Ejecucion {
    
   static Scanner leer=new Scanner(System.in);
    static float dato;
    
     public static void getDatosEntradas(){

       System.out.print("Ingrese la cantidad: ");
          do{
           dato=leer.nextFloat();
           }while(dato<0);
  }
    
    // *-*-*-*-*-*-*-*-*-*- EJECUCION DEL PROGRAMA -*-*-*-*-*-*-*
    public static void main(String[] args) {
        
 int menu,menu1 = 0; 
 
       // creacion del objeeto   
        Entero objE= new Entero(dato);     
        Decimal objD=new Decimal(dato);
      
       System.out.println(objE.informacion() );  
       
         // ciclo para repetir el programa
    do{       
      
         System.out.println(objE.menuPrincipal());
        do{
            System.out.print("Que desea hacer ?: ");
           menu=leer.nextInt();          
          }while(menu<=0||menu>3  );
        
     switch(menu){
     
        case 1:  getDatosEntradas();
                  objE.cifraGeneral=dato;
                  objD.cifraGeneral=dato;
                  System.out.println( objD.informacion() );
                  do{ 
                    System.out.print("Escoge las siguientes opciones:\n");
                    menu1=leer.nextInt();
                    }while(menu1<=0 ||menu1>4);
                
                switch(menu1){
                  case 1: System.out.println("\nEl numero binario es: "  + objE.conversionB() + objD.conversionB()
                                           + "\nEl numero Octal es: "    + objE.conversionO() + objD.conversionO()
                                           + "\nEl numero Hexadecimal: " + objE.conversionH() + objD.conversionH() ); break;
                                           
                  case 2: System.out.print("El numero binario es : "     +objE.conversionB() +objD.conversionB()+"\n");
                  break;
                  case 3: System.out.print("El numero Hexadecimal es: "  +objE.conversionH() +objD.conversionH()+"\n");
                  break;
                  case 4: System.out.print("El numero octal es: "        +objE.conversionO() +objD.conversionO()+"\n");
                  break;
                 }
        break;     
        

        case 2:   System.out.println("Gracias por usar el programa..");
        break;
                        

     }
    
   }while(menu!=2);            
                        

   
}}// FIn de la CLase EJECUCION


