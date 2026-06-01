/**
 * EJERCICIO: sobreescritura-metodos | Futbol
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Futbol para el ejercicio 'sobreescritura-metodos'.
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
 * @author Emmanuel lopez 9/julio/2022
 */
public class Futbol extends Jugar{
    
    
    
  @Override
  public void golpearBalon(){// este metodo se sobre escribe porque hay otro metodo igual en la clase jugar de donde se hereda
 
     System.out.println("juego con el balon en el campo pateandolo");
 }   
    
    
}
