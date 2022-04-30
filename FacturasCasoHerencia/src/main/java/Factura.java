

/**
 *
 * @author sandracano
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;


//JFREECHART
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;
/** 
 *
 * @author sandracano
 * Esta clase permite insertardatos, imprimir datos, buscar datos y eliminar datos.
 */
public class Factura {
    
    //atributos
    private int NFactura;
    private double Total;
    private String fecha;
    private Estados Estado;
    public Operaciones operaciones=new Operaciones();
    private ArrayList<Factura> LFactura=new ArrayList<Factura>();
    private ArrayList <DetalleFactura>LDFactura=new ArrayList<DetalleFactura>();

    
    /**
     * constructor vacio
     * 
     * 
     */
    public Factura(){
        
    }
    
 
   

    public int getNFactura() {
        return NFactura;
    }

    public double getTotal() {
        return Total;
    }
    /**
     * 
     * 
     * @return Date resultado del atributo fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * 
     * 
     * @param NFactura 
     */
    public void setNFactura(int NFactura) {
        this.NFactura = NFactura;
    }



    public void setTotal(double Total) {
        this.Total = Total;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

   public void CrearFactura() {
       //this.Estado=Estados.ABIERTO;
         int NFactura;
         double Total;
         String fecha;
         Estados Estado;
         
         operaciones.Mensaje("Digite El número de Factura");
         NFactura=operaciones.ValidarEntero();
         DateFormat dtf = new SimpleDateFormat("dd-mm-yyyy");
         
         fecha=dtf.format(LocalDateTime.now());
         
         if(NFactura>0){
             
             InsertarProductos(NFactura);
             
         }

       
   }
   
   public void InsertarProductos(int IdFactura){
       int codigo;
       int cantidad;
       Producto producto=new Producto();
       operaciones.Mensaje("digite el codigo del producto");
       codigo=operaciones.ValidarEntero();
       if(codigo>0){
           if(producto.BuscarProducto(codigo)){
               operaciones.Mensaje("digite la cantidad a ingresar");
               cantidad=operaciones.ValidarEntero();
               LDFactura.add(new DetalleFactura(IdFactura, codigo,cantidad)); 
           }
       }
       
       
   }
   
   public void ImprimirFacturas(){
       
       

   }
   
   public void EliminarFactura (int codigoF){
       
   }
   
   public void VisualizarDatos(){
        
        var dataset = new HistogramDataset();
        
        //dataset.addSeries("FNacimiento", vals, 50);
        
        //JFreeChart histogram = ChartFactory.createHistogram("Normal distribution",
                //"y values", "x values", dataset);
    
   }
    

    
}
