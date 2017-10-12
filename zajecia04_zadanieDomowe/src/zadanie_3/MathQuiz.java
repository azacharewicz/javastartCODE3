package zadanie_3;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class MathQuiz {

    private double liczbaA;
    private double liczbaB;
    private double bokKwadratu;
    private double liczbaPierwiastkowana;

    public MathQuiz(double liczbaA, double liczbaB, double bokKwadratu, double liczbaPierwiastkowana) {
        this.liczbaA = liczbaA;
        this.liczbaB = liczbaB;
        this.bokKwadratu = bokKwadratu;
        this.liczbaPierwiastkowana = liczbaPierwiastkowana;
    }

    public double getLiczbaA() {
        return liczbaA;
    }

    public void setLiczbaA(double liczbaA) {
        this.liczbaA = liczbaA;
    }

    public double getLiczbaB() {
        return liczbaB;
    }

    public void setLiczbaB(double liczbaB) {
        this.liczbaB = liczbaB;
    }

    public double getBokKwadratu() {
        return bokKwadratu;
    }

    public void setBokKwadratu(double bokKwadratu) {
        this.bokKwadratu = bokKwadratu;
    }

    public double getLiczbaPierwiastkowana() {
        return liczbaPierwiastkowana;
    }

    public void setLiczbaPierwiastkowana(double liczbaPierwiastkowana) {
        this.liczbaPierwiastkowana = liczbaPierwiastkowana;
    }

    //metody
    Scanner skaner = new Scanner(System.in);

    public static String odpowiedzPoprawnaInfo(int liczbaPytan) {
        return "Zadanie " + (liczbaPytan) + ": odpowiedź poprawna";
    }


    public static String odpowiedzNiepoprawnaInfo(int liczbaPytan) {
        return "Zadanie " + (liczbaPytan) + ": odpowiedź niepoprawna";
    }


    public boolean question1() {
        System.out.println("Podaj wynik mnożenia " + liczbaA + "*" + liczbaB);
        double wynikUcznia = skaner.nextDouble();
        skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();
        double wynikSystemowy = liczbaA * liczbaB;
        if (wynikUcznia == wynikSystemowy) {
            return true;
        } else {
            return false;
        }
    }


    public boolean question2() {
        System.out.println("Oblicz pole kwadratu o boku " + bokKwadratu);
        double wynikUcznia = skaner.nextDouble();
        skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();
        double wynikSystemowy = pow(bokKwadratu, 2);
        if (wynikUcznia == wynikSystemowy) {
            return true;
        } else {
            return false;
        }
    }


    public boolean question3() {
        System.out.println("Podaj pierwiastek kwadratowy z liczby " + liczbaPierwiastkowana);
        double wynikUcznia = skaner.nextDouble();
        skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();
        double wynikSystemowy = sqrt(liczbaPierwiastkowana);
        if (wynikUcznia == wynikSystemowy) {
            return true;
        } else {
            return false;
        }
    }


    public String obsluzPytanie(boolean questionResult, Statistics statistics) {
        String response;
        statistics.liczbaPytan = statistics.liczbaPytan + 1;
        if (questionResult) {
            statistics.sumaPunktow = statistics.sumaPunktow + 1;
            response = odpowiedzPoprawnaInfo(statistics.liczbaPytan);
        } else {
            response = odpowiedzNiepoprawnaInfo(statistics.liczbaPytan);
        }
        System.out.println();
        //System.out.println("Liczba pytań = " + statistics.liczbaPytan);
        //System.out.println("Suma punktów = " + statistics.sumaPunktow);

        return response;
    }


    public void wynikKoncowy() {
        //int wynikA = punktZaOdpowiedz
    }

}
