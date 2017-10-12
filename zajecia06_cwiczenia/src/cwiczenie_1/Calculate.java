package cwiczenie_1;

public class Calculate {
    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}, {4, 5, 6, 7}};
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] % 2 == 1)
                    sum += tab[i][j];
            }
        }
        System.out.println(sum);
    }
}
