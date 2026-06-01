/**
 * EJERCICIO: definicion-clases | Operacion
 * ---------------------------------------------------------------
 * Concepto: Objetos y Encapsulamiento
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Operacion para el ejercicio 'definicion-clases'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
import javax.swing.JOptionPane;


public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int division;
    int multiplicacion;
    
    
    //metodos
    
public void leerNumeros(){
numero1 = Integer.parseInt(JOptionPane.showInputDialog("inserte el primer digito: "));
numero2 = Integer.parseInt(JOptionPane.showInputDialog("inserte el segundo digito: "));


}
public void suma(){
suma = numero1 + numero2;

}    
public void resta(){
resta = numero1-numero2;

}        
public void multiplicacion(){
multiplicacion = numero1*numero2;

}   
public void division(){
division = numero1/numero2;

}   
public void mostrarResultados(){
System.out.println("la suma es: "+ suma);
System.out.println("la resta es: "+ resta);
System.out.println("la multiplicaion es: "+ multiplicacion);
System.out.println("la division es: "+ division);

}  



















//
    
}
