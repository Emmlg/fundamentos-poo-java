/*
 Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, 
y al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 
    - Una super clase llamada Polígono.
    - Una sub clase llamada Rectángulo.
    - Una sub clase llamada Triángulo.
 */

/**
 *
 * @author Emmanuel Lopez 9/julio/2022
 */
public abstract class Poligono_01 {
    //atributos
    protected int numLados;
    
    public Poligono_01(int numerodelados){
    this.numLados=numerodelados;
    }

    public double getNumLados() {
        return numLados;
    }

    @Override
    public String toString() {
        return "numero de lados: " + numLados ;
    }
    
    public abstract double area();
    
    

    
    
    
    
}
