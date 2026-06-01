/*

 */

import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel lopez
 */
public class Main {
 public static void main(String[] args){
 
 Cuadrilatero objeto1;
 
 float lado1,lado2;
 
 lado1= Float.parseFloat(JOptionPane.showInputDialog("digite el lado 1: "));
 lado2= Float.parseFloat(JOptionPane.showInputDialog("ingresa el lado 2: "));
 
 if(lado1==lado2){// cuadrado
  objeto1=new Cuadrilatero(lado1);   
     
 }
 else // cuadrilatero
    objeto1=new Cuadrilatero(lado1,lado2);

 
 System.out.println("El perimetro es :"+objeto1.getperimetro());
 System.out.println("El area es: "+objeto1.getArea());
 
 
 
 
 
 }
 
}
