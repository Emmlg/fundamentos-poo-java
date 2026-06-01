/**
 * EJERCICIO: relaciones-familiares | Familia
 * ---------------------------------------------------------------
 * Concepto: Ejercicios de Refuerzo en POO
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Familia para el ejercicio 'relaciones-familiares'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
/*
Construir un programa que dada una lista de integrantes de tu familia con las caracteristicas de 
Nombre,Apellido y Estatura de tal forma que imprimimas las caracteristicas de la persona mas alta. 
Para ello,se deberán leer por teclado las características de cada persona y crear una clase que represente a cada uno de ellos.
 */

/**
 * @author Emmanuel lopez 27/junio/2022
 */
public class Familia {
    //Atributos
     private String nombre;
     private String apellido;
     private float estatura;
     
     // constructor
     public Familia(String nombre,String apellido,float estatura){
     this.nombre=nombre;
     this.apellido=apellido;
     this.estatura=estatura;     
     }

    public float getEstatura() {
        return estatura;
    }
     
     public String mostrarDatos(){
     return "\n\tNombre: "+nombre
             +"\n\tApellido: "+apellido
             +"\n\tEstatura: "+estatura;
     }
    
    
    
}
