import java.util.Scanner;

public class NumerosEnBucleDesc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        System.out.println("Números desde " + numero + " hasta 0:");
        imprimirNumerosDesc(numero);
        
        scanner.close();
    }
    
    public static void imprimirNumerosDesc(int numero) {
        if (numero >= 0) {
            System.out.print(numero + " ");
            imprimirNumerosDesc(numero - 1); // Llamada recursiva con el número anterior
        }
    }
}
