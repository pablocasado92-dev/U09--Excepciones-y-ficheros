package a01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainV2 {
    static Scanner sc = new Scanner(System.in);

    static Integer leerEntero() throws InputMismatchException{
        Integer n = null;
        n = sc.nextInt();
        return n;    
    }

    public static void main(String[] args) {
        Integer numero=null;
        do{
            try{
                System.out.print("Ingrese un número entero: ");
                numero = leerEntero();
            }catch(InputMismatchException e){
                System.out.println("El número introducido tiene que ser de tipo entero");
                sc.nextLine();  
            }
        } while(numero == null);
        System.out.println("Número ingresado: " + numero);
        sc.close();
    }
}