/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cliente {
    
    //globales
    public Operaciones operaciones=new Operaciones();
    public ArrayList<Cliente> Lclientes=new ArrayList<Cliente>();
    
    
    //atributos
    private String Rut;
    private String Nombre;
    private int Telefono;
    
    
    public Cliente(){
        
    }

    
    public Cliente(String Rut, String Nombre, int Telefono) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
    public void InsertarDatos(){
        
        String nombre,rut;
        int telefono;
        
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Digite el rut");
        rut=Entrada.next();
        
        System.out.println("Digite el nombre ");
        nombre=Entrada.next();
        
        System.out.println("Digite el telefono");
        telefono=Entrada.nextInt();
        
        Cliente cliente=new Cliente(rut,nombre, telefono);
        Lclientes.add(cliente);
        
        System.out.println("CLiente creado!");
        
        

        /*
        operaciones.Mensaje("Ingrese la cédula");
        cedula=operaciones.ValidarEntero();
        
        if(!BuscarClientes(cedula)){
        
            operaciones.Mensaje("Ingrese el Nombre");
            nombre=operaciones.ValidarCadena();


            operaciones.Mensaje("Ingrese el telefono");
            telefono=operaciones.ValidarEntero();

            Cliente clientes=new Cliente(cedula,nombre,telefono);
            Lclientes.add(clientes);
        }else{
           operaciones.Mensaje("Cédula existe");
        }
      */
        
        
    }
    
    public boolean BuscarClientes(String rut){
        
        
        for(int i=0;i<Lclientes.size();i++){
            
            if(Lclientes.get(i).Rut.equals(rut)){
                return true;
            }
        }

        return false;
    }
    
    
    public Cliente RCliente(String rut){
        for(int i=0;i<Lclientes.size();i++){
            
            if(rut.equals(Lclientes.get(i).Rut))
                
                return Lclientes.get(i);
            
        }

        return null;   

    }
    
    
    
    public void ImprimirDatos(){
        
        for(int i=0;i<Lclientes.size();i++){
            operaciones.Mensaje("Nombre:"+Lclientes.get(i).Nombre+"\nCedula"+Lclientes.get(i).Rut+"\n"+" Telefono"+Lclientes.get(i).Telefono);
        }
    }
    
    
    /*
    public void EliminarClientes(){
        operaciones.Mensaje("Digite la cédula a eliminar");
        int cedula=operaciones.ValidarEntero();
        
        for(int i=0;i<Lclientes.size();i++){
            if(cedula==Lclientes.get(i).Cedula){
                Lclientes.remove(i);
                operaciones.Mensaje("Cédula eliminada");
            }
        }
    }*/
    
    
}