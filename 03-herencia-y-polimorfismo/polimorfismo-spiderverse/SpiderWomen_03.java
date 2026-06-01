/**
 * EJERCICIO: polimorfismo-spiderverse | SpiderWomen_03
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase SpiderWomen_03 para el ejercicio 'polimorfismo-spiderverse'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class SpiderWomen_03 extends SpiderMan_01{
  //atributos
    private String sobreNombre;

    public SpiderWomen_03(String nombre, String universo, String enemigo,String sobrenombre) {
        super(nombre, universo, enemigo);
        this.sobreNombre=sobrenombre;
        
    }

    public String getSobreNombre() {
        return sobreNombre;
    }
    
        @Override
    public String mostrarDatos(){
          return "\nNombre: "+nombre
                       +"\nUniverso: "+universo
                       +"\nEnemigo: "+enemigo
                       +"\nSobre nombres :"+sobreNombre;
        
    }
    
    
}
