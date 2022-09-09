/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprueba;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author sandracano
 */
public class Persona {
    
    private String Nombre;
    private String Rut;
    private Date FechaNacimiento;
    
    private ArrayList<Curso>ListaCurso=new ArrayList<Curso>();
    private ArrayList<Persona>ColeccionPersona=new ArrayList<Persona>();
    

    public Persona(String Nombre, String Rut, Date FechaNacimiento,ArrayList<Curso> ListaCursos) {
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.FechaNacimiento = FechaNacimiento;
        this.ListaCurso=ListaCursos;
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

    public ArrayList<Curso> getListaCurso() {
        return ListaCurso;
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

    public void setListaCurso(ArrayList<Curso> ListaCurso) {
        this.ListaCurso = ListaCurso;
    }
    
    
    public void CrearPersona(){
        
    }
    
    
}
