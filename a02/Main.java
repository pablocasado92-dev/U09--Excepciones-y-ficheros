package a02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileReader in = null;
        try{
        in = new FileReader("src/a02/ficheros/MainRecursivo.java");
        int caracter;
        while ((caracter = in.read()) != -1) {
             System.out.print((char) caracter);
        }  
        }catch (FileNotFoundException fnfe){
            System.out.println("No se ha encontrado el fichero");

        }catch (IOException ioe){
            System.out.println("Error de entrada/salida");
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                }catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
                }
            }
        }         
    }
}
