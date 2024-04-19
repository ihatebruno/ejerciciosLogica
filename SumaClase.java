import java.util.Scanner;
public class SumaClase {


    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        MainSumaClase sumadillo = new MainSumaClase();
        
        System.out.println("Ingresa el primer numero:");
        sumadillo.dig1 = scann.nextInt();

        System.out.println("Ingresa el primer numero:");
        sumadillo.dig2 = scann.nextInt();


        sumadillo.suma();
        
        scann.close();
    }
}