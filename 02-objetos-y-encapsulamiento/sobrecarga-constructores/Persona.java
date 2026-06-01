/**
 * EJERCICIO: sobrecarga-constructores | Persona
 * ---------------------------------------------------------------
 * Concepto: Objetos y Encapsulamiento
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Persona para el ejercicio 'sobrecarga-constructores'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Persona {
    
    //atributos
    String nombre;
    int edad;
    String dni;
    
    //metodo contructor
    
    public Persona(String nombre,int edad){
    this.nombre=nombre;
    this.edad=edad;
    }
    public Persona(String dni){
    this.dni=dni;
    }
    
 public void correr(){
 
     System.out.println("soy "+nombre+" , tengo "+edad+" año y estoy corriendo");
 }   
 public void correr(int km){
     System.out.println("hecorrido "+km+" Kilometros");
 
 }
    
    
    
}//fin de la clase persona
