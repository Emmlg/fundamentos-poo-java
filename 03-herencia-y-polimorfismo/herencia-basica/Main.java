/**
 * EJERCICIO: herencia-basica | Main
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de herencia-basica.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lopez
 */
public class Principal {
    // 
    public static void main(String[] args) {
//Persona obj1=new Estudainte("jose","sanchez",20,9,21700210);            
Estudiante obj1=new Estudiante("jose","sanchez",20,9,21700210);
           


         obj1.getApellido();
         obj1.getApellido();
         obj1.getEdad();
         obj1.getNotaFinal();
         obj1.getNumControl();
          obj1.toString();
          System.out.println(obj1.toString());
        
    }
    

    
    
    
    
    
    
    
}
