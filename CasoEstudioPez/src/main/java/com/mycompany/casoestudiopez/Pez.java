
package com.mycompany.casoestudiopez;

/**
 *
 * @author sandracano
 */
public class Pez {

    //Atributos
    String Forma; 
    char Color;
    boolean Textura;
    
    public Pez(){
        
    }
    
    public Pez(String Forma, char Color, boolean Textura){
        this.Color=Color;
        this.Forma=Forma;
        this.Textura=Textura;
    }
    
    //accesores
    public String getForma(){
         return this.Forma;
    }
    
    public char getColor(){
        return this.Color;
    }
    
    public boolean getTextura(){
        return this.Textura;
    }
  
    
    //mutadores
    
    public void setForma(String Forma){
          this.Forma=Forma;
    }
    
    public void setColor(char Color){
        this.Color=Color;
    }
    
    public void setTextura(boolean Textua){
        this.Textura=Textura;
    }
    
  
    
    
    
    public void Nadar(){
        System.out.println("El pez nada");
    }
    
    public void Respirar(){
         System.out.println("El pez respira");
    }
    
    public void Comer(){
         System.out.println("El pez come");
        
    }
    
   
}
