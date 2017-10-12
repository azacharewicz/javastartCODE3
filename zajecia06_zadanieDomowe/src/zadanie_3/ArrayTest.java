package zadanie_3;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[][] a1 = null;
        int[][] a2 = null;

        // ten sam rozmiar i ta sama zawartośc dwóch tablic
        a1 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        a2 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        ShowResult(a1, a2);

        // ten sam rozmiar i inna zawartośc dwóch tablic
        a1 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        a2 = new int[][]{{7, 2}, {3, 4}, {5, 6}};
        ShowResult(a1, a2);

        // inny rozmiar tablic
        a1 = new int[2][3];
        a2 = new int[4][5];
        ShowResult(a1, a2);

        // tablica jest null
        a1 = null;
        a2 = new int[4][5];
        ShowResult(a1, a2);

        // null w 2 tablicach
        a1 = new int[][]{{1, 2}, null, {5, 6}};
        a2 = new int[][]{{1, 2}, null, {5, 6}};
        ShowResult(a1, a2);

        // null w jednej z tablic
        a1 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        a2 = new int[][]{{1, 2}, null, {5, 6}};
        ShowResult(a1, a2);

    }

    private static void ShowResult(int[][] a1, int[][] a2) {
        ArrayComparator myComparator = new ArrayComparator();
        boolean result = myComparator.compare(a1, a2);
        System.out.println("a1: " + Arrays.deepToString(a1));
        System.out.println("a2: " + Arrays.deepToString(a2));
        System.out.println("wynik porównania tablic - Arrays.deepEquals()      : " + Arrays.deepEquals(a1, a2)); //do porównania
        System.out.println("wynik porównania tablic - ArrayComparator.compare(): " + result + "\n");
    }
}
