import java.util.Scanner;

public class ModuloRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingresa el divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            int resultado = moduloRecursivo(dividendo, divisor);
            System.out.println("El resultado del módulo es: " + resultado);
        }
    }

    public static int moduloRecursivo(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return dividendo;
        } else {
            return moduloRecursivo(dividendo - divisor, divisor);
        }
    }
}
