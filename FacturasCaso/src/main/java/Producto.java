
import java.util.ArrayList;
import java.util.Scanner;

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
    private ArrayList<Producto> LProducto;
    
    
    public ArrayList<Producto> getLProducto() {
        return LProducto;
    }

    public void setLProducto(ArrayList<Producto> LProducto) {
        this.LProducto = LProducto;
    }
    
    
    public Producto(){
        LProducto=new ArrayList<Producto>();
    }

    public Producto(int Codigo, String Nombre, double Precio) {
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
        
         //variables locales
         int Codigo;
         String Nombre;
         double Precio;
         
         Scanner Entrada=new Scanner(System.in);
         System.out.println("Inserte los siguientes datos");
         System.out.println("Codigo:");
         Codigo=Entrada.nextInt();
         
         System.out.println("Nombre:");
         Nombre=Entrada.next();
         
         System.out.println("Precio:");
         Precio=Entrada.nextDouble();
         
         LProducto.add(new Producto(Codigo,Nombre,Precio));
         
    }
    
    public void ImprimirDatos(){
        
    }
    
    public void EliminarDatos(){
        
    }
    
    
    
}
