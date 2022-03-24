/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploavanceep1;

/**
 *
 * @author sandracano
 */
public class Curso {
    
    private String Nombre;
    private int Codigo;
    private int horas;
    private String Profesor;

    
    
    //accesores
    public String getNombre() {
        return Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getHoras() {
        return horas;
    }

    public String getProfesor() {
        return Profesor;
    }
    
    
    //mutadores

    public void setNombre(String Nombre1) {
        Nombre = Nombre1;
    }

    public void setCodigo(int Codigo1) {
        Codigo = Codigo1;
    }

    public void setHoras(int horas1) {
        horas = horas1;
    }

    public void setProfesor(String Profesor1) {
       Profesor = Profesor1;
    }
    
    //comportamientos
    public void CrearCurso(){
        System.out.println("Insertar Curso");
    }
    
    
    public void LeerCurso(int Rut){
        System.out.println("Leer el curso"+ Rut);
    }
    
    public void ActualizarCurso (int Rut){
        System.out.println("Modificando el curso"+ Rut);
    }
    
    public void EliminarCurso (int Rut){
        System.out.println("Eliminar curso"+ Rut);
    }
    
    
    
    
}
