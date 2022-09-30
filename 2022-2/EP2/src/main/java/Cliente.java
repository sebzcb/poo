/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */

import java.util.ArrayList;
import java.util.Date;


public class Cliente {
    private String rut;
    private String nombre;
    
    private ArrayList<Cliente> LCliente=new ArrayList<Cliente>();
    public Operaciones operaciones=new Operaciones();
    
    public Cliente(){
        
    }
    
    public Cliente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void CrearDatos(){
        String nombre;
        String rut;
        Reporte reporte=new Reporte("Cliente.csv");
         
        operaciones.Mensaje("Digite el nombre");
        nombre=operaciones.ValidarCadena();
        while(nombre.equals(null)){
            operaciones.Mensaje("Digite el nombre");
            nombre=operaciones.ValidarCadena();
        }
        
        operaciones.Mensaje("Digite el rut");
        rut=operaciones.ValidarRUT();
        while(nombre.equals(null)){
            operaciones.Mensaje("Digite el rut");
            nombre=operaciones.ValidarCadena();
        }
        
        LCliente.add(new Cliente(nombre,rut));
        //guardo en CSV
        String[] header = { "RUT","Nombre"};
        reporte.EscribirCliente(header, LCliente);
        
        
        
        
        
        
    }
    
    public void ImprimirDatos(){
        
    }
    
    public void EliminarDatos(){
        
    }
    
    
    
}
