/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intropez;

/**
 *
 * @author sandracano
 */

import java.util.*;

public class Principal {
    
    
    public static void main(String[]args){
        
        //declaraciones
        Scanner Entrada;
        int NumeroPeces=0,Textura=0;
        Pez[] pececitos;
        String Tamanyo;
        char Color;
        
                
                
        Entrada=new Scanner(System.in);
        String[] frutas1=new String[10];
        String[] frutas2={"Papaya","Piña","Pera","Mora"};
        
        System.out.println("Digite cuantos peces ingresará en la pecera");
        NumeroPeces=Entrada.nextInt();
        pececitos=new Pez[NumeroPeces];
        
        for(int i=0;i<pececitos.length;i++){
             System.out.println("Digite los datos del pez "+(i+1));
             
             System.out.println("Tamaño:");
             Tamanyo=Entrada.next();
             System.out.println("Color:");
             Color=Entrada.next().charAt(0);
             System.out.println("Textura:");
             Textura=Entrada.nextInt();
             
             pececitos[i]=new Pez(Tamanyo,Color, Textura);
               
             
        }
        
        System.out.println("En la pecera hay "+pececitos.length + "peces");
        
        for(int i=0;i<pececitos.length;i++){
            System.out.println("pez "+(i+1));
            System.out.println("Tamaño:"+pececitos[i].Tamanyo);
            System.out.println("Color:"+pececitos[i].Color);
            System.out.println("Textura:"+pececitos[i].Textura);
            
            //comportamientos
    
            System.out.println("¿qué está haciendo ahora?");
            pececitos[i].Nadar();
            
        }
        
        
       
        
        
        
        
        
        
    }
    
}
