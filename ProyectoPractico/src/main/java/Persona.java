
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
    
    
    //atributos 
    
    private String Nombres;
    private String Apellidos;
    private Date FechaNacimiento;
    private Integer Edad;
    private String Rut;
    

    //constructor
    
    public Persona(){
        
    }
    
    public Persona(String nombres){
        Nombres=nombres;
    }
    
    public Persona(String Nombres,String Apellidos,Date FechaNacimiento,Integer Edad, String Rut){
        this.Nombres=Nombres;
        this.Apellidos=Apellidos;
        this.FechaNacimiento=FechaNacimiento;
        this.Edad=Edad;
        this.Rut=Rut;
    }
    
    //accesores

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public Integer getEdad() {
        return Edad;
    }

    public String getRut() {
        return Rut;
    }
    
    //mutadores

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }
    
    
    
    
    
    
    
    
    
    
}
