/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploavanceep1;

/**
 *
 * @author sandracano
 */
public class Estudiante {
    
    //metodos
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private int Rut;
    private String Email;

    
    //Accesores
    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public int getRut() {
        return Rut;
    }

    public String getEmail() {
        return Email;
    }
    
    //mutadores
    public void setNombres(String Nombres1) {
        Nombres = Nombres1;
    }

    public void setApellidos(String Apellidos1) {
        Apellidos = Apellidos1;
    }

    public void setEdad(int Edad1) {
        Edad = Edad1;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    //comportamientos 
    
    public void CrearEstudiante(Estudiante Objeto){
        
        System.out.println("Nombres:"+ Objeto.Nombres);
        System.out.println("Apellidos:"+ Objeto.Apellidos);
        System.out.println("Rut:"+ Objeto.Rut);
        System.out.println("Email:"+ Objeto.Email);
        
    }
    
    
    public void LeerEstudiante(int Rut){
        System.out.println("Leer el estudiante"+ Rut);
    }
    
    public void ActualizarEstudiante (int Rut){
        System.out.println("Modificando el estudiante"+ Rut);
    }
    
    public void EliminarEstudiante (int Rut){
        System.out.println("Eliminar Estudiante"+ Rut);
    }
    
    
    
    
}
