

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class Factura {
    
    //atributos
    private int NFactura;
    private Cliente CCliente;
    private double Total;
    private Date fecha;
    private ArrayList<Factura> LFactura=new ArrayList<Factura>();
    private ArrayList<Producto>LProducto=new ArrayList<Producto>();
    
    public Factura(){
        
    }

    public Factura(int NFactura, Cliente CCliente, double Total, Date fecha, ArrayList<Producto> productos) {
        this.NFactura = NFactura;
        this.CCliente = CCliente;
        this.Total = Total;
        this.fecha = fecha;
        this.LProducto=productos;
        
    }

    public int getNFactura() {
        return NFactura;
    }

    public Cliente getCCliente() {
        return CCliente;
    }

    public double getTotal() {
        return Total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setNFactura(int NFactura) {
        this.NFactura = NFactura;
    }

    public void setCCliente(Cliente CCliente) {
        this.CCliente = CCliente;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
   public double CalcularTotal(ArrayList<Producto> productos){
       int total=0;
       for(int i=0;i<productos.size();i++){
           total+=productos.get(i).getPrecio();
       }
       
       return total;
   } 
    

   public void InsertarDatos(Cliente cliente) throws ParseException{
       
       int IDFactura;
       String Fecha;
       String RCliente;
       double total;
       int CompraProductos;
       
       //variable local producto
       int codigo;
       String nombre;
       double precio;
       
       Scanner Entrada=new Scanner(System.in);
       
       System.out.println("Digite el Rut Cliente");
       RCliente=Entrada.next();

       if(cliente.BuscarClientes(RCliente)){
          
            cliente =cliente.RCliente(RCliente.toString());
            
            System.out.println("Datos del cliente");
            System.out.println("Rut: "+cliente.getRut());
            System.out.println("Nombre:"+ cliente.getNombre());
            System.out.println("Tele:"+cliente.getTelefono());
            
            System.out.println("Digite el ID de la Factura");
            IDFactura=Entrada.nextInt();

            System.out.println("Digite la Fecha");
            Fecha=Entrada.next();
           
            
            Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(Fecha);
            
             //Digite los productos a comprar
            
            System.out.println("¿Cuantos productos va a comprar?");
            CompraProductos=Entrada.nextInt();
            
            Producto productos=new Producto();
            for(int i=1;i<=CompraProductos;i++){
               System.out.println("Digite los datos del producto "+i);
               productos.InsertarDatos();
            }   
            
            total=CalcularTotal(productos.getLProducto());
            
            Factura facturas=new Factura(IDFactura,cliente,total,FFecha,productos.getLProducto());
            
            LFactura.add(facturas);
            
            System.out.println("Factura creada");
       }else{
           System.out.println("El cliente no se encuentra registrado");
       }
   }
   
   
   
   public void ImprimirDatos(){
       
       for(int i=0;i<LFactura.size();i++){
             
             System.out.println("<<< ***************Factura No "+LFactura.get(i).getNFactura() + " ***********************>>>");
             System.out.println("<<<***************DATOS DEL CLIENTE**************************************>>>");
             System.out.println("Nombre del Cliente: "+ LFactura.get(i).CCliente.getNombre() +" RUT: "+LFactura.get(i).CCliente.getRut());
             System.out.println("<<< ************ Productos Asociados *********************** >>>");
             System.out.println("<<< Codigo----------------Nombre----------------Precio >>>>");
             for(int j=0;j<LFactura.get(i).LProducto.size();j++){
                 System.out.println("<<< "+LFactura.get(i).LProducto.get(j).getCodigo()+"----------------"+LFactura.get(i).LProducto.get(j).getNombre()+"----------------"+LFactura.get(i).LProducto.get(j).getPrecio()+" >>>>");
             }
             System.out.println ("<<< **************************Total a pagar "+LFactura.get(i).getTotal());
             System.out.println("<<<***************************************************************************************>>>>");
             System.out.println("");
       }

   }
   
   public void EliminarFactura(int codigo){
       
        if(BuscarFactura(codigo)){
            //eliminar la factura y sus anidados.
            for(int i=0;i<LFactura.size();i++){
                    if(LFactura.get(i).getNFactura()==codigo){
                        LFactura.get(i).LProducto.removeAll(LFactura);
                        LFactura.remove(i);
                        System.out.println("Factura Eliminado");
                    }
               
            }
            
        }
       
   }
   
   public boolean BuscarFactura(int codigo){
       
       for(int i=0;i<LFactura.size();i++){
           if(LFactura.get(i).getNFactura()==codigo)
               return true;
       }
       
       return false;
   }
   
   
    
    
    
}
