/**
 * EJERCICIO: citas-apa | Revistas_APA
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Revistas_APA para el ejercicio 'citas-apa'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Revistas_APA extends Citas_APA{
    //Atributos
    private String nombredeLaRevista;
    private byte volumen;
    private int paginas;
    
    //constructor
    public Revistas_APA(String autor, String NombredelTitulo, int anioPublicacion,String nombredeLaRevista,byte volumen,int paginas) {
        super(autor, NombredelTitulo, anioPublicacion);
        this.nombredeLaRevista=nombredeLaRevista;
        this.volumen=volumen;
        this.paginas=paginas;
    }

    public String getNombredeLaRevista() {
        return nombredeLaRevista;
    }

    public byte getVolumen() {
        return volumen;
    }

    public int getPaginas() {
        return paginas;
    }
    
    
    public void mostrarDatos(){
        System.out.println("El autor es: "+getAutor()
        +"\nNOmbre del Titulo: "+getNombredelTitulo()
        +"\nAño de Publicación: "+getAnioPublcacion()
        +"\nNombre de la revista :  "+getNombredeLaRevista()
        +"\npaginas : "+getPaginas());
    
    }    
    
    
    
}
