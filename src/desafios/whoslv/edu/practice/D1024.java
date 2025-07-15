package whoslv.edu.practice;

import java.util.Arrays;
import java.util.Scanner;

public class D1024 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);
        final int P1 = 2;
        final int P2 = 3;
        final int P3 = 4;
        final int P4 = 1;

        double[] dados = Arrays.stream(K.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        double media = (dados[0] * P1 + dados[1] * P2 + dados[2] * P3 + dados[3] * P4) / (P1 + P2 + P3 + P4);

        System.out.printf("Media: %.1f%n", media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno em exame.");
            double novaNota = K.nextDouble();
            double novaMedia = (media + novaNota) / 2;

            System.out.println("Aluno aprovado.");
            if (novaMedia >= 5) {
                System.out.printf("Media final: %.1f%n", novaMedia);
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
