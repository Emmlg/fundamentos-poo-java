/**
 * EJERCICIO: operaciones-complejos | Numero_Complejo
 * ---------------------------------------------------------------
 * Concepto: Fundamentos de Programación Orientada a Objetos
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Numero_Complejo para el ejercicio 'operaciones-complejos'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
/*
Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero
 */

import sun.security.krb5.internal.SeqNumber;

/**
 * @author Emmanuel lopez 2/julio/2022
 */
public class Numero_Complejo {
    
    //atributos
    private double numeroReal1;
    private double numeroReal2;
    private double numeroImaginario1;
    private double numeroImaginario2;
    
    //constructor
    public Numero_Complejo(double numeroReal1,double numeroReal2,double numeroImaginario1,double numeroImaginario2){
    this.numeroReal1=numeroReal1;
    this.numeroReal2=numeroReal2;
    this.numeroImaginario1=numeroImaginario1;
    this.numeroImaginario2=numeroImaginario2;
           
    }
    
// constructor 2
    public Numero_Complejo(double nmr,double nmi){
     this.numeroReal1=nmr;
     this.numeroImaginario1=nmi;
    }
  //metodos intermedios
    private double sumaDeNumReales(double numR1,double numR2){
    double sNumR;
    sNumR=numR1+numR2;
        
    return sNumR;
    }
    private double sumaDeNumImaginarios(double numI1,double numI2){
    double sNumI;
    sNumI=numI1+numI2;
        
    return sNumI;
    }
    
    private double productoReal(double numR1,double numR2,double numI1,double numI2){
    double sNumR=( (numR1*numR2)-(numI1*numI2) );
    return sNumR;
    }
    private double productoImaginario(double numR1,double numR2,double numI1,double numI2){
    double sNumi=((numR1*numI2)+ (numI1*numR2));
    return sNumi;
    }
    
   //metodos a llamar
    

    public String sumaDeNumComplejos(){
    return sumaDeNumReales(numeroReal1,numeroReal2)+" + "+sumaDeNumImaginarios(numeroImaginario1,numeroImaginario2)+" i";
    }
    
    
   public String productoNumComplejo(){
   return  productoReal(numeroReal1, numeroReal2, numeroImaginario1, numeroImaginario2) + " + "
         + productoImaginario(numeroReal1, numeroReal2, numeroImaginario1, numeroImaginario2)+"i";
   } 
    
   public boolean comprobarIgualdadNumComplejos(){
   boolean igualdad=false;
   if(numeroReal1==numeroReal2 && numeroImaginario1==numeroImaginario2){
   igualdad=true;
   }
   return igualdad;
   }
   
   public double productoNumImaConNumReal(){
   return this.numeroReal1*this.numeroImaginario1;
   }
    
    
    
}
