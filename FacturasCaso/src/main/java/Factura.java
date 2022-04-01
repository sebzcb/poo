

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
    
    public Factura(){
        
    }

    public Factura(int NFactura, Cliente CCliente, double Total, Date fecha) {
        this.NFactura = NFactura;
        this.CCliente = CCliente;
        this.Total = Total;
        this.fecha = fecha;
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
    

   public void InsertarDatos(Cliente cliente) throws ParseException{
       
       int IDFactura;
       String Fecha;
       String RCliente;
       double total;
       
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
            
            System.out.println("Digite total ");
            total=Entrada.nextDouble();
            
            Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(Fecha);
            Factura facturas=new Factura(IDFactura,cliente,total,FFecha);
            LFactura.add(facturas);
            
            System.out.println("Factura creada");
       }
   }
   
   public void ImprimirDatos(){
       
       for(int i=0;i<LFactura.size();i++){
             System.out.println("Nombre:"+LFactura.get(i).CCliente.getNombre()+"\nCedula"+LFactura.get(i).CCliente.getRut()+"\n"+" Telefono"+LFactura.get(i).CCliente.getTelefono());
        }

   }
    
    
    
}
