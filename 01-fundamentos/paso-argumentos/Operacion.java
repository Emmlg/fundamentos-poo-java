

public class Operacion {
    
   // atributos
    
    
    //metodos
                //entre parentesis parametro
public int suma(int num1,int num2){
int suma;
suma=num1+num2;
return suma;//el valor de retorno tiene que ser como se declara aunque los parametro diferentes
}    

public int resta(int num1,int num2){
int resta;
resta=num1-num2;
return resta;
}

public int multiplicacion(int num1,int num2){
int mul;
mul=num1*num2;
return mul;
}
public int division(int num1,int num2){
int div;
div=num1/num2;
return div;
}
    
public void setSalida(int Rsuma,int Rresta,int Rmultiplicacion,int Rdivision){
    System.out.println("la suma es: "+Rsuma);
    System.out.println("la suma es: "+Rresta);
    System.out.println("la suma es: "+Rmultiplicacion);
    System.out.println("la suma es: "+Rdivision);
}  
    
    
    
    
    
}//fin de la clase
