/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel lopez 9/julio/2022
 */
public class SpiderMan_01 {
    
    //atributos
    protected String nombre;
    protected String universo;
    protected String enemigo;
    //constructor
    
    public SpiderMan_01(String nombre,String universo,String enemigo){
    this.nombre=nombre;
    this.universo=universo;
    this.enemigo=enemigo;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getUniverso() {
        return universo;
    }

    public String getEnemigo() {
        return enemigo;
    }
    
  public String mostrarDatos(){
  
      return "\nNombre: "+nombre
                       +"\nUniverso: "+universo
                       +"\nEnemigo: "+enemigo;
  }  
    
    
    
    
}
