package instrukcje_sterujace;

public class Ifologia_switch {
    public static void main(String[] args) {

        int number = 9;
        int wynikModulo = (number % 2);


        switch (wynikModulo) {
            case (0):
                System.out.println("Liczba %d jest parzysta, number");
                break;

            case (1):
                System.out.println("Liczba %d jest nieparzysta, number");
                break;

            case (-1):
                System.out.println("Liczba %d jest ujemna i nieparzysta, number");
        }

    }
}