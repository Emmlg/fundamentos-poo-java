/**
 * EJERCICIO: polimorfismo-vehiculos | VehiculoFurgoneta
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase VehiculoFurgoneta para el ejercicio 'polimorfismo-vehiculos'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class VehiculoFurgoneta extends Vehiculo{
    
    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo,int carga) {
        super(matricula, marca, modelo);
        this.carga=carga;
    }
    
    
    public int getCarga(){
return carga;
}
@Override
public String mostrarDatos(){

    return "Matricula: "+matricula+ "\nMarca: "+marca+"\nModelo: "+modelo+
"\nCarga : "+carga;
}
    
    
    
    
    
    
}//fin de la clase Furgonete
