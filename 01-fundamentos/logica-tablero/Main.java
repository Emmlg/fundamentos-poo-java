/**
 * EJERCICIO: logica-tablero | Main
 * ---------------------------------------------------------------
 * Concepto: Fundamentos de Programación Orientada a Objetos
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de logica-tablero.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Emmanuel lopez
 */
public class Main {
    public static void main(String[] args){
    Scanner salida=new Scanner(System.in);
    int menu = 0,incremento = 0;
    Tablero objeto_Tablero=new Tablero(0,0);
    
    do{
     
        System.out.print("\n\t menu "
                + "\n1.- Mover Derecha"
                + "\n2.- Mover Arriba"
                + "\n3.- Mover Abajo"
                + "\n4.- Mover Izquierda"
                + "\n5.- salir");
       do{
         menu=Integer.parseInt(JOptionPane.showInputDialog("digite la Opcion: "));
     
        }while(menu<=0 || menu>5);
         if(menu!=5){
        incremento=Integer.parseInt(JOptionPane.showInputDialog("ingresa el incremento o decremento : "));
         }
        
    switch(menu){
        case 1:objeto_Tablero.moverDerecha(incremento);
            break;
        case 2:objeto_Tablero.moverArriba(incremento);
            break;
        case 3:objeto_Tablero.moverAbajo(incremento);
            break;
        case 4:objeto_Tablero.moverIzquierda(incremento);
            break;
        case 5:System.out.println(" ");
            break;
        default: System.out.println(" erro, digite nuevamente el numero del menu");
    }
    System.out.println("\nla posicion de (x,y) es : ["+objeto_Tablero.getPosicionX()+","+objeto_Tablero.getPosicionY()+"] ");
    }while(menu !=5);
    
    

    }
}
