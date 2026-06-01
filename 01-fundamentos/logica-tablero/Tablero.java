/*
 Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posicion dentro del mismo.
Los movimientos posibles son Arriba,Abajo,izquirda y Derecha.
Tras cada movimiento el programa mostrara la nueva direccion elegida y las coordenadas de situasiones del objeto dentro del tablero
 */

/**
 * @author Emmanuel lopez 26/junio/2022
 */
public class Tablero {
    //atributos
    private int x;
    private int y;
    
    //constructor
    public Tablero(int argumento_x,int argumento_y){
    this.x=argumento_x;
    this.y=argumento_y;
            
    }
    
    public void moverArriba(int incremento){
     x+=incremento;
    }
    public void moverDerecha(int incremento){
     y+=incremento;
    }   
    public void moverAbajo(int decremento){
     x-=decremento;
    }
    public void moverIzquierda(int decremento){
     y-=decremento;
    }
    public int getPosicionX(){
    return x;
    }
    
    public int getPosicionY(){
    return y;
    }
}
