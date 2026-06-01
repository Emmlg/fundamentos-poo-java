

/**
 *
 * @author Emmanuel lopez 9/julio/2022
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
