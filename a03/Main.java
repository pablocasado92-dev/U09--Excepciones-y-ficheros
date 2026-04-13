package a03;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("src/ficheros/MainRecursivo.java"));
            String linea= in.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea=in.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se ha encontrado el fichero");
        } catch (IOException ioe) {
            System.out.println("Error de entrada/salida");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }
}