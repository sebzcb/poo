/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sandracano
 */
public class Conexion {
    private String db;
    private String url;
    private String user;
    private String pass;
    private Connection link ;
    
    
    public Conexion(){
        this.db="poo";
        this.url = "jdbc:mysql://localhost/" + db;
        this.user="root";
        this.pass="";
        this.link=null;
        
    }
    
 
    public Connection Conectar() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            System.out.println("Conectado.....");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return link;
    }
    
    
    public void Cerrar(){
        
        try {
            link.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void InsertarDatos(String query){
        
        try {
            Statement s = link.createStatement();
            System.out.println(query);
            s.executeUpdate(query);

            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void LeerDatos(String Tabla){
        
    }
    
    
    
}
