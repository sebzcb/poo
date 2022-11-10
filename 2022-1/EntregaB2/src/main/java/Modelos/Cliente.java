/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sandracano
 */
public class Cliente {
    
    private String Nombre; 
    private String Apellidos;
    private String Rut;
    private Date FechaNacimiento;
    
    private ArrayList<Cliente> LCliente=new ArrayList<Cliente>();

    public Cliente(String Nombre, String Apellidos, String Rut, Date FechaNacimiento) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Rut = Rut;
        this.FechaNacimiento = FechaNacimiento;
    }

    public ArrayList<Cliente> getLCliente() {
        return LCliente;
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
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

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setLCliente(ArrayList<Cliente> LCliente) {
        this.LCliente = LCliente;
    }
    
    
    
    
    
}
