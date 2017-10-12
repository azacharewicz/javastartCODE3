package zadanie_3;

//nie wiem jak wydzielić do osobnych metod części wspólne dla obu pętli

public class ListowanieCiagowLiczb {

    public static void main(String[] args) {
        petlaWhile();
        petlaDoWhile();
    }


    static void petlaWhile() {
        int i = 0;
        int licznik = 0;
        while (i <= 30) {
            if (licznik == 9) {
                licznik -= 10;
            }
            blokWspolny(i/10.0, licznik);
            if (i < 30) {
                System.out.print(", ");
            }
            i++;
            licznik += 1;
        }
        System.out.println();
    }

    static void petlaDoWhile() {
        double d = 0;
        int licznik = 0;
        do {
            if (licznik == 9) {
                licznik -= 10;
            }
            blokWspolny(d, licznik);
            if (d < 3) {
                System.out.print(", ");
            }
            d += 0.1;
            licznik += 1;
        } while (d < 3.01);
        System.out.println();
    }

    private static void blokWspolny(double d, int licznik) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        if (licznik == 0) {
            df = new java.text.DecimalFormat("0");
        } else {
            df = new java.text.DecimalFormat("0.0");
        }
        String wynik = df.format(d);
        wynik = wynik.replace(',', '.');
        System.out.print(wynik);
    }


}







