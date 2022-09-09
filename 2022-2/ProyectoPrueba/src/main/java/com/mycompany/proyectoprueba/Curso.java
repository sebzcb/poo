/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprueba;
import java.util.Scanner;
/**
 *
 * @author sandracano
 */
public class Curso {
    
    private String codigo;
    private String nombre;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void CrearCurso(){
        
        Scanner Entrada=new Scanner(System.in);
        
        System.out.println("Ingreso el código del curso");
        this.codigo=Entrada.next();
        System.out.println("Ingrese el nombre del curso");
        this.nombre=Entrada.next();
        
        
        
    } //CRUD Crear Leer, Actualizar , Borrar
    
    public  void LeerCurso(){
        
        
    }
    
    
    
}
