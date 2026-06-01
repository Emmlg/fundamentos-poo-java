/**
 * EJERCICIO: clases-abstractas-seres-vivos | Main
 * ---------------------------------------------------------------
 * Concepto: Abstracción en POO
 * 
 * DESCRIPCIÓN: 
 * Clase principal para ejecutar y probar la lógica de clases-abstractas-seres-vivos.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Main_0 {
 public static void main(String[] args) {
       
        Planta_02 planta=new Planta_02();
    AnimalCarnivoro_031 animalC=new AnimalCarnivoro_031();
    AnimalHerbivoro_032 animalH=new AnimalHerbivoro_032();
    
    planta.alimentarse();
    animalC.alimentarse();
    animalH.alimentarse();
        
    }
}
