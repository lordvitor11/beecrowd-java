package whoslv.edu.practice;

import java.util.HashMap;
import java.util.Scanner;

public class D1052 {
    public static void main(String[] args) {
        final Scanner K = new Scanner(System.in);

        int mes = K.nextInt();
        HashMap<Integer, String> meses = new HashMap<>() {{
            put(0, "January");
            put(1, "February");
            put(2, "March");
            put(3, "April");
            put(4, "May");
            put(5, "June");
            put(6, "July");
            put(7, "August");
            put(8, "September");
            put(9, "October");
            put(10, "November");
            put(11, "December");
        }};

        System.out.println(meses.get(mes - 1));
    }
}
