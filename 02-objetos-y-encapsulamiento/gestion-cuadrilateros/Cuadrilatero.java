/*
construir un programa que calcule el area y el perimetro de un cuadrilatero dada la longitud de sus lados.
Los valores de la longitud deberan introducirse por linea de ordenes.
si es un cuadrado,solo se proporcionará la longitud de uno de los lados al constructor.
 */

/**
 * @author Emmanuel Lopez, 26/junio/2022
 */
public class Cuadrilatero {
    //atributos
 private float lado1;
 private float lado2;
 
 //  constuctor 1 (cuadrilatero)
 public Cuadrilatero(float argumento_lado1,float argumento_lado2){
     this.lado1=argumento_lado1;
     this.lado2=argumento_lado2; 
 }
    
 //  constructor 2 (cuadrado)
 public Cuadrilatero(float argumento_lado1){
 
 this.lado1=this.lado2=argumento_lado1;
 }
   
public float getperimetro(){
float perimetro = 2*(lado1+lado2);
return perimetro;
} 
 
public float getArea(){
float area= (lado1*lado2);
return area;
} 


    
}// fin de la clase cuadrilatero
