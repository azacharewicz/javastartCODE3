package cwiczenie_1;


//nie chce się zakończyć w końcu

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //String[] napis = {"", "", ""};
        String[] napis = new String[3];

        int i = 0;
        boolean indexJestNieprawidlowy = false;

        for (i = 0; i < 3; i++) {
            System.out.println("Podaj napis: ");
            napis[i] = scanner.nextLine();
        }

        do {
            try {
                System.out.println("Podaj index elementu w tablicy:");
                int index = scanner.nextInt();
                System.out.println("Index jest prawidłowy, a twój napis to: " + napis[index]);
                indexJestNieprawidlowy = false;
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException ex) {
                System.out.println("Index jest nieprawidłowy");
            }
        } while (!indexJestNieprawidlowy);

        System.out.println("Koniec testu :-)");
        scanner.close();
    }
}



