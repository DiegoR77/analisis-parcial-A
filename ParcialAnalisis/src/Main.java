import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("solo numero entre 0 y 1.000.000");
        do {
            n = sc.nextInt();
            comparacion(n);
            comparacionSecont(n);
        }while (n >= 0 && n <= 1000000);
        System.out.println("saliste");
    }

    public static void comparacion(int n){
        double ecuacion1 = (3 * Math.pow(n, 2)) + (50 * n);
        double ecuacion2 = 0.2 * Math.pow(n, 3);

        if (ecuacion1 < ecuacion2){
            System.out.println("Ecuacion 1 es mas rapida");
        }else {
            System.out.println("Ecuacion 2 es mas rapida");
        }
        // Floyd–Warshall (triple bucle) tiene un tiempo mejor cuando n vale 25
    }

    public static void comparacionSecont (int n){
        double ecuacion1 = 0.2 * Math.pow(n, 3);
        double ecuacion2 = Math.pow(n, 2);

        if (ecuacion1 < ecuacion2){
            System.out.println("Ecuacion 1 es mas rapida");
        }else {
            System.out.println("Ecuacion 2 es mas rapida");
        }
        // Floyd–Warshall (triple bucle) tiene un tiempo mejor cuando n vale 4
    }
}