/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Operaciones {
    public Scanner Entrada=new Scanner(System.in);
    
    public Operaciones(){
        
    }
    

   public int Menu(){
       
       Mensaje("1-Crear Clientes");
       Mensaje("2-Listar Clientes");
       Mensaje("3-Eliminar Clientes");
       Mensaje("4-Crear Productos");
       Mensaje("5-Crear Facturas");
       Mensaje("6-Listar Facturas");
       Mensaje("7- Salir");       
       Mensaje("Digite la opcion");
       int opcion=Entrada.nextInt();
       
       return opcion;
   }
    
  
    public void Mensaje(String texto){
        System.out.println(texto);
    }
    
    
    public int ValidarEntero(){
        /*
        String cadena=Entrada.next();
        if(cadena.matches("[0-9]*"))
            return Integer.valueOf(cadena);
        else
           Mensaje("Dato no válido");
        
        return 0;*/
        int Cadena=-1;
       do{
        try{
           Cadena=Entrada.nextInt();
           return Cadena;
           
        }catch(Exception e){
            Mensaje("Dato no válido "+e.toString());
        }
        
       }while(Cadena<0 || Cadena==0);
        
       
        return Cadena;
    }
    
    public String ValidarCadena(){
        /*
        String cadena=Entrada.next();
        if(cadena.matches("[A-Za-z]*"))
            return cadena;
        else
           Mensaje("Dato no válido");
        
        return null;
        */
        String Cadena=null;
      do{
        try{
         Cadena=Entrada.next();
        }catch(Exception e){
           Mensaje("Este dato no es válido");   
        }
       }while(Cadena==null);
        
        return Cadena;
    }
    
    public double ValidarDouble(){
        /*String cadena=Entrada.next();
        if(cadena.matches("[0-9.]*"))
            return Double.valueOf(cadena);
        else
          Mensaje("Dato no válido");
        return 0;
        */
        
        double Cadena;
        try{
         Cadena=Entrada.nextDouble();
         return Cadena;
         
        }catch(Exception e){
           Mensaje("Este dato no es válido");   
        }
        return -1;
        
    }
    
    public String ValidarAlfanumerico(){
        String cadena=Entrada.next();
        if(cadena.matches("[A-Za-z0-9]*"))
            return cadena;
        else 
           Mensaje("Dato no válido");
        
        return null;
    }
    
    public String ValidarFecha(){
        return null;
    } 

}
