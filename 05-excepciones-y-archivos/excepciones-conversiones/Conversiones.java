/**
 * EJERCICIO: excepciones-conversiones | Conversiones
 * ---------------------------------------------------------------
 * Concepto: Manejo de Excepciones y Persistencia de Archivos
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Conversiones para el ejercicio 'excepciones-conversiones'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public abstract class Conversiones {
    //atributo
    float cifraGeneral;
    
    //metodo construcotr
    public Conversiones(float cifraGenral){
 this.cifraGeneral= cifraGeneral;
}
   
    
//metodos
abstract String conversionB();
abstract String conversionO();
abstract String conversionH();
abstract String informacion();
abstract String menuPrincipal();




}//Fin de la clase Conversiones
