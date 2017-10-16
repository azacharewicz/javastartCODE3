package zadanie_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class WczytywanieDoPliku {
    public static void main(String[] args) throws LicznikMniejszyOdJeden, InputMismatchException, IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        FileWriter fileWriter = new FileWriter("ZapisDoPliku.txt", false); //dopisywanie BufferedWriter
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
            } catch (LicznikMniejszyOdJeden e) {
                System.out.print("Podaj liczbę całkowitą dodatnią.\n");
            } catch (InputMismatchException e) {
                System.out.print("Zły typ!\n");
            } catch (Exception e) {
                System.out.print("Błąd: " + e + "\n");
            } catch (Error e) {
                System.out.print("Błąd: " + e + "\n");
            }
            scanner.nextLine();
        } while (goodNumber == false);


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
                }
                scanner.nextLine();
            } while (goodSeparator == false);
        }
        fileWriter.close(); //ważne
        System.out.println("Wprowadzono i zapisano do pliku wszystkie liczby");
    }

    public static int ustawLicznik(int licznik) throws LicznikMniejszyOdJeden, InputMismatchException {
        if (licznik < 1) {
            throw new LicznikMniejszyOdJeden();
        } else
            return licznik;
    }

}


