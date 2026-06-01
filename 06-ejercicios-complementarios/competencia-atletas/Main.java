/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author lopez
 */
public class Main {
    
    public static int quienEsElGanador(Atleta participantes[]){
    int indice = 0;
    float ganador = participantes[0].getTiempo();
    
     for(int i=1;i< participantes.length;i++){
      if(participantes[i].getTiempo()< ganador){
      ganador= participantes[i].getTiempo();
      indice=i;
      }
     }        
    return indice;
    }
    
    
    
    
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     
     String nombre;
     int numeroDeParticipantes = 0,numeroDelAtleta,indiceganador;
     float tiempoDeCarrera;
        System.out.print("Numero de participantes? ");
        numeroDeParticipantes=leer.nextInt();
     
     Atleta participantes[]=new Atleta[numeroDeParticipantes];
     
     for(int i=0;i<participantes.length;i++){
         leer.nextLine();
         System.out.println("Participante numero "+(i+1));
         System.out.println("Como te llamas: ");
         nombre=leer.nextLine();
         System.out.println("numero de participante: ");
         numeroDelAtleta=leer.nextInt();
         System.out.println("Tiempo de la carrera en segundos: ");
         tiempoDeCarrera=leer.nextFloat();
         
         participantes[i]=new Atleta(nombre,numeroDelAtleta,tiempoDeCarrera);
     }
         indiceganador = quienEsElGanador(participantes);
        
        System.out.println("El ganador de la carrera es: "+participantes[indiceganador].MostrarDatos());
        
        
        
        
    }    
}
