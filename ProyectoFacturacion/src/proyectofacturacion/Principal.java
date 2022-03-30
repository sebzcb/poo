/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofacturacion;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Sala
 */
public class Principal {
    
    public static Persona personita;
    
    public static void Menu(){
        System.out.println("1- Crear Persona");
        System.out.println("2- Imprimir datos Persona");
        System.out.println("3- Crear Factura");
        System.out.println("4- Imprimir Factura");
        System.out.println("5- Salir");
        
    }
    
    public static void main(String [] args) throws ParseException{
        int Opcion;
        Scanner Entrada=new Scanner(System.in);
 
        do{
            Menu();
             personita=new Persona();
            System.out.println("Digite una opción de menu ");
            Opcion=Entrada.nextInt();
            switch(Opcion) {
                case 1:
                   
                    personita.CrearDatos();
                break;
                    
                    
                case 2:
                   
                    personita.ImprimirDatos();
                break;
                    
                    
                case 3:
                break;
                    
                    
                case 4:
                break;
            }
            
        }while(Opcion!=5);
        
        
        
        
        
    }
    
    
    
}
