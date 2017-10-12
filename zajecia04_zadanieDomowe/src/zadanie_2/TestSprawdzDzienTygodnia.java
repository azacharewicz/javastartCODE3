package zadanie_2;

import java.util.Scanner;

public class TestSprawdzDzienTygodnia {
    public static void main(String[] args) {

        DniTygodnia dniTygodnia = new DniTygodnia();
        Scanner skaner = new Scanner(System.in);

        int numerDniaTygodnia;

        do {
            dniTygodnia.komunikatPoczatkowy();
            numerDniaTygodnia = skaner.nextInt();
            skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();

        } while (((numerDniaTygodnia < 1) || (numerDniaTygodnia > 7)));

        dniTygodnia.komunikatPodsumowujacy(numerDniaTygodnia);
        skaner.close();


    }
}


