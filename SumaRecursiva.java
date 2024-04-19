import java.util.Scanner;

public class SumaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = sumaRecursiva(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static int sumaRecursiva(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return sumaRecursiva(num1 ^ num2, (num1 & num2) << 1);
        }
    }
}
