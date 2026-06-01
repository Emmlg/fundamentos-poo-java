/*
Construir un programa que dada una lista de integrantes de tu familia con las caracteristicas de 
Nombre,Apellido y Estatura de tal forma que imprimimas las caracteristicas de la persona mas alta. 
Para ello,se deberán leer por teclado las características de cada persona y crear una clase que represente a cada uno de ellos.
 */

import java.util.Scanner;

/**
 *
 * @author Emmanuel lopez 27/junio/2022
 */
public class Main {
    
    public static int quienEsMasAlto(Familia integranteNumero[]){
     int indice = 0;
     float estaturaMasAlta =  integranteNumero[0].getEstatura();
     
      for(int i=1;i<integranteNumero.length;i++){
         if(integranteNumero[i].getEstatura()<estaturaMasAlta){
           estaturaMasAlta=integranteNumero[i].getEstatura();
           indice=i;
         }
      }
        
    return indice;
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int integrantes,indice2;
        String nombre,apellido;
        float edad;
        System.out.print("Cuantos integrantes en tu familia hay? ");   
        integrantes=teclado.nextInt();
        
        Familia integranteNumero[]=new Familia[integrantes];// creamos un vector de matrices
        
        for(int i=0;i<integranteNumero.length;i++){
            teclado.nextLine();
            System.out.println("Integrante numero "+(i+1));
            System.out.print("Como te llamas : ");
            nombre=teclado.nextLine();
            System.out.print("Cual es tu apellido : ");
            apellido=teclado.nextLine();
            System.out.print("Cual es tu Estatura: ");
            edad=teclado.nextFloat();
            integranteNumero[i]=new Familia(nombre, apellido, edad);
        }
        
        indice2=quienEsMasAlto(integranteNumero);
        System.out.println("\nEL integrante mas alto es: "+integranteNumero[indice2].mostrarDatos());
        
    }   
}
