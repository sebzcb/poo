/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofacturacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sala
 */
public class Persona {
    private String Nombre;
    private String Rut;
    private Date FechaN;
    private ArrayList<Persona> LPersona=new ArrayList<Persona>();
    
    

    public Persona(){
        
    }
    public Persona(String Nombre, String Rut, Date FechaN) {
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.FechaN = FechaN;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getRut() {
        return Rut;
    }

    public Date getFechaN() {
        return FechaN;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public void setFechaN(Date FechaN) {
        this.FechaN = FechaN;
    }
    
    public boolean BuscarPersona(String Rut){
        
        return false;
    }
    
     public boolean BuscarPersona(String Rut,String Nombre){

        return false;
    }
    
    
    
    public void CrearDatos() throws ParseException{
        String Nombre,Rut;
        Date Fecha;
        String Fecha2;
        
        Scanner Entrada=new Scanner(System.in);

        System.out.println("Ingrese el Nombre:");
        Nombre=Entrada.next();
        
        System.out.println("Ingrese el Rut:");
        Rut=Entrada.next();
        
        System.out.println("Ingrese el Fecha(dd/mm/yyyy):");
        Fecha2=Entrada.next();
        
        Fecha=new SimpleDateFormat("dd/mm/yyyy").parse(Fecha2);
        LPersona.add(new Persona(Nombre,Rut,Fecha));
        
        System.out.println("Dato Creado!!!!");
        
        
    }
    
    public void ImprimirDatos(){
        
        for(int i=0;i<LPersona.size();i++){
            System.out.println("El Primer dato contiene:"+(i+1));
            System.out.println("Nombre"+LPersona.get(i).Nombre);
            System.out.println("Rut "+LPersona.get(i).Rut);
            System.out.println("Nombre"+LPersona.get(i).FechaN);
            
            LPersona.remove(i);
        }
        
    }
    
    
}
