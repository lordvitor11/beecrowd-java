package whoslv.edu.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class D1037 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);
        ArrayList<int[]> intervalos = new ArrayList<>() {{
            add(0, new int[]{0, 25});
            add(1, new int[]{25, 50});
            add(2, new int[]{50, 75});
            add(3, new int[]{75, 100});
        }};

        double entrada = K.nextDouble();
        boolean isInterval = false;

        for (int[] item : intervalos) {
            if (entrada >= item[0] && entrada <= item[1]) {
                if (item[0] == 0) {
                    System.out.printf("Intervalo [%d,%d]%n", item[0], item[1]);
                } else {
                    System.out.printf("Intervalo (%d,%d]%n", item[0], item[1]);
                }

                isInterval = true;
                break;
            }
        }

        if (!isInterval) {
            System.out.println("Fora de intervalo");
        }
    }
}
