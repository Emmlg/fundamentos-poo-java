

/**
 *
 * @author Emmanuel lopez 9/julio/2022
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
