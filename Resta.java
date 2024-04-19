import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int num1 = op.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = op.nextInt();
        
        int res = num1 - num2;
        
        System.out.println("El resultado es: " + res);
        
    }
}
