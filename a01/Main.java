package a01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Integer leerEntero(){
        Integer n = null;
        do{
            try{
                System.out.print("Ingrese un número entero: ");
                n = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("El número introducido tiene que ser de tipo entero");
                sc.nextLine();  
            }
        } while(n == null);
        return n;
    }

    public static void main(String[] args) {
        Integer numero = leerEntero();
        System.out.println("Número ingresado: " + numero);
        sc.close();
    }
}
