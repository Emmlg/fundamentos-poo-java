/**
 * EJERCICIO: herencia-basica | Estudiante
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Estudiante para el ejercicio 'herencia-basica'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Estudiante extends Persona {
    //atributos
     float notafinal;
     int numControl;

    public Estudiante(String nombre, String apellido, int Edad,float notafinal,int numControl) {
        super(nombre, apellido, Edad);
        this.notafinal=notafinal;
        this.numControl=numControl;
        
    }
    
    
       public float getNotaFinal(){
    return notafinal;
    } 
        public int getNumControl(){
    return numControl;
    }
    


     @Override
    public String toString(){
  
        return "mi nombre es: "+getNombre()+" "+getApellido()+" tengo "+getEdad()+"con una calificacion de "+getNotaFinal()
            +" y un numero de control de "+getNumControl()  ;
         
    
    }
    
}
