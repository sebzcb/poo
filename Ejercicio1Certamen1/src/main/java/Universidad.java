
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Universidad {
    
    private ArrayList<Estudiante>LEstudiante=new ArrayList<Estudiante>();
    private ArrayList<Carrera>LCarrera=new ArrayList<Carrera>();

    public ArrayList<Estudiante> getLEstudiante() {
        return LEstudiante;
    }
    
    public Universidad(ArrayList<Estudiante> Estudiantes,ArrayList<Carrera> Carrera){
        this.LEstudiante=Estudiantes;
        this.LCarrera=Carrera;
    }

    public Universidad() {
       
    }

    public ArrayList<Carrera> getLCarrera() {
        return LCarrera;
    }
    
    public boolean agregarCarrera(Carrera objeto){
        for(int i=0;i<LCarrera.size();i++){
            if(LCarrera.get(i).getIdCarrera()==objeto.getIdCarrera())
                return false;
        }
        
         LCarrera.add(objeto);
         return true;
        
        
    }
    
    public boolean agregarEstudiante(int idCarrera, Estudiante objeto){
        
        for(int i=0;i<LCarrera.size();i++){
            if(LCarrera.get(i).getIdCarrera()==idCarrera)
                 return true;
        }
        
        return false;
    }
    
    
    public Estudiante obtenerEstudiante(int rut){
        
        
        return null;
    }
}
