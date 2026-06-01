

/**
 *
 * @author Emmanuel lopez 9/julio/2022
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
