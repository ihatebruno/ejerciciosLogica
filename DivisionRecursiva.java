import java.util.Scanner;

public class DivisionRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Ingresa el denominador: ");
        int denominador = scanner.nextInt();

        if (denominador == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            int resultado = divisionRecursiva(numerador, denominador);
            System.out.println("El resultado de la división es: " + resultado);
        }
    }

    public static int divisionRecursiva(int numerador, int denominador) {
        if (numerador < denominador) {
            return 0;
        } else {
            return 1 + divisionRecursiva(numerador - denominador, denominador);
        }
    }
}
