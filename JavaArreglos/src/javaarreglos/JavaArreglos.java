/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaarreglos;

import java.util.Scanner;

public class JavaArreglos {

    //creando funciones en java
    static void Arreglos(){
        Scanner entrada=new Scanner(System.in);
        
        int [] numeros=new int[10];
        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingrese el número de la posición "+(i)+":");
            numeros[i]=entrada.nextInt();

        }
        
        System.out.println("Los números ingresados son:");
        for(int i=0;i<numeros.length;i++){
             System.out.println("Salida del elemento "+ (i)+" "+numeros[i]);
        }
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Arreglos();
    
        //declarando el array
        String[] frutas; //vector
        char[] colores;
        int[] numeros;
        
       
         //asignanodo memoria al array
        frutas=new String[5];
        colores=new char[5];
        numeros=new int[5];
        
        frutas[0]="papaya";
        frutas[1]="mandarina";
        frutas[2]="piña";
        frutas[3]="fresa";
        frutas[4]="pera";
        
        for(int i=0;i<frutas.length;i++){
            System.out.println("las frutas son "+frutas[i]);
        }
        
        int i=0;
        while(i<frutas.length){
            System.out.println("las frutas son "+frutas[i]);
            i++;
        }
        
        
        //asignacion rapida
        String [] frutass={"papaya","mandarina","piña","fresa","pera"};
        for (int j=0;j<frutass.length;j++)
           System.out.println("las frutas son "+frutass[j]);
        
        
        
        //dos dimensiones
        int fila=2, columna=5;
        String[][]frutasss=new String[fila][columna];
        
        frutasss[0][0]="papaya 1";
        frutasss[0][1]="mandarina 1";
        frutasss[0][2]="piña 1";
        frutasss[0][3]="fresa 1";
        frutasss[0][4]="pera 1";
        
        frutasss[1][0]="papaya 2";
        frutasss[1][1]="mandarina 2";
        frutasss[1][2]="piña 2";
        frutasss[1][3]="fresa 2";
        frutasss[1][4]="pera 2";
        
        
        for(int k=0;k<frutasss.length;k++){
            for (int j=0;j<frutasss[k].length;j++){
                 System.out.println("las frutas son fila: "+k + " columna: "+ j +"="+frutasss[k][j]);
            }
        }
        
        //asignacion rápida
        String [][] Frutas={{"papaya","mandarina","piña","fresa","pera"},
                                        {"papaya","mandarina","piña","fresa","pera"}
                                       };
        
       
        for(int k=0;k<fila;k++){
                   for (int j=0;j<columna;j++){
                        System.out.println("las frutas son fila: "+k + " columna: "+ j +"="+Frutas[k][j]);
                   }
               }
     }
    
    
    
     
}
