/**
 * EJERCICIO: triangulos-isosceles | Main
 * ---------------------------------------------------------------
 * Concepto: Ejercicios de Refuerzo en POO
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de triangulos-isosceles.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
/*
Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. 
Para ello defina los atributos necesarios que se requieren, proporcione métodos de consulta, 
un método constructor e implemente métodos para calcular el perímetro y el área de un triángulo,
además implementar un método que a partir de un arreglo de triángulos devuelva el área del triángulo de mayor superficie.
 */

import java.util.Scanner;

/**
 * @author Emmanuel lopez
 */
public class Main {
    
    public static int areaMayor(Triangulo_isosceles triangulo[]){
    int indice = 0;
   double area= triangulo[0].getArea();
    for(int i=1;i<triangulo.length;i++){
     if(triangulo[i].getArea()>area){
      area=triangulo[i].getArea();
      indice=i;
     }
    }    
    return indice;
    }
    

    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in); 
        
      double base,lado;
      int ndetriangulos;
      
        System.out.print("Digite el numero de triangulos a ingresar: ");
        ndetriangulos=teclado.nextInt();
        
        Triangulo_isosceles triangulo[]=new Triangulo_isosceles[ndetriangulos];
        
        for(int i=0;i<triangulo.length;i++){
            System.out.println("INgresa los datos del triangulos "+(i+1));
            System.out.print("Ingresa la base: ");
            base=teclado.nextDouble();
            System.out.print("Ingresa el perimetro: ");
            lado=teclado.nextDouble();
            triangulo[i]=new Triangulo_isosceles(base, lado);
            
        }
        int indicedeArea=areaMayor(triangulo);
        System.out.println("El triangulo con mayor area es: "+triangulo[indicedeArea].mostrarDatos());
        
      
    }    
}
