/*
Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, 
y al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 
    - Una super clase llamada Polígono.
    - Una sub clase llamada Rectángulo.
    - Una sub clase llamada Triángulo.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Emmanuel Lopez 9/julio/2022
 */
public class Main_0 {
    
  static ArrayList<Poligono_01> poligonos =new ArrayList<Poligono_01>();   
  static Scanner tecla=new Scanner(System.in);
    

    
    
public static void main(String[] args) {
        
        llenarPoligono();
        mostrarResultado();
   
    }// fin del MAIn



    public static void llenarPoligono(){
        
        byte opcion;
        char respuesta;
        do { 
            
            do{
            System.out.println("Digite el poligono que necesite: ");
            System.out.println("\n1.- Triangulo \n2.- Rectangulo");
            System.out.println("opcion: ");
            opcion=tecla.nextByte();
            }while(opcion <1 || opcion>2);
            
            switch(opcion){
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();

                    break;
            }
            
            System.out.print("Desea ingresar otro poligono: S/N ");
            respuesta=tecla.next().charAt(0);
            
        } while (respuesta=='s' || respuesta=='S');
    
    }
    
    public static void llenarTriangulo(){
     double lado1,lado2,lado3;
     
        System.out.println("Digite el lado 1:");
        lado1=tecla.nextDouble();
        System.out.println("Digite el lado 2:");
        lado2=tecla.nextDouble();
        System.out.println("Digite el lado 3:");
        lado3=tecla.nextDouble();
        
        Triangulo_03 triangulo=new Triangulo_03(lado1, lado2, lado3);
        poligonos.add(triangulo);//guardamos el objeto triangulo con sus datos dentro de nuestro arreglo
    

    }
    
       
    public static void llenarRectangulo(){
    double lado1,lado2;
        System.out.print("\nDigita el lado 1: ");
        lado1=tecla.nextDouble();
        System.out.print("\nDigita el lado 2: ");
        lado2=tecla.nextDouble();
    
        Rectangulo_02 rectangulo=new Rectangulo_02(lado1, lado2);
        poligonos.add(rectangulo);
    
    }
    
        public static void mostrarResultado(){
    
    for(Poligono_01 poli:poligonos){
        System.out.println(poli.toString());
        System.out.println("\nEl area es: "+poli.area());
        System.out.println(" ");
    }

    }




}
