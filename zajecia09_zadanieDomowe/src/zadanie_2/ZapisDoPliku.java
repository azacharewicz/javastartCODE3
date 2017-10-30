package zadanie_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ZapisDoPliku {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        FileWriter fileWriter = null; //dopisywanie BufferedWriter
        try {
            fileWriter = new FileWriter("ZapisDoPliku.txt", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bfw = new BufferedWriter(fileWriter);

        boolean goodNumber = true;
        boolean goodSeparator = true;
        int licznik = 0;
        double[] tablica = new double[licznik];
        int i = 0;


        do {
            System.out.println("Ile liczb chcesz wprowadzić do tablicy?");
            goodNumber = false;
            try {
                licznik = scanner.nextInt();
                tablica = new double[ustawLicznik(licznik)];
                goodNumber = true;
            } catch (NieprawidlowyLicznik e) {
                System.out.print("Za mały licznik. Podaj liczbę dodatnią. ");
            } catch (InputMismatchException e) {
                System.out.print("Niepoprawny format licznika. ");
            } catch (Exception e) {
                System.out.print("Błąd: " + e + " ");
            }
            scanner.nextLine();
        } while (!goodNumber);


        for (i = 0; i < tablica.length; i++)

        {
            do {
                System.out.println("Wprowadź liczbę zmiennoprzecinkową");
                try {
                    tablica[i] = scanner.nextDouble();
                    fileWriter.write(Double.toString(tablica[i]) + "\n");
                    goodSeparator = true;
                } catch (InputMismatchException e) {
                    System.out.println("Niepoprawny zapis. Użyj \"kropki\" jako separatora dziesiętnego.");
                    goodSeparator = false;
                } catch (Exception e) {
                    System.out.print("Błąd: " + e + "\n");
                }
                scanner.nextLine();
            } while (!goodSeparator);
        }

        try {
            fileWriter.close(); //ważne
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Wprowadzono i zapisano do pliku wszystkie liczby");
    }

    private static int ustawLicznik(int licznik) throws NieprawidlowyLicznik {
        if (licznik < 1) {
            throw new NieprawidlowyLicznik();
        } else
            return licznik;
    }
}


