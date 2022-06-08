
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author sandracano
 */
abstract class Persona {
  
   private String RUT;
   public ArrayList <Cliente> Lclientes=new ArrayList<Cliente>();
   public ArrayList <Empresa> Lempresa=new ArrayList<Empresa>();

   
    public Persona(){
        
    }
    
    public Persona(String RUT) {
        this.RUT = RUT;
    }

    public String getRUT() {
        return RUT;
    }

    public ArrayList<Cliente> getLclientes() {
        return Lclientes;
    }

    public ArrayList<Empresa> getLempresa() {
        return Lempresa;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public void setLclientes(ArrayList<Cliente> Lclientes) {
        this.Lclientes = Lclientes;
    }

    public void setLempresa(ArrayList<Empresa> Lempresa) {
        this.Lempresa = Lempresa;
    }

   
   public abstract void ImprimirDatos();
   public abstract void InsertarDatos();
   
}
