import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        
        double area = calcularAreaCirculo(radio);
        
        System.out.println("El área del círculo es: " + area);
        
        scanner.close();
    }
    
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
}
