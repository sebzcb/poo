
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Estudiante {
    
    private int rut;
    private String nombre;
    
    private ArrayList<Carrera>LCarrera=new ArrayList<Carrera>();
    
    public Estudiante(){
        
    }

    public Estudiante(int rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
      
        
    }

    
    public int getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
