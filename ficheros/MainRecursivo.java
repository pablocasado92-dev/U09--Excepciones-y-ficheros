package ficheros;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainRecursivo {
    static Scanner sc = new Scanner(System.in);

    static Integer leerEntero(){
        try{
            System.out.print("Ingrese un número entero: ");
            return sc.nextInt();
            
        }catch(InputMismatchException e){
            System.out.println("El número introducido tiene que ser de tipo entero");
            sc.nextLine();
            return leerEntero();  
        }
    }

    public static void main(String[] args) {
        Integer numero = leerEntero();
        System.out.println("Número ingresado: " + numero);
        sc.close();
    }
}