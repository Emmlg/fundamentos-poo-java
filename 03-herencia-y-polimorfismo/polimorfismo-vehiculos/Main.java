/**
 * EJERCICIO: polimorfismo-vehiculos | Main
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de polimorfismo-vehiculos.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
    
    Vehiculo misVehiculos[] = new Vehiculo[4];
    misVehiculos[0] = new Vehiculo("GH67","Ferrari","212");
    misVehiculos[1] = new VehiculoTurismo(5,"VX77","Mercedes-benz","Sprinter");
    misVehiculos[2] = new VehiculoDeportivo("DX66","Alfa Romeo","Stelvio",8);
    misVehiculos[3] = new VehiculoFurgoneta("FF65","Peugeot","Rifter",1500);

     for (Vehiculo vehiculos: misVehiculos) {

     System.out.println(vehiculos.mostrarDatos() );
     System.out.println("");
     }
    
    
}}
