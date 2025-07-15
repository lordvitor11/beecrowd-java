package whoslv.edu.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1023 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);

        String[] entrada = K.nextLine().split(" ");
        int codigo = Integer.parseInt(entrada[0]);
        double qtd = Double.parseDouble(entrada[1]);

        Map<Integer, Double> precos = new HashMap<>();

        precos.put(1, 4.0);
        precos.put(2, 4.5);
        precos.put(3, 5.0);
        precos.put(4, 2.0);
        precos.put(5, 1.5);

        double total = precos.get(codigo) * qtd;

        System.out.printf("Total: R$ %.2f%n", total);
    }
}
