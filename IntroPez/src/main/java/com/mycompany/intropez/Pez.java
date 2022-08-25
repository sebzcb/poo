/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intropez;

/**
 *
 * @author sandracano
 */
public class Pez {
    
    //atributos
    
    public String Tamanyo;
    public char Color;
    public int Textura;
    
    //constructor
    public Pez(String var1, char var2, int var3){
        
        this.Tamanyo=var1;
        this.Color=var2;
        this.Textura=var3;
        
    }
    
    //comportamientos
    
    public void Nadar(){
        System.out.println("Nadando");
        
    }
    
    public void Dormir(boolean estado){
        if(estado)System.out.println("Durmiendo");
        else System.out.println("Despierto");
    }
    
    public void Comer(){
        System.out.println("Comiendo");
    }
    
    
    
}
