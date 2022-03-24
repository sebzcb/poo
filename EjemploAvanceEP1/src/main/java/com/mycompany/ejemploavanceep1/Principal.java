/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejemploavanceep1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author sandracano
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void InsertarDatosArchivos() throws FileNotFoundException{
        //leer un archivo txt
     String file = "src/test/java/estudiantes.txt";
     int i=0;
     
     try{
         
         File archivo=new File(file);
         System.out.println(archivo.getAbsolutePath());
         Scanner scanner = new Scanner(archivo);
         
         while (scanner.hasNext()) {
                  String []datos=scanner.next().split(";");
                  System.out.print("Linea "+i + " Nombres:"+datos[0]);
                  System.out.print(" Apellidos:"+datos[1]);
                  System.out.print(" Edad:"+datos[2]);
                  System.out.print(" RUT:"+datos[3]);
                  System.out.println(" Email:"+datos[4]);
                  i++;
         }
          scanner.close();
     }catch (FileNotFoundException e) {
        e.printStackTrace();
    }
     
     
     

    }
     
    public static void main(String args[]) throws FileNotFoundException {
       
        
        InsertarDatosArchivos();
        
         //ingresar datos 
         int tamanyo=5;
         
         Estudiante[] estudiantes=new Estudiante[tamanyo];
         
         
        //insertar datos con un for --por lo que los datos son repetidos
         
        for(int i=0;i<estudiantes.length;i++){
            estudiantes[i]=new Estudiante();
            estudiantes[i].setNombres("Pepito");
            estudiantes[i].setApellidos("Perez");
            estudiantes[i].setEdad(20);
            estudiantes[i].setRut(1222);
            estudiantes[i].setEmail("pepito.perez@gmail.com");
         }
         
         System.out.println("Dato Nombre: "+ estudiantes[3].getNombres());
         
         //otra forma de insertar datos
            Estudiante estudiante=new Estudiante();
            estudiante.setNombres("Pepito");
            estudiante.setApellidos("Perez");
            estudiante.setEdad(20);
            estudiante.setRut(1222);
            estudiante.setEmail("pepito.perez@gmail.com");
            estudiante.CrearEstudiante(estudiante);
           
            //..... así harían para las otras clases.
            
        
        
        
        
    }
}
