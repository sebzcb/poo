/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Interface extends Frame {
    
    
         private MenuBar menu;
         
         public Interface(){
             
             

            //registrar eventos

            
            
            /* cancel.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  //dispose();
                  System.out.println("Cerrar la interface");
              }
            });
             
             ok.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  
                  Interface1 interfaceN=new Interface1();
                  interfaceN.setVisible(true);
                 
              }
            });*/
             
            
            this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
            });
         }

         public void Configuracion(){
             
                this.setTitle("Tienda");
                this.setSize(1000, 600);// w,h
                this.setLocation(100,100);
                
                
                
                Font titleFont = new Font("arial", Font.BOLD, 25);
                Font labelFont =new  Font("arial", Font.PLAIN, 18);
                Font textFont =new  Font("arial", Font.PLAIN, 15);
         
                
                FlowLayout miFlowLayout = new FlowLayout(FlowLayout.CENTER);
               
                Label lblMessage= new Label("Bienvenidos a mi aplicación");
                
               
                this.setLayout( miFlowLayout );
                this.add(lblMessage);
                
                this.setVisible(true);
                
                
                
                
         }
         
         
         public void CrearMenu(){
             menu= new MenuBar();
             
             Menu menuA = new Menu( "Inicio" );
             Menu menuB = new Menu( "Ayuda" );
             
             MenuItem submenuC=new MenuItem("Clientes");
             menuA.add(submenuC);
             MenuItem submenuR=new MenuItem("Productos");
             menuA.add(submenuR);
          
             
             
             
             
             //actionlistener
             
             submenuC.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       
                         
                         Cliente cliente=new Cliente();
                         cliente.InsertarDatos();
                         
                    }
                    
             });
             
             
             submenuR.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       
                        
                         
                    }
                    
             });
             
             
             
             
             menu.add(menuA);
             menu.add(menuB);
             setMenuBar(menu); 
             
         }
         
}
