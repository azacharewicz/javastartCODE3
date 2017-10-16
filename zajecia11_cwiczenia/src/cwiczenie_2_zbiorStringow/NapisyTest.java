package cwiczenie_2_zbiorStringow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class NapisyTest {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<String> set = new TreeSet<>();
        int licznik = 0;

        System.out.println("\nODCZYTANO Z PLIKU: ");
        File file = new File("cwiczenie_2.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            licznik = licznik + 1;
            String nextLine = scanner.nextLine();
            set.add(nextLine);
        }
        System.out.println("Ilość wszystkich napisów: " + licznik);
        System.out.println("Ilość unikalnych napisów: " + set.size());
        System.out.println("Najmniejsza wartość: " + set.first());
        System.out.println("Największa wartość: " +  set.last());
    }
}

