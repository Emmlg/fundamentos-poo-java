/**
 * EJERCICIO: encapsulamiento-basico | Clase2
 * ---------------------------------------------------------------
 * Concepto: Objetos y Encapsulamiento
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Clase2 para el ejercicio 'encapsulamiento-basico'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Clase2 {
   public static void main(String[] args){
    
    Clase1 objeto1=new Clase1();
    
       objeto1.setEdad(20);//establece un valor con atributo privado
       System.out.println("la edad es: "+objeto1.getEdad());
    
       objeto1.setNombre("Emmanuel");
       System.out.println("mi nombre es:"+objeto1.getNombre());
       
    
    
}}
