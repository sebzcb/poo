
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
public class Cliente extends Persona{
    
    
    private int Tipo; //1 persona natural;  2: empresa
    private int NIT; //razon social
    private String NombreEmpresa;
    private ArrayList <Cliente> Lclientes;
    
    public Operaciones operaciones=new Operaciones();
    
    
    public Cliente(){
        this.Lclientes=new ArrayList<Cliente>();
    }
    
    public Cliente(String nombre, String Rut, Date FechaNacimiento,int Tipo,int NIT, String NombreEmpresa){
        super(nombre,Rut,FechaNacimiento);
        this.Tipo = Tipo;
        this.NIT = NIT;
        this.NombreEmpresa = NombreEmpresa;
        
    }

   

    public int getTipo() {
        return Tipo;
    }

    public int getNIT() {
        return NIT;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }
    
    public void CrearDatos(){
        String nombre;
        String rut;
        Date FechaNacimiento;
        int tipo;
        int nit=0;
        String NombreEmpresa="";
        
        
        
        operaciones.Mensaje("Digite el nombre");
        nombre=operaciones.ValidarCadena();

        if(nombre!=null){
            System.out.println("Digite el RUT");
            rut=operaciones.ValidarAlfanumerico();
            if(rut!=null){
                System.out.println("Digite la fecha de nacimiento (DD-MM-YYYY)");
                FechaNacimiento=operaciones.ValidarFecha();
                if(FechaNacimiento!=null){
                    System.out.println("Digite que tipo de cliente es 1: Persona Natural; 2: Empresa");
                    tipo=operaciones.ValidarEntero();
                    if(tipo>0){
                        if(tipo==1) //persona natural
                            Lclientes.add(new Cliente(nombre,rut,FechaNacimiento,tipo,nit,NombreEmpresa));
                        
                    }
                }
            }
        }
              
        
    }
    
    public void ActualizarDatos(String Rut){
        
    }
    
    
    public void EliminarDatos(String Rut){
        int id=BuscarCliente(Rut);
        if(id>=0){
            Lclientes.remove(id);
        }
        
    }
    
    public int BuscarCliente(String Rut){
         for(int i=0;i<Lclientes.size();i++){
             if(Lclientes.get(i).getRut()==Rut)
                  return i;
         }
         
         return -1;
    }
    
    
    public void ImprimirDatos(){
        Reporte reporte=new Reporte("Cliente.csv");
        for(int i=0;i<Lclientes.size();i++){
            operaciones.Mensaje("RUT: "+Lclientes.get(i).getRut());
            operaciones.Mensaje("Nombre: "+Lclientes.get(i).getNombre());
            operaciones.Mensaje("Fecha Nacimiento "+Lclientes.get(i).getFechaNacimiento());
            operaciones.Mensaje("Tipo"+Lclientes.get(i).Tipo);
 
        }
        String[] header = { "RUT","Nombre","Fecha Nacimiento","Tipo"};
        reporte.EscribirCliente(header, Lclientes);
        
        
    }
    
    
    
   
        
    
}
