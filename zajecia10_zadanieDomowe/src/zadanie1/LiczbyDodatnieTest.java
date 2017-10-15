package zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class LiczbyDodatnieTest {

    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        List<Double> listaLiczbDodatnich = new ArrayList<>();
        double liczba = 1;
        boolean czyLiczbaDodatnia = true;

        while (liczba > 0) {
            do {
                try {
                    System.out.println("Podaj liczbę dodatnią (jako seperatora dla liczby zmiennoprzecinkowej użyj kropki \".\")");
                    liczba = scanner.nextDouble();
                    czyLiczbaDodatnia = true;
                } catch (InputMismatchException e) {
                    System.out.print("Niepoprawny format. ");
                    czyLiczbaDodatnia = false;
                }
                scanner.nextLine();
            } while (czyLiczbaDodatnia == false);
            if (liczba > 0) {
                listaLiczbDodatnich.add(liczba);
                // System.out.println("Podałeś: " + listaLiczbDodatnich.get(listaLiczbDodatnich.size()-1));
                // System.out.println("Lista elementów w tablicy: " + listaLiczbDodatnich.size());
            }
        }
        System.out.println("Nie podałeś liczby dodatniej. Zakończono proces wczytywania danych do listy.");

        //System.out.println("Lista elementów na liście: " + listaLiczbDodatnich.size());
        printReverse(listaLiczbDodatnich);
        printMaxMin(listaLiczbDodatnich);
        printSuma(listaLiczbDodatnich);
    }

    public static void printReverse(List<Double> lista) {
        System.out.println();
        if (lista.size() > 0) {
        System.out.print("REVERSE: ");
        for (int i = (lista.size() - 1); i >= 0; i--) {
            System.out.print(lista.get(i) + "  ");
        }
    } else {
        System.out.println("REVERSE: Nie mozna wyświetlić elementów, bo lista elementów jest pusta");
    }
        System.out.println();
    }

    public static void printSuma(List<Double> lista) {
        if (lista.size() > 0) {
        double suma = 0;
        System.out.print("SUMA: ");
        for (int i = 0; i < (lista.size()); i++) {
            suma = suma + lista.get(i);
            System.out.print(lista.get(i));
            if (i < (lista.size() - 1)) {
                System.out.print("+");
            } else {
                System.out.println("=" + suma);
            }
        }
        } else {
            System.out.println("SUMA nie istnieje, bo lista elementów jest pusta");
        }
        System.out.println();
    }

    public static void printMaxMin(List<Double> lista) {

        if (lista.size() > 0) {
            double min_value = Double.MAX_VALUE;
            System.out.println();
            for (double v : lista) {
                if (v < min_value)
                    min_value = v;
                System.out.println("MIN: " + min_value);
            }
        } else {
            System.out.println("MINIMUM nie istnieje, bo lista elementów jest pusta");
        }

        if (lista.size() > 0) {
            double max_value = Double.MIN_VALUE;
            for (double v : lista) {
                if (v > max_value)
                    max_value = v;
            }
            System.out.println("MAX: " + max_value);
        } else {
            System.out.println("MAXIMUM nie istnieje, bo lista elementów jest pusta");
        }
        System.out.println();
    }
}
