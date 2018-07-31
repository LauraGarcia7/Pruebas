/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author brown
 */

public class EstoEsUnDemo2 {

    public static void main(String[] args) {
        try {
            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\brown\\Downloads\\Archivos\\src\\ListaEstudiantes.txt", "rw");

            // set the file pointer at 0 position
            raf.seek(0);
            String cadena;
            System.out.println(raf.getFilePointer());
            do{
                cadena=raf.readLine();
                System.out.println("cadena:    "+ cadena);
                
            System.out.println(raf.getFilePointer());
                
                raf.seek(raf.getFilePointer()+30);
            }while(cadena!=null);
            ; //4 - bytes //Se posiciona en el byte especificado

//         raf.skipBytes(4); //Salta numero de Bytes
//         System.out.println("" + raf.readInt());
//          System.out.println(raf.getFilePointer()); //Byte actual
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
