/**
 * EJERCICIO: sobrecarga-constructores | Main
 * ---------------------------------------------------------------
 * Concepto: Objetos y Encapsulamiento
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de sobrecarga-constructores.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class mainPersona {


    public static void main(String[] args) {
        Persona persona1=new Persona("Emmanuel",20);
        
        persona1.correr();
        Persona persona2= new Persona("21700198");
        persona2.correr(200);
        
        
        // TODO code application logic here
    }
    
}
