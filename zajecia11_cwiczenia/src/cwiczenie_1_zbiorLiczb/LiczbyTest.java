package cwiczenie_1_zbiorLiczb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class LiczbyTest {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Integer> set = new TreeSet<>();
        int licznik = 0;

        System.out.println("\nODCZYTANO Z PLIKU: ");
        File file = new File("cwiczenie_1.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextInt()) {
            licznik = licznik + 1;
            int nextInt = scanner.nextInt();
            set.add(nextInt);
        }
        System.out.println("Ilość wszystkich liczb: " + licznik);
        System.out.println("Ilość unikalnych liczb: " + set.size());
        System.out.println("Najmniejsza wartość: " + set.first());
        System.out.println("Największa wartość: " +  set.last());
    }
}

