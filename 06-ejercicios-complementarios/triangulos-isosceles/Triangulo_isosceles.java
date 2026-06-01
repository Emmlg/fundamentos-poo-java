/*
Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. 
Para ello defina los atributos necesarios que se requieren, proporcione métodos de consulta, 
un método constructor e implemente métodos para calcular el perímetro y el área de un triángulo,
además implementar un método que a partir de un arreglo de triángulos devuelva el área del triángulo de mayor superficie.
 */



/**
 * @author Emmanuel lopez
 */
public class Triangulo_isosceles {
    // Atributos
    private double base;
    private double lado;
    //metodo constructor
    public Triangulo_isosceles(double base,double lado){
    this.base=base;
    this.lado=lado;
    }
    
  public double getPerimetro(){
   double perimetro= base+(2*lado);
    return perimetro;
    }
  public double getArea(){
      double area= ( base*Math.sqrt( (lado*lado)-((base*base)/4) )) /2;
     return area;  
  }
    public String mostrarDatos(){
    return "\n\tBase: "+base
            + "\n\tLado: "+lado
            + "\n\tPerimetro: "+getPerimetro()
            + "\n\tArea: "+getArea();
    }
    
    
    
    
    
    
    
    
}
