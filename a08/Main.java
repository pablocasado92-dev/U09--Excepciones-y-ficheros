package a08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        String archivo_leer=null;

        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Introduce el nombre del archivo txt a copiar(sin extension): ");
            archivo_leer = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/ficheros/" + archivo_leer + ".txt"));
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("src/ficheros/copia_de_" + archivo_leer + ".txt"))) {
            String linea;
            linea = br.readLine();
            while (linea != null) {
                texto += linea +"\n";
                linea = br.readLine();
            }
            bw.write(texto);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
