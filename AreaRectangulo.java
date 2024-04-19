import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        
        double area = calcularAreaRectangulo(base, altura);
        
        System.out.println("El área del rectángulo es: " + area);
        
        scanner.close();
    }
    
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
