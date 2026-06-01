/**
 * EJERCICIO: sobreescritura-metodos | Main
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de sobreescritura-metodos.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Main {
    public static void main(String[] args) {
     
    Futbol futbol=new Futbol();//instanciamos el objeto
    Basketball basket=new Basketball();
    PingPong pingPong=new PingPong();
    
    futbol.golpearBalon();
    basket.golpearBalon();
    pingPong.golpearBalon();
    
        
        
        
    }    
}
