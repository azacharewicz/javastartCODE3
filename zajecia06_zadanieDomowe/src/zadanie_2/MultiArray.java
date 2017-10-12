package zadanie_2;

import java.util.Arrays;
import java.util.Random;

public class MultiArray {

    private int[][] tablica = null; //czy zmienna automatycznie będzie null jeżeli damy: int[][] tablica; ???

    public MultiArray(int n, int m) {
        this.tablica = new int[n][m];
        randomize();
    }

    void randomize() {
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = random.nextInt(200) - 100;
            }
        }
    }

    public void print() {
        String text = Arrays.deepToString(tablica);
        text = text.replace("], ", "]\n");
        text = text.replace("[[", "[");
        text = text.replace("]]", "]");
        System.out.println(text);
    }

    public int findMin() {
        int minValue = tablica[0][0];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] < minValue) {
                    minValue = tablica[i][j];
                }
            }
        }
        return minValue;
    }

    public int findMax() {
        int maxValue = tablica[0][0];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] > maxValue) {
                    maxValue = tablica[i][j];
                }
            }
        }
        return maxValue;
    }

}

