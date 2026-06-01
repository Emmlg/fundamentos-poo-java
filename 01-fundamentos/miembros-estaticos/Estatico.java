/**
 * EJERCICIO: miembros-estaticos | Estatico
 * ---------------------------------------------------------------
 * Concepto: Fundamentos de Programación Orientada a Objetos
 * 
 * DESCRIPCIÓN: 
 * Implementación de la clase Estatico para el ejercicio 'miembros-estaticos'.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 */
public class Estatico {
    
  // private  String frase="hola mundo";    
    private static String frase="hola mundo Estatico";// esta la informacion del inicio pero cambia
    
    
    //creacion de metododo statico
    public static int suma(int n1,int n2){
    int suma=n1+n2;
    return suma;
    }
    
    
    
    
    
    
    
    
     public static void main (String[] arg){
    
    Estatico ob1=new Estatico();
    Estatico ob2=new Estatico();
    
 //  ob2.frase="Hola nuevo mundo";//en este apartaado podemos ver como el objeto2 modifica la inf del objeto
    
          // parte estatica
    ob2.frase="Hola mundo modificado";// aqui podemos ver como el ob2 modifca a la inf de manera genral ya que es statico
    
    
         System.out.println(ob1.frase);
         System.out.println(ob2.frase);
  
    
 // al hacer  static a un atributo ahora pertenece a la clase
 
 // de esta manera podemos acceder sin necesidad de crear un objeto
 
         System.out.println(Estatico.frase);// ponemos el nombre de la clase y despues el atributo
    
         
         // como creamos un metodo statico ahora no es necesario crar un objeto
         
         System.out.println("la suma es: "+Estatico.suma(4, 3));
         
         
         
}}
