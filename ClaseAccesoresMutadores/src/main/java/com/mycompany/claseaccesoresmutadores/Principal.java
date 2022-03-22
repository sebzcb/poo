/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.claseaccesoresmutadores;

/**
 *
 * @author sandracano
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
         Animal Objeto=new Animal();
         
         
         /*Objeto.Color='C';
         Objeto.Nombre="Enriqueto";
         Objeto.Edad=12;
         Objeto.Peso= 12.2f;
         Objeto.Altura=23.2f;
         
         */
         
         //usando mutadores
         Objeto.setColor('C');
         Objeto.setNombre("Enriqueto");
         Objeto.setEdad(12);
         Objeto.setPeso(12.2f);
         Objeto.setAltura(23.2f);
         
         //usando Accesores
            System.out.println("Color:"+ Objeto.getColor());
            System.out.println("Nombre:"+ Objeto.getNombre());
            System.out.println("Edad:"+ Objeto.getEdad());
            System.out.println("Peso:"+ Objeto.getPeso());
            System.out.println("Altura:"+ Objeto.getAltura());
         
        
    }
}
