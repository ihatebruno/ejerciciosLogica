import java.util.Scanner;

public class RestaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = restaRecursiva(num1, num2);
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static int restaRecursiva(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return restaRecursiva(num1 ^ num2, (~num1 & num2) << 1);
        }
    }
}
