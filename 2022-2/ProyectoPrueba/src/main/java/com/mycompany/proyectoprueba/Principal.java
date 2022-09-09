/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyectoprueba;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author sandracano
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<Persona>ColeccionPersona;
    
    public static void main(String args[]) {
        //declaracion
        Curso ObjetoCurso;
        Date fecha;
        Persona objetoPersona;
        ArrayList<Curso> ColeccionCurso;
        
        ColeccionPersona=new ArrayList<Persona>();
        
        ColeccionCurso=new ArrayList<Curso>();
        ObjetoCurso=new Curso("INF3240","POO");
        ColeccionCurso.add(ObjetoCurso);
        ObjetoCurso=new Curso("INF4240","Ing web");
        ColeccionCurso.add(ObjetoCurso);
        ObjetoCurso=new Curso("INF4240","Operaciones");
        ColeccionCurso.add(ObjetoCurso);
        try{
        //fecha 
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
        fecha=new Date();
        fecha=formatoFecha.parse("21/10/2003");
        objetoPersona=new Persona("pepito","1223-12",fecha,ColeccionCurso);
        
        ColeccionPersona.add(objetoPersona);
        
        ColeccionCurso=new ArrayList<Curso>();
        ObjetoCurso=new Curso("INF4240","Operaciones");
        ColeccionCurso.add(ObjetoCurso);
        
        
        objetoPersona=new Persona("pepito","1223-12",fecha,ColeccionCurso);
        ColeccionPersona.add(objetoPersona);
        
        }catch(ParseException e){
            
        }
        
        
        //recorrer coleccion
        
        for(int i=0;i<ColeccionPersona.size();i++){
             System.out.println("Nombre"+ColeccionPersona.get(i).getNombre());
             for(int j=0;j<ColeccionPersona.get(i).getListaCurso().size();j++){
                 System.out.println("Cursos que ve: "+ColeccionPersona.get(i).getListaCurso().get(j).getNombre());
             }
             
        }
        
        
        //C//oleccionPersona.add(new Persona)
        
        
    }
}
