

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
