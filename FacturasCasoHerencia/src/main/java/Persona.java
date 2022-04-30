
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Persona {
    
    private String Nombre;
    private String Rut;
    private Date FechaNacimiento;

    public Persona() {
    }

    public Persona(String Nombre, String Rut, Date FechaNacimiento) {
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.FechaNacimiento = FechaNacimiento;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public String getRut() {
        return Rut;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    public void CrearDatos(){
        
    }
    
    public void ActualizarDatos(String Rut){
        
    }
    
    
    public void EliminarDatos(){
        
    }
    
    public void ConsultarDatos(String Rut){
        
    }
    
    
}
