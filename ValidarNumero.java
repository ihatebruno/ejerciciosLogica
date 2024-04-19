import java.util.Scanner;

public class ValidarNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        if (esPar(numero)) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
        
        scanner.close();
    }
    
    public static boolean esPar(int numero) {
        if (numero == 0) {
            return true;
        } else if (numero == 1) {
            return false;
        } else {
            return esPar(numero - 2);
        }
    }
}
