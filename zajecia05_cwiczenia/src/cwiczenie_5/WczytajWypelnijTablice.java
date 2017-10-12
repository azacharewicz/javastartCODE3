package cwiczenie_5;

import java.util.Locale;
import java.util.Scanner;

public class WczytajWypelnijTablice {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        skaner.useLocale(Locale.US); //ustawienie kropki zamiast przecinka w liczbach w konsoli zewnętrznej

        System.out.println("Podaj rozmiar tablicy");
        int rozmiarTablicy = skaner.nextInt();

        double[] tablica = new double[rozmiarTablicy];

         for (int i = 0; i < tablica.length; i++){
             System.out.println("Wprowadź liczbę");
             tablica[i] = skaner.nextInt();
         }

         double suma = 0;

         for(double tab: tablica){
             suma = suma + Math.pow(tab,2);
         }
             System.out.println("Suma kwadratów liczb zapisanych w tablicy = " + suma);
        skaner.close();
    }
}
