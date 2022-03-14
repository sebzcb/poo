
package com.mycompany.casoestudiopez;


/**
 *
 * @author sandracano
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        //constructor sin parámetros
        Pez pececito1=new Pez();
        pececito1.Color='R';
        pececito1.Forma="Redodndo";
        pececito1.Textura=false;
        
        
        Pez pececito2= new Pez();
        pececito2.Color='R';
        pececito2.Forma="Redodndo";
        pececito2.Textura=true;
        
        
        //con constructor con parametros
        
        Pez pececito3=new Pez("Redondo",'R', true);
        
        //acceder al valor
        
        System.out.println("el pececito 3 tiene la forma "+pececito3.getForma());
        System.out.println("el pececito 3 tiene la color "+pececito3.getColor());
        
        
        
        
        
        
        
        
    }
}
