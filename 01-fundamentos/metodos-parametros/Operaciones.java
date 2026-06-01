
public class Operaciones {
    
  //atributos
  int suma,resta,division,multiplicacion;  
    
    
    
    
    //metodos
    public void sumar(int numero1,int numero2){
    suma=numero1+numero2;
    }
    public void resta(int numero1,int numero2){
    resta=numero1-numero2;
    }    
    
       public void multiplicar(int numero1,int numero2){
    multiplicacion=numero1*numero2;
    } 
       public void division(int numero1,int numero2){
    division=numero1/numero2;
    } 
    public void  setResultados(){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+division);
    }
    
    
    
}//fin de la clase
