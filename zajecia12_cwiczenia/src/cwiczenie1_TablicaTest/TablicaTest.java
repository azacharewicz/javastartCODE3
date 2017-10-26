package cwiczenie1_TablicaTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TablicaTest {
    public static void main(String[] args) {

        //System.out.println("\nODCZYTANO Z PLIKU: ");
        File file = new File("cwiczenie1.txt");
        Scanner scanner = null;
        int licznik = 0;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //posortuj tablicę
        int[] tab = new int[30];
        while (scanner.hasNextInt()) {
            Integer value = scanner.nextInt();
            tab[licznik] = value;
            licznik = licznik + 1;
            //System.out.println(value);
            //int num = 0;
        }
        Arrays.sort(tab);
        String tabString = Arrays.toString(tab);
        System.out.println(tabString);

        //min
        System.out.println("MIN: " + tab[0]);

        //max
        System.out.println("MAX: " +tab[29]);

        //index pierwszego wystąpienia liczby 15 w posortowanej tablicy
        int search = Arrays.binarySearch(tab,15);
        System.out.println(search + " to index pierwszego wystąpienia liczby 15 w posortowanej tablicy");
    }
}

