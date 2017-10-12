package zadanie_3;

public class ArrayComparator {

    public static boolean compare(int[][] arrayA, int[][] arrayB) {

        if((arrayA == null) && (arrayB == null)){
            return true;
        }

        if((arrayA == null) || (arrayB == null)){
            return false;
        }

        int a_row_length = arrayA.length;
        int b_row_length = arrayB.length;

        if (a_row_length != b_row_length) {
            return false;
        }

        for (int i = 0; i < a_row_length; i++) {
            if((arrayA[i] == null) && (arrayB[i] == null)){
                continue;
            }

            if((arrayA[i] == null) || (arrayB[i] == null)){
                return false;
            }

            int a_column_length = arrayA[i].length;
            int b_column_length = arrayB[i].length;

            if (a_column_length != b_column_length) {
                return false;
            }

            for (int j = 0; j < a_column_length; j++) {
                if (arrayA[i][j] != arrayB[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}