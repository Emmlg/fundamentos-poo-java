/**
 * EJERCICIO: polimorfismo-spiderverse | SpiderHam_05
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase SpiderHam_05 para el ejercicio 'polimorfismo-spiderverse'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class SpiderHam_05 extends SpiderMan_01{
    
    //atributo
    private String raza;

    public SpiderHam_05(String nombre, String universo, String enemigo,String raza) {
        super(nombre, universo, enemigo);
        this.raza=raza;
    }
 
        @Override
    public String mostrarDatos(){
          return "\nNombre : "+nombre
                       +"\nUniverso : "+universo
                       +"\nEnemigo : "+enemigo
                       +"\nRaza :"+raza;
        
    }
    
}
