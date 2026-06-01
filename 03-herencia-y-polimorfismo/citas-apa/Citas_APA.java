/**
 * EJERCICIO: citas-apa | Citas_APA
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Citas_APA para el ejercicio 'citas-apa'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Citas_APA {
    
    //Atributos
    private String autor;
    private String NombredelTitulo;
    private int anioPublcacion;
   //constructor
    public Citas_APA(String autor,String NombredelTitulo,int anioPublicacion){
    this.autor=autor;
    this.NombredelTitulo=NombredelTitulo;
    this.anioPublcacion=anioPublicacion;
    
    }

    public String getAutor() {
        return autor;
    }

    public String getNombredelTitulo() {
        return NombredelTitulo;
    }

    public int getAnioPublcacion() {
        return anioPublcacion;
    }
    
    
    
    
    
    
    
    
    
    
}
