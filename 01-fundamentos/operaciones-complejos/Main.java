/*
Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero
 */

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Emmanuel lopez 2/julio 2022
 */
public class Main {
    static  Scanner tecla=new Scanner(System.in); 
   static double nr1,nr2,ni1,ni2;
   
    public static void getDatos(){
    nr1=0;nr2=0;ni1=0;ni2=0;

    System.out.print("Escribe el numero real 1 : ");
    nr1=tecla.nextDouble();
    System.out.print("Escribe el numero Imaginario 1 :");
    ni1=tecla.nextDouble();
    System.out.print("Escribe el numero real 2: ");
    nr2=tecla.nextDouble();
    System.out.print("Escribe el numero Imaginario 2 :");
    ni2=tecla.nextDouble();
    }
    
    public static void main(String[] args) {
 
   String igualdad;
      
   int menu = 0;    
   
   do{
     Numero_Complejo operacion = null;  
   System.out.println("\n\tMenu \n"
      + "1. Sumar dos números complejos\n" +
        "2. Multiplicar 2 números complejos\n" +
        "3. Comparar 2 números complejos (iguales o no)\n" +
        "4. Multiplicar un número complejos por un entero\n"
      + "5.Salir");
        System.out.print("\nEscribe la opcion:");
        menu=tecla.nextInt();
       
    switch(menu){
    case 1: getDatos();operacion=new Numero_Complejo(nr1, nr2, ni1, ni2);
            System.out.println("La suma es: "+operacion.sumaDeNumComplejos());
        break;
    case 2: getDatos(); operacion=new Numero_Complejo(nr1, nr2, ni1, ni2);
           System.out.println("La multiplicacion es: "+operacion.productoNumComplejo());
        break;
    case 3: getDatos();operacion=new Numero_Complejo(nr1, nr2, ni1, ni2);
                 
           if(operacion.comprobarIgualdadNumComplejos()==true){
            igualdad= "Iguales";
           }else{
               igualdad="Diferentes";
           }System.out.println("Los numeros son: "+ igualdad);
        break;
    case 4: System.out.println("ingresa el numero real:");
            double numR=tecla.nextDouble();
            System.out.println("Ingresa el numero imaginario: ");
            double numI=tecla.nextDouble();
            operacion=new Numero_Complejo(numR, numI);
           System.out.println("La multiplicacion es: "+ operacion.productoNumImaConNumReal());
        break;
    case 5: System.out.println("Gracias por usar el Programa :) ");
        break;
        default: System.out.println("Error!, digite numeros del 1-5");

    }    
   }while(menu!=5);  
        
    }    
}
