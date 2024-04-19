import java.util.Scanner;

class Operaciones {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        int a;
        do {
            System.out.println("\nIngresa la opcion correcta");
            System.out.println("1: Suma"); 
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: División");
            System.out.println("0: Cerrar programa");
            a = option.nextInt();
            int b,c;
            switch (a) {
                case 1:
                    System.out.println("SUMA");
                    System.out.println("Ingresa un numero");
                    b = option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c = option.nextInt();
                    System.out.print("El resultado de la suma es: ");
                    System.out.println(b + c);
                    break;
                case 2:
                    System.out.println("RESTA");
                    System.out.println("Ingresa un numero");
                    b = option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c = option.nextInt();
                    System.out.print("El resultado de la resta es: ");
                    System.out.println(b - c);
                    break;
                case 3:
                    System.out.println("MULTIPLICACIÓN");
                    System.out.println("Ingresa un numero");
                    b = option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c = option.nextInt();
                    System.out.print("El resultado de la multiplicación es: ");
                    System.out.println(b * c);
                    break;
                case 4:
                    System.out.println("DIVISIÓN");
                    System.out.println("Ingresa un numero");
                    b = option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c = option.nextInt();
                    if (c != 0) {
                        System.out.print("El resultado de la división es: ");
                        System.out.println((double)b / c);
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break;
                default:
                    break;
            }
        } while (a > 0);
    }
}
