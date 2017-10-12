package zadanie_3;

//nie wiem jak wydzielić do osobnych metod części wspólne dla obu pętli

public class ListowanieCiagowLiczb {

    public static void main(String[] args) {
        petlaWhile();
        petlaDoWhile();
    }


    static void petlaWhile() {
        double i = 0;
        int licznik = 0;
        while (i < 3.01) {
            if (licznik == 9) {
                licznik -= 10;
            }
            superWynik(i, licznik);
            i += 0.1;
            licznik += 1;
        }
        System.out.println();
    }

    private static void superWynik(double i, int licznik) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        if (licznik == 0) {
            df = new java.text.DecimalFormat("0");
        } else {
            df = new java.text.DecimalFormat("0.0");
        }
        String wynik = df.format(i);
        wynik = wynik.replace(',', '.');
        System.out.print(wynik);
        if (i < 3) {
            System.out.print(", ");
        }
    }


    static void petlaDoWhile() {
        double i = 0;
        int licznik = 0;
        do {
            if (licznik == 9) {
                licznik -= 10;
            }
            superWynik(i, licznik);
            i += 0.1;
            licznik += 1;
        } while (i < 3.01);
        System.out.println();
    }



}








