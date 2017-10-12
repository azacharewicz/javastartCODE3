package cwiczenie_2;

import java.util.Scanner;

public class SchematBlokowy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 0;
        double sum = 0;

        do {
            System.out.println("Wprowadź liczbę");
            x = scanner.nextInt();
            if (Math.pow(x, 2) < 100) {
                sum += x;
            }
        } while (Math.pow(x, 2) < 100);
        sum = sum % 2;
        System.out.println("Suma = " + sum);
    }
}

