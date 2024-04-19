import java.util.Scanner;

public class NumerosDescendentes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();
        
        System.out.println("Los números ordenados de mayor a menor son:");
        ordenarDescendente(num1, num2, num3);
        
        scanner.close();
    }
    
    public static void ordenarDescendente(int num1, int num2, int num3) {
        int mayor, medio, menor;
        
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }
        
        System.out.println(mayor + ", " + medio + ", " + menor);
    }
}
