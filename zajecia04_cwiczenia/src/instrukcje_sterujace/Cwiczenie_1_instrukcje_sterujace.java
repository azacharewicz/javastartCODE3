package instrukcje_sterujace;

public class Cwiczenie_1_instrukcje_sterujace {
    public static void main(String[] args) {

        int x = 999;

        //warunek 1
        if (x % 2 == 0) {
            System.out.println("Liczba " + x + " jest parzysta");
        } else {
            System.out.println("Liczba " + x + " jest nieparzysta");
        }
        //warunek 2

        if (x > 0) {
            System.out.println("Liczba " + x + " a jest dodatnia");
        } else if (x == 0) {
            System.out.println("Liczba " + x + " a jest równa zero");
        } else {
            System.out.println("Liczba " + x + " a jest ujemna ");
        }

        //warunek 3   //  (x*9)%6 == 0  else (x*x) < 100
        if ((x * 9) % 6 == 0) {
            System.out.println("Liczba " + x + " pomnożona przez 9 jest podzielna przez 6");
        } else if (Math.pow(x, 2) < 100) {
            System.out.println("Kwadrat liczby " + x + " jest mniejszy od 100");
        } else {
            System.out.println("Liczba " + x + " pomnożona przez 9 jest NIE jest podzielna przez 6 " +
                    "ORAZ kwadrat liczby " + x + " nie jest mniejszy od 100");
        }
    }
}


