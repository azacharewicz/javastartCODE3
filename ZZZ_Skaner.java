import java.util.Locale;
import java.util.Scanner;

public class ZZZ_Skaner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        scanner.nextLine(); //zawsze pozbywamy się "\n" przed wpisaniem stringa w następnej linii
        System.out.println("Podaj napis: ");
        String napis = scanner.nextLine();
        scanner.close();      //zamykamy skaner
        }
}



