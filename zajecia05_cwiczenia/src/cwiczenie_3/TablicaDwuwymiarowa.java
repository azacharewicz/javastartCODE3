package cwiczenie_3;

public class TablicaDwuwymiarowa {
    public static void main(String[] args) {

//        int[][] tablica = new int[4][];
//        tablica[0] = new int[3];
//        tablica[1] = new int[2];
//        tablica[2] = new int[4];
//        tablica[3] = new int[1];

        int[][] tablica = {
                {1,2,3},
                null,
                {6,0,8,9},
                {10}
        };

        tablica[1] = new int[]{4,5}; //przypisanie całego wiersza w tabeli
        tablica[2][1] = 7; //przypisanie pojedynczej komórki w wierszu

        int sumaLiczbPierwszychWKazdymWierszu = tablica[0][0] + tablica[1][0] + tablica[2][0] + tablica[3][0];
        System.out.println();
        System.out.println("Suma liczb pierwszych w każdym wierszu = " + sumaLiczbPierwszychWKazdymWierszu);
    }


}
