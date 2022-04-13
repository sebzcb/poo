
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

    /**
     * @param args the command line arguments
     */
    
    public static Estudiante estudiante;
    public static Carrera carrera;
    public static Universidad universidad;
    
    public static void main(String args[]) {
        //datos estudiante
        int rut;
        String nombre;
        int idCarrera;
        
        Scanner Entrada=new Scanner(System.in);
        
        
        //crear Carrera
        System.out.println("ID Carrera");
        idCarrera=Entrada.nextInt();
        System.out.println("Nombre Carrera");
        nombre=Entrada.next();
        universidad=new Universidad();
        carrera=new Carrera();
        
        
        if(universidad.agregarCarrera(new Carrera(idCarrera,nombre)))
            System.out.println("Carrera creado!!");
        else
            System.out.println("ya existe");
        
        
        
        //insertar datos del estudiante
        System.out.println("Digite los datos ");
        System.out.println("Rut Estudiante");
        rut=Entrada.nextInt();
        System.out.println("Nombre del estudiante");
        nombre=Entrada.next();
        System.out.println("carrera a la que pertenece");
        idCarrera=Entrada.nextInt();
        
        System.out.println(universidad.getLCarrera().size());
        
        estudiante=new Estudiante(rut,nombre);
        
        if(universidad.agregarEstudiante(idCarrera, estudiante))
            if(carrera.agregarEstudiante(estudiante)){
                System.out.println("Estudiante fue creado!");
            }

        else
           System.out.println("Estudiante no fue creado!");
        
        
        
       

    }
   
}
