package cwiczenie_4;

import java.util.Scanner;

public class WczytajZsumuj {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] liczba = new int[5];
        int i = 0;
        int suma = 0;

        while (i < 5) {
            System.out.println("Podaj liczbę");
            liczba[i] = input.nextInt();
            suma = suma + liczba[i];
            i++;
        }

        System.out.println("Suma = " + suma);
        input.close();
    }
}

