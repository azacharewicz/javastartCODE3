package zadanie_7;

import java.util.Scanner;

public class OdwrocKolejnosc {
    public static void main(String[] args) {
        String[] imiona = new String[5];
        wczytajImiona(imiona);
        odwrocImiona(imiona);
    }

    static void wczytajImiona(String[] imiona){
        Scanner scanner = new Scanner(System.in);
        //scanner.useLocale(Locale.US); //ustawienie kropki zamiast przecinka w liczbach w konsoli zewnętrznej
        int i = 0;
        for (i = 0; i < imiona.length; i++) {
            System.out.println("Podaj imię");
            imiona[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println();
    }

    static void odwrocImiona(String[] imiona) {
        int i = 0;
        for (i = (imiona.length - 1); i > -1; i--) {
            System.out.println("Cześć " + imiona[i]);
        }
    }

}
