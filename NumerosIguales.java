import java.util.Scanner;

public class NumerosIguales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        
        if (sonIguales(num1, num2)) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }
        
        scanner.close();
    }
    
    public static boolean sonIguales(int num1, int num2) {
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}
