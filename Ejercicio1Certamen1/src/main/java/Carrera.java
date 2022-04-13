
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Carrera {
    private int IdCarrera;
    private String nombre;
    
    private ArrayList<Estudiante> LEstudiante=new ArrayList<Estudiante>();
    private ArrayList<Carrera>LCarrera=new ArrayList<Carrera>();
    
    public Carrera(){
        
    }

    Carrera(int idCarrera, String nombre) {
        this.IdCarrera=idCarrera;
        this.nombre=nombre;
    }
    
    public int getIdCarrera() {
        return IdCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getLEstudiante() {
        return LEstudiante;
    }

    public void setIdCarrera(int IdCarrera) {
        this.IdCarrera = IdCarrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLEstudiante(ArrayList<Estudiante> LEstudiante) {
        this.LEstudiante = LEstudiante;
    }
    
    
    public boolean agregarEstudiante(Estudiante objeto){
        
        //validación
        for(int i=0;i<LEstudiante.size();i++){
            if(LEstudiante.get(i).getRut()==objeto.getRut())
                return false;
            
        }

        LEstudiante.add(objeto);
        return true;
    }
    
    
    public Estudiante obtenerEstudiante (int rut){
        
        for(int i=0;i<LEstudiante.size();i++){
             if(LEstudiante.get(i).getRut()==rut)
                 return LEstudiante.get(i);
        }
        return null;
    }
    
    
}
