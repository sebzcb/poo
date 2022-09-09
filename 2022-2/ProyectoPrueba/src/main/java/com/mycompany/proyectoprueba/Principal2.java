/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyectoprueba;
import java.util.Scanner;
/**
 *
 * @author sandracano
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       int opcion=-1;
       Scanner Entrada=new Scanner(System.in);
       
       
       
       
       do{
        menu();
        opcion=Entrada.nextInt();
        
        switch(opcion){
            case 1:
                 
               break;
               
               
            case 2:
            
            break;
            
            default:
                
                System.out.println("No es una opción del menu");
                
                break;
        }
        
       }while(opcion!=0);
        
    }
    
    
    public static void menu(){
        
        
        System.out.println("1- Crear Cursos");
        System.out.println("2- Crear Persona");
        System.out.println("0- Salir");
        
        System.out.println("Digite una opcion del menu");
    }
}
