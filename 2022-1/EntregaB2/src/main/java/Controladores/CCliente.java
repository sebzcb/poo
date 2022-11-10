/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;


import Modelos.Cliente;
import Vista.VCliente;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sandracano
 */
public class CCliente {
    
    public Conexion conexion=new Conexion();
    public Cliente Mcliente;
    public VCliente Vcliente;
    public ArrayList<Cliente> LCliente=new ArrayList<Cliente>();
    
    
    public boolean CrearCliente(String Nombre, String Apellidos,String rut, Date FechaNacimiento ){
        
        Mcliente=new Cliente(Nombre, Apellidos,rut,FechaNacimiento);
        LCliente.add((Mcliente));
        
        conexion.Conectar();
        
        conexion.InsertarDatos("INSERT INTO Clientes (Rut, Nombre,Apellidos,FechaNacimiento) VALUES('"+rut+"','"+Nombre+"','"+Apellidos+"','"+FechaNacimiento.toString()+"')");
        
        conexion.Cerrar();
        

        return true;
        
        
    }
    
    
    
   
    
}
