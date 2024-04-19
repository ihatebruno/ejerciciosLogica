import java.util.Scanner;

public class AreaCuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        
        double area = calcularAreaCuadrado(lado);
        
        System.out.println("El área del cuadrado es: " + area);
        
        scanner.close();
    }
    
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }
}
