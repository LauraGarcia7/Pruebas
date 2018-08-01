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
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Lala\\Documents\\NetBeansProjects\\Archivos\\src\\ListaEstudiantes.txt", "rw");

            // set the file pointer at 0 position
            raf.seek(0);
            String cadena;
            int codigo, edad;
            System.out.println("z " + raf.getFilePointer());
            do {
              /*  codigo = raf.readShort();
                raf.skipBytes(20);
                System.out.println("a " + raf.getFilePointer());
                edad = raf.readShort();
                raf.seek(3);
                System.out.println("b " + raf.getFilePointer());
                cadena = raf.readLine();
                raf.seek(0);
                System.out.println("c " + raf.getFilePointer());
                
                System.out.println("cedula:    " + codigo);
                System.out.println("nombre:    " + cadena);
                System.out.println("Edad:    " + edad);
                raf.seek(raf.getFilePointer() + 24);
                System.out.println("d " + raf.getFilePointer());
*/
                cadena=raf.readLine();
                System.out.println("  ._.  "+ cadena);
            } while (cadena != null);
            ; //4 - bytes //Se posiciona en el byte especificado

//         raf.skipBytes(4); //Salta numero de Bytes
//         System.out.println("" + raf.readInt());
//          System.out.println(raf.getFilePointer()); //Byte actual
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
