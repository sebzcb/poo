/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        
        try{
            String cadena=Entrada.next();
        if(cadena.matches("[0-9]*"))
            return Integer.valueOf(cadena);
        else
           Mensaje("Dato no válido");
        }catch(Exception e){
           Mensaje("Este dato no es válido"); 
        }
        
        
        return 0;
        
    }
    
    public String ValidarCadena(){
        
        try{
            String cadena=Entrada.next();
            if(cadena.matches("[A-Za-z]*"))
                return cadena;
            else
               Mensaje("Dato no válido");

        }catch(Exception e){
            Mensaje("Este dato no es válido");
        }
        return null;
    }
    
   
 
    public String ValidarAlfanumerico(){
       try{
        String cadena=Entrada.next();
        if(cadena.matches("[A-Za-z_0-9-]*"))
            return cadena;
        else 
           Mensaje("Dato no válido");
        
       }catch(Exception e){
           Mensaje("Este dato no es válido"); 
       } 
        return null;
    }
    
    public Date ValidarFecha(){
        String cadena=Entrada.next();
        DateFormat fecha = new SimpleDateFormat(cadena);
        Date salida;
        fecha.setLenient(false);
        try {
            salida=fecha.parse(cadena);
        } catch (ParseException e) {
            Mensaje("Este dato no es válido"); 
            return null;
        }
        return salida;
    } 
    
    
    public String ValidarRUT(){
         try{
            String cadena=Entrada.next();
            if(cadena.matches("[0-9|.]{1,10}-[K|k|0-9]*"))
                return cadena;
            else
               Mensaje("Dato no válido");

        }catch(Exception e){
            Mensaje("Este dato no es válido");
        }
        return null;
       
    }
    
    

}
