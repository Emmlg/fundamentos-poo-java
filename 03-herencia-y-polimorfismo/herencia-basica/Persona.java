/**
 * EJERCICIO: herencia-basica | Persona
 * ---------------------------------------------------------------
 * Concepto: Herencia y Polimorfismo
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Persona para el ejercicio 'herencia-basica'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Persona {
    
    //atributo
     String nombre;
    String apellido;
     int Edad;
    
    //metodo constructor
    public Persona(String nombre,String apellido,int Edad){
    this.nombre=nombre;
    this.apellido=apellido;
    this.Edad=Edad;
                
    
    }
    
    
    public String getNombre(){
    return nombre;
    }
    
        public String getApellido(){
    return apellido;
    }
    public int getEdad(){
    return Edad;
    }    
    
      @Override
    public String toString(){
  
        return "mi nombre es: "+getNombre()+" "+getApellido()+" tengo "+getEdad();
    
    }
    
    
    
    
    
}// fin de la clase
