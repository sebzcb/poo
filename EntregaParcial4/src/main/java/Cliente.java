

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Cliente implements Persona{
    
   
    private String NombreEmpresa;
    
    private ArrayList <Cliente> Lclientes=new ArrayList<Cliente>();
    private boolean Estado;
    private String Nombre;
    private String Rut;
    private Date FechaNacimiento;
    
    public Operaciones operaciones=new Operaciones();
    
    
    public Cliente(){
       
    }
    
    public Cliente(String nombre, String Rut, Date FechaNacimiento){

        this.Nombre=nombre;
        this.Rut=Rut;
        this.FechaNacimiento=FechaNacimiento;
        
    }

  

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public ArrayList<Cliente> getLclientes() {
        return Lclientes;
    }

    public boolean isEstado() {
        return Estado;
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

    public Operaciones getOperaciones() {
        return operaciones;
    }

   

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public void setLclientes(ArrayList<Cliente> Lclientes) {
        this.Lclientes = Lclientes;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
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

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

  
    
    public void InsertarDatos(){
        String nombre;
        String rut;
        Date FechaNacimiento;
        int tipo;
        int nit=0;
        String NombreEmpresa="";
        
        
        
        operaciones.Mensaje("Digite el nombre");
        nombre=operaciones.ValidarCadena();

        if(nombre!=null){
            System.out.println("Digite el RUT");
            rut=operaciones.ValidarAlfanumerico();
            if(rut!=null){
                System.out.println("Digite la fecha de nacimiento (DD-MM-YYYY)");
                FechaNacimiento=operaciones.ValidarFecha();
                if(FechaNacimiento!=null){
                    
                    
                      Lclientes.add(new Cliente(nombre,rut,FechaNacimiento));
                        
                    
                }
            }
        }
              
        
    }
    
   
   
    
    public void EliminarDatos(String Rut){
        int id=BuscarCliente(Rut);
        if(id>=0){
            Lclientes.remove(id);
        }
        
    }
    
    public int BuscarCliente(String Rut){
         for(int i=0;i<Lclientes.size();i++){
             if(Lclientes.get(i).getRut()==Rut)
                  return i;
         }
         
         return -1;
    }
    
    
    public void ImprimirDatos(){
        
        for(int i=0;i<Lclientes.size();i++){
            operaciones.Mensaje("RUT: "+Lclientes.get(i).getRut());
            operaciones.Mensaje("Nombre: "+Lclientes.get(i).getNombre());
            operaciones.Mensaje("Fecha Nacimiento "+Lclientes.get(i).getFechaNacimiento());
            
 
        }
        
        
        
        
    }
    
    
    

    
}