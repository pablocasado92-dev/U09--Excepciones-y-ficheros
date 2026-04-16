package a07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/ficheros/quijote.txt";
        String linea1 = "En un lugar de la mancha,";
        String linea2 = "de cuyo nombre no quiero acordarme";

        // try-with-resources: los recursos se cierran automáticamente
        try (FileWriter fw = new FileWriter(ruta, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            // Línea 1 con FileWriter
            for (char c : linea1.toCharArray()) {
                fw.write(c);
            }

            // Línea 2 con BufferedWriter
            bw.newLine();
            bw.write(linea2);
            bw.newLine();

            System.out.println("Archivo creado correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}