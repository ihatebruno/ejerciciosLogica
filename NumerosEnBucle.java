import java.util.Scanner;

public class NumerosEnBucle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        System.out.println("Números del 0 al " + numero + ":");
        imprimirNumeros(numero);
        
        scanner.close();
    }
    
    public static void imprimirNumeros(int numero) {
        if (numero >= 0) {
            imprimirNumeros(numero - 1); // Llamada recursiva con el número anterior
            System.out.print(numero + " ");
        }
    }
}
