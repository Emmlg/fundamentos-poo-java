/**
 * EJERCICIO: comparativa-vehiculos | Main
 * ---------------------------------------------------------------
 * Concepto: Ejercicios de Refuerzo en POO
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de comparativa-vehiculos.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
/*

 */

import java.util.Scanner;


public class Main {
    
    
    public static int indiceCocheMBarato(Vehiculo coche[]){
    float precio;
    int indice = 0;
    
    precio=coche[0].getPrecio(); // en la variable precio guradamos el precio del primer objeto
    
    for(int i=1;i<coche.length;i++){
       if(coche[i].getPrecio()<precio){//checamos en los demas objetos los demas precio para saber cual es el mas barato
          precio=coche[i].getPrecio();
          indice=i;
        }
    }
    
    return indice;
    }
    

    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);     
    
   String marca,modelo;
   float precio;
   int numVehiculos,indiceBarato;
   char sino;
     do{
        System.out.print("Ingrese la cantidad de vehiculos: "); 
        numVehiculos=leer.nextInt();
        
        //creamos objetos de los coches y se instancia
        Vehiculo coche[]=new Vehiculo[numVehiculos];
        
        
       
        for(int i=0;i<coche.length;i++){
            leer.nextLine();  
            System.out.println("Digite las caraceristicas del coche :"+(i+1) );
            System.out.print("Introduzca la marca : ");
            marca=leer.nextLine();
            System.out.print("Introduzca el modelo: ");
            modelo=leer.nextLine();
            System.out.print("Introduzca el precio del coche: ");
            precio=leer.nextFloat();
            
           coche[i]=new Vehiculo(marca,modelo,precio);
        }
   
  indiceBarato=indiceCocheMBarato(coche);//guardamos en una variable el valor de retorno del metodo
        System.out.println("El coche mas barato es :");
        System.out.println(coche[indiceBarato].mostrarDatos() );
        
        
        
         System.out.print("Desea continuar s/n  : ");
         sino=leer.next().charAt(0);
     }while(sino== 's' || sino=='S');
               
}}
