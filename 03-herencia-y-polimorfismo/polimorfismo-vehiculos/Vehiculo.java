/**
 * EJERCICIO: polimorfismo-vehiculos | Vehiculo
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Vehiculo para el ejercicio 'polimorfismo-vehiculos'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Vehiculo {
    
protected String matricula;
protected String marca;
protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMatricula(){
return matricula;
}
    
 public String getMarca(){
 return marca;
}

 public String getModelo(){
 return modelo;
}

 public String mostrarDatos(){
 return "Matricula: "+matricula+ "\nMarca: "+marca+"\nModelo: "+modelo;

}   
    
    
    
}//fin de la clase Vehiculo
