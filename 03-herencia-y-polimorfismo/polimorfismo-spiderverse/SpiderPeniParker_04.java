/**
 * EJERCICIO: polimorfismo-spiderverse | SpiderPeniParker_04
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase SpiderPeniParker_04 para el ejercicio 'polimorfismo-spiderverse'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class SpiderPeniParker_04 extends SpiderMan_01{
  //atributo
    private String nacionalidad;

    public SpiderPeniParker_04(String nombre, String universo, String enemigo,String nacionalidad) {
        super(nombre, universo, enemigo);
        this.nacionalidad=nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
 
        @Override
    public String mostrarDatos(){
          return "\nNombre: "+nombre
                       +"\nUniverso: "+universo
                       +"\nEnemigo: "+enemigo
                       +"\nNacionalidad :"+nacionalidad;
        
    }
    
}
