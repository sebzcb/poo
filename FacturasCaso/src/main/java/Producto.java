/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Producto {
    
    private Integer Codigo;
    private String Nombre;
    private double Precio;

    public Producto(Integer Codigo, String Nombre, double Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    
    public void InsertarDatos(){
        
        
    }
    
    public void ImprimirDatos(){
        
    }
    
    
    
}
