import au.com.bytecode.opencsv.CSVWriter; 
//add dependencia en directorio Dependencies
//clic derecho: -->add dependency  en query escribir opencsv

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author sandracano
 */
public class Reporte {
    
    private String Ruta;
    
    
    public Reporte(String Ruta){
        this.Ruta=Ruta;
        
    }
    
    
    public void EscribirCliente(String [] header, ArrayList <Cliente> Datos){
        File file = new File(this.Ruta);
        try {
        // create FileWriter object with file as parameter
        FileWriter outputfile = new FileWriter(file);
  
        // create CSVWriter object filewriter object as parameter
        
        CSVWriter writer = new CSVWriter(outputfile);
  
        // adding header to csv
        //String[] header = { "Name", "Class", "Marks" };
        writer.writeNext(header);
        
        
        // add data to csv
        
        
        for(int i=0;i<Datos.size();i++){
            String[] data = {Datos.get(i).getRut(),Datos.get(i).getNombre()};
            writer.writeNext(data);
        }
        
        
  
        // closing writer connection
        writer.close();
    }
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
        
    }
    
    
}
