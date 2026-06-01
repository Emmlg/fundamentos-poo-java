/*
Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas caracterizados
por su número de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */

/**
 *
 * @author Emmanuel lopez 27/junio/2022
 */
public class Atleta {
    
    //atributo
    private String nombre;
    private int numeroDeAtleta;
    private float tiempoDeCarrera;
    //constructor
    public Atleta(String nombre,int numeroDeAtleta,float tiempoDeCarrera){
    this.nombre=nombre;
    this.numeroDeAtleta=numeroDeAtleta;
    this.tiempoDeCarrera=tiempoDeCarrera;
    }
    
    public float getTiempo(){
    return tiempoDeCarrera;
    }
    public String MostrarDatos(){
    return "\n\tNombre: "+nombre
            + "\n\tNumero de Atleta: "+numeroDeAtleta
            + "\n\tTiempo de la carrera: "+tiempoDeCarrera;
    }
    
    
    
}
