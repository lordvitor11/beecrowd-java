package whoslv.edu.beecrowd;

import java.util.Scanner;

public class D1022 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);

        String[] entrada = K.nextLine().split(" ");
        double[] dados = new double[entrada.length];

        for (int c = 0; c < entrada.length; c++) {
            dados[c] = Double.parseDouble(entrada[c]);
        }

        double a = dados[0];
        double b = dados[1];
        double c = dados[2];

        if (a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Impossivel calcular");
            } else {
                double raizDelta = Math.sqrt(delta);
                double x1 = (-b + raizDelta) / (2 * a);
                double x2 = (-b - raizDelta) / (2 * a);

                System.out.println(String.format("R1 = %.5f", x1));
                System.out.println(String.format("R2 = %.5f", x2));
            }
        }
    }
}
