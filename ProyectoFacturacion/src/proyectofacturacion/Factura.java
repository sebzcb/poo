/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofacturacion;

import java.util.Date;

/**
 *
 * @author Sala
 */
public class Factura {
    
    
    private int Codigo;
    private Date Fecha;
    private Persona CCliente;

    public Factura() {
    }
    
  
    public Factura(int Codigo, Date Fecha, Persona CCliente) {
        this.Codigo = Codigo;
        this.Fecha = Fecha;
        this.CCliente = CCliente;
    }

    public int getCodigo() {
        return Codigo;
    }

    public Date getFecha() {
        return Fecha;
    }

    public Persona getCCliente() {
        return CCliente;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setCCliente(Persona CCliente) {
        this.CCliente = CCliente;
    }
    
    
    
    
    public void CrearDatos(){
        
    }
    
    
    
    public void ImprimirDatos(){
        
    }
    
    
    
    
    
    
    
    
}
