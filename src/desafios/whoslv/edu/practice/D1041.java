package whoslv.edu.practice;

import java.util.Scanner;

public class D1041 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);

        String[] entrada = K.nextLine().split(" ");
        double[] dados = {Double.parseDouble(entrada[0]), Double.parseDouble(entrada[1])};

        if (dados[0] == 0 && dados[1] == 0) {
            System.out.println("Origem");
        } else if (dados[0] == 0 && dados[1] != 0){
            System.out.println("Eixo Y");
        } else if (dados[0] != 0 && dados[1] == 0) {
            System.out.println("Eixo X");
        }else if (dados[0] > 0 && dados[1] > 0) {
            System.out.println("Q1");
        } else if (dados[0] < 0 && dados[1] > 0) {
            System.out.println("Q2");
        } else if (dados[0] < 0 && dados[1] < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }
}
