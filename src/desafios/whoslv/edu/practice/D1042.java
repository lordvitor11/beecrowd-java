package whoslv.edu.practice;

import java.util.Scanner;

public class D1042 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);

        String[] entrada = K.nextLine().split(" ");
        int[] dados = new int[entrada.length];
        int a = Integer.parseInt(entrada[0]);
        int b = Integer.parseInt(entrada[1]);
        int c = Integer.parseInt(entrada[2]);

        if (a > b && a > c) {
            dados[0] = a;
            dados[1] = b > c ? b : c;
            dados[2] = b < c ? b : c;
        } else if (a < b && b > c) {
            dados[0] = b;
            dados[1] = a > c ? a : c;
            dados[2] = a < c ? a : c;
        } else {
            dados[0] = c;
            dados[1] = b > a ? b : a;
            dados[2] = b < a ? b : a;
        }

        for (int i = dados.length - 1; i >= 0; i--) {
            System.out.println(dados[i]);
        }

        System.out.println("");

        for (int i = 0; i < entrada.length; i++) {
            System.out.println(entrada[i]);
        }
    }
}
