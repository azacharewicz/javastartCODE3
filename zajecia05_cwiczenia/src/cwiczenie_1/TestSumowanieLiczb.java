package cwiczenie_1;

import java.util.Locale;
import java.util.Scanner;

public class TestSumowanieLiczb {
    public static void main(String[] args) {

        double[] tablicaLiczb = new double[3];

        Scanner skaner = new Scanner(System.in);
        skaner.useLocale(Locale.US); //ustawienie kropki zamiast przecinka w liczbach w konsoli zewnętrznej

        System.out.println("Podaj pierwszą liczbę");
        tablicaLiczb[0] = skaner.nextDouble();
        skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();

        System.out.println("Podaj drugą liczbę");
        tablicaLiczb[1] = skaner.nextDouble();
        skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();

        System.out.println("Podaj trzecią liczbę");
        tablicaLiczb[2] = skaner.nextDouble();
        skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();

        String sumowanie = tablicaLiczb[0] + " + " + tablicaLiczb[1] + " + " + tablicaLiczb[2] + " = ";
        double wynikSumowania = tablicaLiczb[0] + tablicaLiczb[1] + tablicaLiczb[2];

        System.out.println(sumowanie + wynikSumowania);

    }

}
