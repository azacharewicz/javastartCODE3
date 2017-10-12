package zadanie_1;

import java.util.Random;

public class TablicaLosowa {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        Random generator = new Random();

        for (int i = 0; i < 10 * 2; i++) {
            if (i < 10) {
                tablica[i] = generator.nextInt(100);
                System.out.print(tablica[i] + " ");
            } else {
                System.out.print(tablica[(9 - i) + 10] + " ");
            }
        }
    }
}
