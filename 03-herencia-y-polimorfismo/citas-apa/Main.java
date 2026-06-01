/*

 */

import java.util.Scanner;

/**
 *
 * @author Emmanuel lopez  3/julio/2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner tecla=new Scanner(System.in);
        
     byte opcion,volumen;
     String autor,NombredelTitulo,lugarpublicacion,editorial,nombredeLaRevista;
     int anioPublicacion,pagina;
     
     
        System.out.println("\n\tMenu de Citas APA"
                + "\n1.- Citas para libro"
                + "\n2.- Citas para Revista"
                + "\n3.- Salir");
         System.out.print("Digita la opcion: ");
               opcion=tecla.nextByte();
               
               
               
            switch(opcion){
            
                case 1: tecla.nextLine();
                        System.out.println("EScribe el nombre del autor: ");
                        autor=tecla.nextLine();
                        System.out.println("Nombre del titulo: ");
                        NombredelTitulo=tecla.nextLine();
                        System.out.println("Año de Publicacion: ");
                        anioPublicacion=tecla.nextInt();
                        tecla.nextLine();
                        System.out.println("Lugar de publicacion: ");
                        lugarpublicacion=tecla.nextLine();
                        System.out.println("Editorial: ");
                        editorial=tecla.nextLine();                    
                    Libro_APA citarlibro=new Libro_APA(autor, NombredelTitulo, anioPublicacion, lugarpublicacion, editorial);
                    citarlibro.mostrarDatos();
                    break;
                case 2: tecla.nextLine();
                        System.out.println("EScribe el nombre del autor: ");
                        autor=tecla.nextLine();
                        System.out.println("Nombre del titulo: ");
                        NombredelTitulo=tecla.nextLine();
                        System.out.println("Año de Publicacion: ");
                        anioPublicacion=tecla.nextInt();
                        tecla.nextLine();
                        System.out.println("Nombre de la revista: ");
                        nombredeLaRevista=tecla.nextLine();
                        System.out.println("Volumen: ");
                        volumen=tecla.nextByte();
                        System.out.println("Cantidad de paginas: ");
                        pagina=tecla.nextInt();                    
                    Revistas_APA citaRevista=new Revistas_APA(autor, NombredelTitulo, anioPublicacion, nombredeLaRevista, volumen, pagina);
                    citaRevista.mostrarDatos();
                    break;

                case 3:System.out.println("Gracias por usar el programa :)"); break;
                default: System.out.println("Error, escribe solo del 1-3");
            
            
            }   
        
        
    }    
}
