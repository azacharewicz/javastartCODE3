package zadanie_2;

public class TablicaInt {
    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4, 5};

        int i;
        int suma = 0;

        for (i = 0; i < tablica.length; i += 2) {
            suma = suma + tablica[i];
        }
        System.out.println("\nSuma elementów o id nieparzystych w tablicy = " + suma);

    }

}
