/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel lopez 9/julio/2022
 */
public class Main_0 {
    public static void main(String[] args) {
      
     SpiderMan_01 spiders[]=new SpiderMan_01[4];
     
     spiders[0]=new SpiderMilesMorales_02("Miles morales","Tierra-1610","Kangaroo","Aaron Davis");
     spiders[1]=new SpiderWomen_03("Gwen Stacy", "Tierra-65","King Pin", "Ghost spider o White Widow");
     spiders[2]=new SpiderPeniParker_04(" Peni Parker", "Tierra-14512", "sin Enemigos", "Japonesa");
     spiders[3]=new SpiderHam_05("Peter Benjamin Porker", "Tierra-8311", " Rana-Toro", "cerdo mutado");
        
        for(SpiderMan_01 spiderMan_01:spiders){
            System.out.println(spiderMan_01.mostrarDatos());
            System.out.println("");
        }
        
        
        // son dos formas de instanciar los objetos
        
     
        /*
        
    //    SpiderMan_01 spiderman=new SpiderMan_01("piter Parker", "tierra", "varios villanos");
        SpiderMan_01 MilesMorales=new SpiderMilesMorales_02("Miles morales","Tierra-1610","Kangaroo","Aaron Davis");
        SpiderMan_01 spiderWomen=new SpiderWomen_03("Gwen Stacy", "Tierra-65","King Pin", "Ghost spider o White Widow");
        SpiderMan_01 peniParker=new SpiderPeniParker_04(" Peni Parker", "Tierra-14512", "sin Enemigos", "Japonesa");
        SpiderMan_01 spiderHam=new SpiderHam_05("Peter Benjamin Porker", "Tierra-8311", " Rana-Toro", "cerdo mutado");
        
        System.out.println(//spiderman.mostrarDatos()+
        "\n"+ MilesMorales.mostrarDatos()+
        "\n"+spiderWomen.mostrarDatos()+
        "\n"+ peniParker.mostrarDatos()+
        "\n"+spiderHam.mostrarDatos());
     
        */
       
        
      
        
        
        
        
        
    }    
}
