package a04;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/ficheros/numeros1.txt";

        try {
            double[] resultados = leerYCalcular(ruta);
            System.out.println("Suma: " + resultados[0]);
            System.out.println("Media: " + resultados[1]);
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se ha encontrado el fichero: ");
        } catch (IOException ioe) {
            System.out.println("Error de entrada/salida al leer el archivo");
        }
    }

    private static double[] leerYCalcular(String ruta) throws FileNotFoundException, IOException {
        double[] resultados = new double[2];
        int contador = 0;

        try (BufferedReader in = new BufferedReader(new FileReader(ruta))) {
            String linea = in.readLine();

            while (linea != null) {
                // Dividir la línea en partes usando el espacio como separador
                String[] numerosEnLinea = linea.split(" ");
                // Recorrer cada String obtenido del split
                for (String numStr : numerosEnLinea) {
                    // Convertir de String a Double
                    Double numero = Double.valueOf(numStr);
                    resultados[0] += numero;
                    contador++;
                }
                // Leer la siguiente línea del archivo
                linea = in.readLine();
            }

            // Calcular la media aritmética (evitando división por cero)
            if (contador > 0) {
                resultados[1] = resultados[0] / contador;
            } else {
                resultados[1] = 0;
            }
        }
        // El try-with-resources cierra automáticamente el BufferedReader

        return resultados;
    }
}
