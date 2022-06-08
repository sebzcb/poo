
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Principal{

  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Interface Ventana = new Interface();
        Ventana.CrearMenu();
        Ventana.Configuracion();
        
      
       
        
        
        
        
        /*Ventana.setTitle("Título de la aplicación"); 
        Ventana.setSize(350,150); 
        Ventana.setVisible(true);*/
        
    }
}
