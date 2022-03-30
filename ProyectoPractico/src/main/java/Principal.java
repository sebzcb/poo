
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException {
        
        Date fecha=new Date(); //casting
        
        System.out.println("fecha es"+ fecha.toString());
        
        
        /*
        Persona persona1=new Persona("Pepito","perez","12/12/2003",12,"12121212");
        Persona persona2=new Persona("Pepito2","perez2","12/12/2003",12,"12121212");
        
        
        Persona persona3=new Persona();
        persona3.setNombres("Pepito3");
        persona3.setApellidos("perez3");
        persona3.setFechaNacimiento("12/02/2002");
        persona3.setEdad(12);
        persona3.setRut("121212-12");
       */
        
        String Nombres,Apellidos,FechaN,rut;
        Integer edad; 
        
        
        /*
        Persona[] personas=new Persona[5];
        
        for(int i=0;i<personas.length;i++){
            
            Scanner Entrada=new Scanner(System.in);
            
            System.out.println ("Vamos a ingresar los datos de la persona "+(i+1));
            
            System.out.println("Ingrese el nombre");
            Nombres=Entrada.next();

            System.out.println("Ingrese Apellidos");
            Apellidos=Entrada.next();

            System.out.println("Ingrese Fecha Nacimiento");
            FechaN=Entrada.next();

            System.out.println("Ingrese Rut");
            rut=Entrada.next();

            System.out.println("Ingrese la edad");
            edad=Entrada.nextInt();
            personas[i]=new Persona();
            personas[i].setNombres(Nombres);
            personas[i].setApellidos(Apellidos);
            personas[i].setFechaNacimiento(FechaN);
            personas[i].setEdad(edad);
            personas[i].setRut(rut);
            
        }*/
        
        //clase vector colección de objetos
    
    Vector Integrantes=new Vector(10,5);
    
        for(int i=0;i<Integrantes.size();i++){
            Scanner Entrada=new Scanner(System.in);
            
            System.out.println ("Vamos a ingresar los datos de la persona "+(i+1));
            
            System.out.println("Ingrese el nombre");
            Nombres=Entrada.next();

            System.out.println("Ingrese Apellidos");
            Apellidos=Entrada.next();

            System.out.println("Ingrese Fecha Nacimiento DD-MM-YYYY");
            FechaN=Entrada.next();

            System.out.println("Ingrese Rut");
            rut=Entrada.next();
            
            System.out.println("Ingrese la edad");
            edad=Entrada.nextInt();
            
            
            
            Date fecha1=new SimpleDateFormat("dd/mm/yyyy").parse(FechaN);
            

            
            Persona personita=new Persona(Nombres,Apellidos,fecha1,edad,rut);
            Integrantes.add(personita);
        } 
    
    
    } //fin de main
}
