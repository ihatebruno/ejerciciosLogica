import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        
        int mayor = encontrarMayor(num1, num2);
        
        System.out.println("El número mayor es: " + mayor);
        
        scanner.close();
    }
    
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
