/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Principal {

   public static Operaciones operacion=new Operaciones();
   public static Cliente cliente=new Cliente();
   
   public static void main(String args[]) {
        
       int opcion=0;
        
        while(opcion!=7){
            opcion=operacion.Menu();
            switch(opcion){
                case 1 -> cliente.CrearDatos();
                case 2 -> cliente.ImprimirDatos();
                case 3 -> cliente.EliminarDatos();
                
                
                   
                    
              
            }
            
        }
        
        
   }
    
    
    
}
