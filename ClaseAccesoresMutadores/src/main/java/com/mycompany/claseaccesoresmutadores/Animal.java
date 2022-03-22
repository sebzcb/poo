/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseaccesoresmutadores;

/**
 *
 * @author sandracano
 */
public class Animal {
    
    String Nombre;
    char Color;
    float Peso;
    float Altura;
    int Edad;
    
    //accesores
    public String getNombre(){
        return Nombre;
    }
   
    public char getColor(){
        return Color;
    }
    
    public float getPeso(){
        return Peso;
    }
    
    public float getAltura(){
        return Altura;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    //mutadores
    
    public void setNombre(String Nombre1){
        Nombre=Nombre1;
    }
    public void setColor(char Color1){
        Color=Color1;
    }
    
    public void setPeso(float Peso1){
        Peso=Peso1;
    }
    
    public void setAltura(float Altura1){
        Altura=Altura1;
    }
    
    
    public void setEdad(int Edad1){
        Edad=Edad1;
    }
    
    //Comportamientos
    
    public void Comer(){
        System.out.println("Esta comiendo");
    }
    
    public void Dormir(){
        System.out.println("Esta durmiendo");
    }
    
    public void Correr(){
        System.out.println("Esta corriendo");
    }
    
    public void Rebuznar(){
        System.out.println("Esta rebuznando");
    }
    
    
}
