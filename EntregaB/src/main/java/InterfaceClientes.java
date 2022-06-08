
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfaceClientes extends Frame implements WindowListener, ActionListener, KeyListener {
    
    private Label lblNombre, lblApellidos,lblRut,lblFechaNacimiento,lblRegion,lblMensaje;
    private Button btnAceptar, btnLimpiar,btnReporte;
    private TextField txtNombre,txtApellidos,txtRut,txtFechaNacimiento;
    private Choice chRegion;
    boolean presion=false;
    
    private Cliente cliente=new Cliente();

    

    /**
     *
     * @param titulo
     */
   
    
    
    
    public InterfaceClientes(String titulo){
          super(titulo);
          

          this.addWindowListener(this);
          
          
         
     }

    public void ConstuirFormulario(){
         
         this.setSize(1000, 600);// w,h
         this.setLayout(null);
         this.setVisible(true);
         
	 Color formColor = new Color(53, 59, 72);
	 setBackground(formColor);
         
         
         Font titleFont = new Font("arial", Font.BOLD, 25);
	 Font labelFont =new  Font("arial", Font.PLAIN, 18);
	 Font textFont =new  Font("arial", Font.PLAIN, 15);
         
         
         
         lblMensaje=new Label("");
         lblMensaje.setForeground(Color.RED);
         lblMensaje.setBounds(400,50,400,30);
         
         lblNombre=new Label("Nombre");  
	 lblNombre.setBounds(250,100,150,30);
	 lblNombre.setFont(labelFont);  
	 lblNombre.setForeground(Color.WHITE);
         
         
         txtNombre=new TextField();
	 txtNombre.setBounds(400,100,400,30);
	 txtNombre.setFont(textFont);
         

         lblApellidos=new Label("Apellidos");  
	 lblApellidos.setBounds(250,150,150,30);
	 lblApellidos.setFont(labelFont);  
	 lblApellidos.setForeground(Color.WHITE);
         
         txtApellidos=new TextField();
	 txtApellidos.setBounds(400,150,400,30);
	 txtApellidos.setFont(textFont);
         
         
         lblRut=new Label("Rut");  
	 lblRut.setBounds(250,200,150,30);
	 lblRut.setFont(labelFont);  
	 lblRut.setForeground(Color.WHITE);
         
         txtRut=new TextField();
	 txtRut.setBounds(400,200,400,30);
	 txtRut.setFont(textFont);
         
         
         lblFechaNacimiento=new Label("Fecha Nacimiento");  
	 lblFechaNacimiento.setBounds(250,250,150,30);
	 lblFechaNacimiento.setFont(labelFont);  
	 lblFechaNacimiento.setForeground(Color.WHITE);
         
         
         txtFechaNacimiento=new TextField();
	 txtFechaNacimiento.setBounds(400,250,400,30);
	 txtFechaNacimiento.setFont(textFont);
         txtFechaNacimiento.setText("DD/MM/YYYY");
         

         lblRegion=new Label("Region");  
	 lblRegion.setBounds(250,300,150,30);
	 lblRegion.setFont(labelFont);  
	 lblRegion.setForeground(Color.WHITE);
         
         chRegion=new Choice();
         chRegion.setBounds(400,300,400,50); 
         chRegion.addItem("");
         
         for(int i=0;i<cliente.getRegion().length;i++)
                chRegion.addItem(cliente.getRegion()[i]);
         
         btnAceptar=new Button("Crear");
         btnAceptar.setBounds(400,350,100,50);
	 btnAceptar.setFont(textFont);

         btnLimpiar=new Button("Limpiar");
         btnLimpiar.setBounds(500,350,100,50);
	 btnLimpiar.setFont(textFont);
         
         
         btnAceptar.addActionListener(this);
         btnLimpiar.addActionListener(this);
         txtFechaNacimiento.addKeyListener(this);
         
         
         add(lblMensaje);
	 add(lblNombre);
         add(txtNombre);
         add(lblApellidos);
         add(txtApellidos);
         add(lblRut);
         add(txtRut);
         add(lblFechaNacimiento);
         add(txtFechaNacimiento);
         add (lblRegion); 
         add (chRegion);
         add(btnAceptar);
         add(btnLimpiar);
  
    }
    
    
    public void Reporte(){
        
        this.removeAll();
         
	 Color formColor = new Color(53, 59, 72);
	 setBackground(formColor);
         
         
         Font titleFont = new Font("arial", Font.BOLD, 25);
	 Font labelFont =new  Font("arial", Font.PLAIN, 18);
	 Font textFont =new  Font("arial", Font.PLAIN, 15);
         
         this.setLayout(new GridLayout(2, 5));
         
         lblMensaje=new Label("Nombre");
         lblMensaje.setForeground(Color.WHITE);
         this.add(lblMensaje);
         
         lblMensaje=new Label("Apellidos");
         lblMensaje.setForeground(Color.WHITE);
         this.add(lblMensaje);
         
         lblMensaje=new Label("Rut");
         lblMensaje.setForeground(Color.WHITE);
         this.add(lblMensaje);
         
         lblMensaje=new Label("Fecha Nacimiento");
         lblMensaje.setForeground(Color.WHITE);
         this.add(lblMensaje);
         
         for(int i=0;i<cliente.Lclientes.size();i++){
           
           lblMensaje=new Label(cliente.Lclientes.get(i).getNombre());
           lblMensaje.setForeground(Color.WHITE);
           this.add(lblMensaje);
           
           
           lblMensaje=new Label(cliente.Lclientes.get(i).getApellidos());
           lblMensaje.setForeground(Color.WHITE);
           this.add(lblMensaje);
           
           
           lblMensaje=new Label(cliente.Lclientes.get(i).getRUT());
           lblMensaje.setForeground(Color.WHITE);
           this.add(lblMensaje);
           
           
           lblMensaje=new Label(cliente.Lclientes.get(i).getFechaNacimiento().toString());
           lblMensaje.setForeground(Color.WHITE);
           this.add(lblMensaje);

         }
         
        
    }
    

    //EVENTOS

  
    public void actionPerformed(ActionEvent e) {
         Date fechaNacimiento;
         String Region;
         
         //button 
         Object obj = e.getSource();
         
         
         if(obj==btnReporte){
             System.out.println("reporte");
             Reporte();
         }
         
         
         if(obj==btnAceptar){
              System.out.println("crear");
              
              
              if(!txtNombre.getText().toString().isEmpty() && !txtApellidos.getText().toString().isEmpty() && !txtRut.getText().toString().isEmpty() &&  !txtFechaNacimiento.getText().toString().isEmpty()){
                  try {
                      fechaNacimiento=new SimpleDateFormat("dd/mm/yyyy").parse(txtFechaNacimiento.getText().toString());
                      
                      cliente.setNombre(txtNombre.getText().toString());
                      cliente.setApellidos(txtApellidos.getText().toString());
                      cliente.setRUT(txtRut.getText().toString());
                      cliente.setFechaNacimiento(fechaNacimiento);
                      cliente.setEstado(true);
                      cliente.setRRegion(chRegion.getSelectedItem().toString());
                      
                      cliente.Lclientes.add(cliente);
                      
                      this.removeAll();
                      
                      lblMensaje=new Label("Datos insertados!!!");
                      lblMensaje.setForeground(Color.RED);
                      lblMensaje.setBounds(400,50,400,30);
                      Font textFont =new  Font("arial", Font.PLAIN, 15);
                      btnReporte=new Button("Reporte");
                      lblMensaje.setForeground(Color.WHITE);
                      btnReporte.setBounds(500,50,500,30);
                      btnReporte.setFont(textFont);
                      
                      
                      add(lblMensaje);
                      add(btnReporte);
                      btnReporte.addActionListener(this);

                      
                  } catch (ParseException ex) {
                      Logger.getLogger(InterfaceClientes.class.getName()).log(Level.SEVERE, null, ex);
                  }
                
                
              }else{
                 
                  Alerta("Los datos deben llenarse");
                  lblMensaje.setText("Los campos deben llenarse");
                  
                  
              }
             
         }
            
         if(obj==btnLimpiar){
             System.out.println("limpiar");
         }
        
         
         //Cliente cliente=new Cliente(txtNombre.getText().toString(),txtNombre.getText().toString());
         //cliente.InsertarDatos();
    }
    
    
     public void Alerta(String Mensaje){
             Dialog ventanaAlerta = new Dialog(this, Mensaje, true);  
                  ventanaAlerta.setLayout( new FlowLayout() );  
                  Button b = new Button ("OK"); 
                  
                  b.addActionListener ( new ActionListener(){  
                    public void actionPerformed( ActionEvent e )  
                    {  
                        ventanaAlerta.setVisible(false);  
                    }  
                });  
                ventanaAlerta.add( new Label ("Click para continuar."));  
                ventanaAlerta.add(b);
                ventanaAlerta.setSize(300,300);    
                ventanaAlerta.setVisible(true);  
                
     }
    
     public void windowClosing(WindowEvent e) {
                System.out.println("Cerrar la interface");
                dispose();
                
     }
     
    

   
      
      public void windowOpened(WindowEvent e) {}
      public void windowActivated(WindowEvent e) {}
      public void windowIconified(WindowEvent e) {}
      public void windowDeiconified(WindowEvent e) {}
      public void windowDeactivated(WindowEvent e) {}
      public void windowClosed(WindowEvent e) {}

   //eventos teclado
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e){
          Object obj = e.getSource();
          if(obj==txtFechaNacimiento && !presion){
                 txtFechaNacimiento.setText("");
                 presion=true;
              
          }
    }
    public void keyReleased(KeyEvent e){}
    
}
