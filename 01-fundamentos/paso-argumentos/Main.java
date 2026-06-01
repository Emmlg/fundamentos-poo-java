
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lopez
 */
public class PooMain {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cif1,cif2;
        Operacion op =new Operacion();
        
        System.out.print("ingresa la cufra: ");
        cif1=leer.nextInt();
        System.out.print("\ningresa la crfra: ");
        cif2=leer.nextInt();
        
        //necesitamos crear variables locales para poder recibir el dato de retorno
        // las variables deben de ser del mismo dato con el que se envia
        
        
        int suma=op.suma(cif1, cif2);// no elvidemos mandar los argumentos a los parametros
       
        int resta=op.resta(cif1,cif2);
        int multiplicacion=op.multiplicacion(cif1,cif2);
        int division=op.division(cif1,cif2);
        
        // luego de recibir los datos de retorno y
        //almacenarlos en las variables locales como int suma... 
        //las enviaremos de nuevo al metodo de salida como argumento
        op.setSalida(suma, resta, multiplicacion, division);
        
        
        
        // TODO code application logic here
    }
    
}
