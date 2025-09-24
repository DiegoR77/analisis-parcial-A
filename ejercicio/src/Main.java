import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean[] criba(int max) {
        boolean[] esPrimo = new boolean[max + 1];
        Arrays.fill(esPrimo, true);
        esPrimo[0] = esPrimo[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= max; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
        return esPrimo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] rangos = new int[N][2];

        int maxB = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            rangos[i][0] = a;
            rangos[i][1] = b;
            if (b > maxB) maxB = b;
        }

        boolean[] esPrimo = criba(maxB);

        int[] prefix = new int[maxB + 1];
        for (int i = 1; i <= maxB; i++) {
            prefix[i] = prefix[i - 1] + (esPrimo[i] ? 1 : 0);
        }

        for (int i = 0; i < N; i++) {
            int a = rangos[i][0];
            int b = rangos[i][1];
            int resultado = prefix[b] - (a > 1 ? prefix[a - 1] : 0);
            System.out.println(resultado);
        }

    }
}