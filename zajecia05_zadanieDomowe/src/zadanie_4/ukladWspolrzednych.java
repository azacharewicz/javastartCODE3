package zadanie_4;

import java.util.Locale;
import java.util.Scanner;

public class ukladWspolrzednych {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //scanner.useLocale(Locale.US); //ustawienie kropki zamiast przecinka w liczbach w konsoli zewnętrznej

        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();

        String wynik;

        if (x > 0 && y > 0) {
            wynik = "w I ćwiartce układu współrzędnych";
        } else if (x > 0 && y < 0) {
            wynik = "w II ćwiartce układu współrzędnych";
        } else if (x < 0 && y < 0) {
            wynik = "w III ćwiartce układu współrzędnych";
        } else if (x < 0 && y > 0) {
            wynik = "w IV ćwiartce układu współrzędnych";
        } else if (x == 0 && y == 0) {
            wynik = "w samym środku układu współrzędnych";
        } else if (x == 0 && y > 0) {
            wynik = "na osi Y, pomiędzy IV a I ćwiartką układu współrzędnych";
        } else if (x == 0 && y < 0) {
            wynik = "na osi Y, pomiędzy III a II ćwiartką układu współrzędnych";
        } else if (x > 0 && y == 0) {
            wynik = "na osi X, pomiędzy I a II ćwiartką układu współrzędnych";
        } else {
            wynik = "na osi X, pomiędzy III a IV ćwiartką układu współrzędnych";
        }

        System.out.println("Punkt [" + x + ", " + y + "] leży " + wynik);
        scanner.close();

    }
}



