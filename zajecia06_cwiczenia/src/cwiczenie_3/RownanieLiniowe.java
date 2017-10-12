package cwiczenie_3;

import java.util.Locale;
import java.util.Scanner;

public class RownanieLiniowe {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            //scanner.useLocale(Locale.US); //ustawienie kropki zamiast przecinka w liczbach w konsoli zewnętrznej

            //ax + b = c
            double a;
            double b;
            double c;

            do {
                System.out.println("Podaj liczbę \"a\" różną od 0");
                a = scanner.nextInt();
            } while (a == 0);

            do {
                System.out.println("Podaj liczbę \"b\" różną od 0");
                b = scanner.nextInt();
            } while (b == 0);

            do {
                System.out.println("Podaj liczbę \"c\" różną od 0");
                c = scanner.nextInt();
            } while (c == 0);

            scanner.close();
            double x = (c-b)/a;
            System.out.println("x = " + x);
        }
    }



