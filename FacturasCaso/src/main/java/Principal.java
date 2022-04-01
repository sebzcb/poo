
import java.text.ParseException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Principal {

    public static Operaciones operaciones=new Operaciones();
    public static Factura facturas=new Factura();
    public static Cliente clientes=new Cliente();
    
    
    public static void Menu(){
        
    }
    
    
    public static void main(String args[]) throws ParseException {
       Scanner Entrada;
       int opcion;
       do{
           
            System.out.println("1- Crear Cliente");
            System.out.println("2- Imprimir Clientes");
            System.out.println("3- Crear Factura");
            System.out.println("4- Imprimir Factura");
            System.out.println("5- Salir");

            System.out.println("Digite la opcion: ");
            Entrada=new Scanner(System.in);
            opcion=Entrada.nextInt();
           
           switch(opcion){
               case 1:
                    //Crear cliente
                   clientes.InsertarDatos();
               break;
               
               case 2:
                   //Imprimir cliente
                   clientes.ImprimirDatos();
               break;
               
               case 3:
                   //crear Facturas
                   facturas.InsertarDatos(clientes);
               break;
               
               case 4:
                    //Imprimir Facturas
                    facturas.ImprimirDatos();
               break;
               
              
           }

       }while(opcion!=5);
       
       
    }
    
 }
 
