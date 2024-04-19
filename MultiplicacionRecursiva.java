import java.util.Scanner;

public class MultiplicacionRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = multiplicacionRecursiva(num1, num2);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static int multiplicacionRecursiva(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return num1 + multiplicacionRecursiva(num1, num2 - 1);
        } else {
            return -multiplicacionRecursiva(num1, -num2);
        }
    }
}
