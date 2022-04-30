
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Producto {
    
    private int Codigo;
    private String Nombre;
    private double Precio;
    private ArrayList <Producto>LProductos=new ArrayList<Producto>();
    
    public Producto(){
        
    }

    public Producto(int Codigo, String Nombre, double Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    public boolean CrearProductos(){
        
        
        
        return false;
        
    }
    
    public void ListarProductos(){
        
    }
    
    public boolean BuscarProducto(int codigo){
        
        for(int i=0;i<LProductos.size();i++){
            if(LProductos.get(i).Codigo==codigo)
                return true;
        }
        return false;
    }

}
