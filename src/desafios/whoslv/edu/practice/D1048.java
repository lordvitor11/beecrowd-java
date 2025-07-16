package desafios.whoslv.edu.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class D1048 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);
        final int MAX = 4;

        double salario = K.nextDouble();
        double novoSalario;
        double aumento;
        boolean isInFaixa = false;

        ArrayList<double[]> faixas = new ArrayList<>() {{
            add(0, new double[]{0, 400, 15});
            add(1, new double[]{400.01, 800, 12});
            add(2, new double[]{800.01, 1200, 10});
            add(3, new double[]{1200.01, 2000, 7});
        }};



        for (double[] faixa : faixas) {
            if (salario >= faixa[0] && salario <= faixa[1]) {
                aumento = salario * faixa[2] / 100;
                novoSalario = aumento + salario;

                System.out.printf("Novo salario: %.2f%n", novoSalario);
                System.out.printf("Reajuste ganho: %.2f%n", aumento);
                System.out.printf("Em percentual: %.0f %s%n", faixa[2], "%");
                isInFaixa = true;
                break;
            }
        }

        if (!isInFaixa) {
            aumento = salario * MAX / 100;
            novoSalario = aumento + salario;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.printf("Em percentual: %d %s%n", MAX, "%");
        }
    }
}
