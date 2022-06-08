

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Cliente extends Persona{
    
   
    private String Nombre;
    private String Apellidos;
    private boolean Estado;
    private Date FechaNacimiento;
    private String [] Region={"Valparaíso","Quilpue","Petorca","Villa Alemana"};
    private String RRegion;
    
    public Cliente(){
        super();
        
    }

    public Cliente(String Nombre, String Apellidos, boolean Estado, Date FechaNacimiento, String RUT, String RRegion) {
        super(RUT);
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Estado = Estado;
        this.FechaNacimiento = FechaNacimiento;
        this.RRegion=RRegion;
    }

    public String[] getRegion() {
        return Region;
    }
    
    
    
    

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public boolean isEstado() {
        return Estado;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setRRegion(String RRegion) {
        this.RRegion = RRegion;
    }
    

     public void InsertarDatos(){
        
        InterfaceClientes cliente=new InterfaceClientes("Crear Cliente"); 
        cliente.ConstuirFormulario();

              
        
    }
     
   
    
   
   
    
    public void EliminarDatos(String Rut){
      
    }
    
    public int BuscarCliente(String Rut){
    
        
        return 0;
    }
    
    
    
    public void ImprimirDatos(){
        
 
        
    }
    
    
  
}