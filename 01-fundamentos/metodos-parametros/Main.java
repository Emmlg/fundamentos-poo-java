/**
 * EJERCICIO: metodos-parametros | Main
 * ---------------------------------------------------------------
 * Concepto: Fundamentos de Programación Orientada a Objetos
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de metodos-parametros.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
import java.util.Scanner;


public class PooMain {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Operaciones op=new Operaciones();
        int dato1,dato2;
        System.out.println("ingrese la cifra: ");
        dato1=leer.nextInt();
        System.out.println("ingrese la cifra: ");
        dato2=leer.nextInt();
        
        op.sumar(dato1, dato2);
        op.resta(dato1, dato2);
        op.multiplicar(dato1, dato2);
        op.division(dato1, dato2);
        op.setResultados();
        
        // TODO code application logic here
    }
    
}
