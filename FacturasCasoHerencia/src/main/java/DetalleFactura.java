/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandracano
 */
public class DetalleFactura {
     private int codigoProducto;
     private int CantidadProducto;
     private int IdFactura;

    public DetalleFactura(int IdFactura,int codigoProducto, int CantidadProducto) {
        this.codigoProducto = codigoProducto;
        this.CantidadProducto = CantidadProducto;
        this.IdFactura = IdFactura;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public int getCantidadProducto() {
        return CantidadProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setCantidadProducto(int CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }
     
}
