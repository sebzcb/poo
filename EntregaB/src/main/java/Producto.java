/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Producto {
    
    private String Nombre;
    private int Cantidad;
    private String Descripcion;
    private String Talla;
    private String Color;

    public Producto(String Nombre, int Cantidad, String Descripcion, String Talla, String Color) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.Talla = Talla;
        this.Color = Color;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getTalla() {
        return Talla;
    }

    public String getColor() {
        return Color;
    }
    
    
    
    
    
    
    
    
}
