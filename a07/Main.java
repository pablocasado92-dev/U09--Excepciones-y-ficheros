package a07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/ficheros/quijote.txt";
        String linea1 = "En un lugar de la mancha,";
        char[] linea1array = linea1.toCharArray();
        String linea2 = "de cuyo nombre no quiero acordarme";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(ruta, true);      
            bw = new BufferedWriter(fw);          

            // Línea 1 con FileWriter
            for (char c : linea1array) {
                fw.write(c);
            }
            //fw.flush();   // fundamental para que se vea la línea 1

            // Línea 2 con BufferedWriter
            bw.newLine();
            bw.write(linea2);
            bw.newLine();

            System.out.println("Archivo creado correctamente");

        } catch (IOException e) {   // FileNotFoundException es subtipo de IOException
            System.out.println(e);
        } finally {
            // Cerrar solo el BufferedWriter (cierra también el FileWriter interno)
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}