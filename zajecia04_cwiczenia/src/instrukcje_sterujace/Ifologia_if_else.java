package instrukcje_sterujace;

public class Ifologia_if_else {
    public static void main(String[] args) {

        int number = 9;

        if(number % 2 == 0){
            System.out.println("Liczba %d jest parzysta, number");
        }

        else if(number % 2 == 1){
            System.out.println("Liczba %d jest nieparzysta, number");
        }

        else if(number % 2 == -1){
            System.out.println("Liczba %d jest ujemna i nieparzysta, number");
        }

}}