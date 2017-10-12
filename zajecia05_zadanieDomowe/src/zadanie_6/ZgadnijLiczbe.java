package zadanie_6;

import java.util.Scanner;

public class ZgadnijLiczbe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //scanner.useLocale(Locale.US); //ustawienie kropki zamiast przecinka w liczbach w konsoli zewnętrznej

        int x;

        do {
            System.out.println("Podaj liczbę");
            x = scanner.nextInt();
            scanner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();

            if (x > 200) {
                System.out.println("Podana liczba jest za duża");
            }
             else if (x < 100) {
                System.out.println("Podana liczba jest za mała");
            }
            else if ((x % 3) != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3");
            }
    } while ((x < 100) || (x > 200) || (x%3 != 0));

        System.out.println("Bingo! Wygrałeś medal z kartofla :-)");
        scanner.close();
    }
}
