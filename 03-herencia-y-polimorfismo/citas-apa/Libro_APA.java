/**
 * EJERCICIO: citas-apa | Libro_APA
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Libro_APA para el ejercicio 'citas-apa'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Libro_APA extends Citas_APA{
    
    //Atributos
    private String lugarPublicaion;
    private  String Editorial;
  
    
    //constructor

    public Libro_APA(String autor, String NombredelTitulo, int anioPublicacion,String lugarpublicacion,String editorial) {
        super(autor, NombredelTitulo, anioPublicacion);
        this.lugarPublicaion=lugarpublicacion;
        this.Editorial=editorial;
    }

    public String getLugarPublicaion() {
        return lugarPublicaion;
    }

    public String getEditorial() {
        return Editorial;
    }

    
    
    public void mostrarDatos(){
        System.out.println("El autor es: "+getAutor()
        +"\nNOmbre del Titulo: "+getNombredelTitulo()
        +"\nAño de Publicación: "+getAnioPublcacion()
        +"\nLugar de publicacion: "+getLugarPublicaion()
        +"\nEditorial: "+getEditorial());
    
    }
    

       
}
