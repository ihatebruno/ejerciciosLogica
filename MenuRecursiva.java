import java.util.Scanner;

public class MenuRecursiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        
        int opcion = scanner.nextInt();
        
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = sumaRecursiva(num1, num2);
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = restaRecursiva(num1, num2);
                System.out.println("La resta es: " + resultado);
                break;
            case 3:
                resultado = multiplicacionRecursiva(num1, num2);
                System.out.println("La multiplicación es: " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    resultado = divisionRecursiva(num1, num2);
                    System.out.println("La división es: " + resultado);
                }
                break;
            case 5:
                if (num2 == 0) {
                    System.out.println("No se puede calcular el módulo por cero");
                } else {
                    resultado = moduloRecursivo(num1, num2);
                    System.out.println("El módulo es: " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        scanner.close();
    }
    
    public static double sumaRecursiva(double num1, double num2) {
        if (num2 == 0) {
            return num1;
        }
        return sumaRecursiva(num1 + 1, num2 - 1);
    }
    
    public static double restaRecursiva(double num1, double num2) {
        if (num2 == 0) {
            return num1;
        }
        return restaRecursiva(num1 - 1, num2 - 1);
    }
    
    public static double multiplicacionRecursiva(double num1, double num2) {
        if (num2 == 1) {
            return num1;
        }
        return num1 + multiplicacionRecursiva(num1, num2 - 1);
    }
    
    public static double divisionRecursiva(double num1, double num2) {
        if (num1 < num2) {
            return 0;
        }
        return 1 + divisionRecursiva(num1 - num2, num2);
    }
    
    public static double moduloRecursivo(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        }
        return moduloRecursivo(num1 - num2, num2);
    }
}
