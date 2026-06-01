/**
 * EJERCICIO: polimorfismo-vehiculos | VehiculoDeportivo
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase VehiculoDeportivo para el ejercicio 'polimorfismo-vehiculos'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class VehiculoDeportivo extends Vehiculo {
    
    
    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo,int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada=cilindrada;
    }
    
    public int getCilindrada(){
return cilindrada;
}
    
@Override
public String mostrarDatos(){
    return "Matricula: "+matricula+ "\nMarca: "+marca+"\nModelo: "+modelo+
"\nCilindrada: "+cilindrada;
}
 





}//fin de vehiculoDeportivo
