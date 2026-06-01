/**
 * EJERCICIO: polimorfismo-vehiculos | VehiculoTurismo
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase VehiculoTurismo para el ejercicio 'polimorfismo-vehiculos'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class VehiculoTurismo extends Vehiculo{
    
    private int nPuertas;
    
    public VehiculoTurismo(int nPuertas,String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas=nPuertas;
    }
    
    public int getnPuertas(){
return nPuertas;
}
    
@Override
public String mostrarDatos(){
return "Matricula: "+matricula+ "\nMarca: "+marca+"\nModelo: "+modelo+
"\nNúmero de Puertas: "+nPuertas;
}








}//fin de la claase vehiculoTurismo
