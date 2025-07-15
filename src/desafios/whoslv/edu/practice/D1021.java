package whoslv.edu.practice;

import java.util.Scanner;

public class D1021 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);

        double input = K.nextDouble();
        int dinheiro = (int) Math.round(input * 100);
        int[] cedulas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};
        int[] resultadoCedulas = new int[cedulas.length];
        int[] resultadoMoedas = new int[moedas.length];

        for (int c = 0; c < cedulas.length; c++) {
            resultadoCedulas[c] = dinheiro / cedulas[c];
            dinheiro %= cedulas[c];
        }

        for (int c = 0; c < moedas.length; c++) {
            resultadoMoedas[c] = dinheiro / moedas[c];
            dinheiro %= moedas[c];
        }

        System.out.println("NOTAS:");
        int index = 0;
        for (int cedula : resultadoCedulas) {
            System.out.println(String.format("%d nota(s) de R$ %d.00", cedula, cedulas[index] / 100));
            index++;
        }

        System.out.println("MOEDAS:");
        index = 0;
        for (int moeda : resultadoMoedas) {
            System.out.println(String.format("%d moeda(s) de R$ %.2f", moeda, (double) moedas[index] / 100));
            index++;
        }
    }
}
