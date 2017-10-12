package cwiczenie_2;

import java.util.Scanner;

public class Workers {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        Employee[] employee = new Employee[100];

        employee[0] = new Employee();
        employee[1] = new Employee();

        //wczytanie pracownika 1
        System.out.println("Podaj imię pracownika");
        employee[0].setImie(skaner.nextLine());
        System.out.println("Podaj nazwisko pracownika");
        employee[0].setNazwisko(skaner.nextLine());
        System.out.println("Podaj ile zarabia pracownik");
        employee[0].setWyplata(skaner.nextDouble());
        skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();

        //wczytanie pracownika 2
        System.out.println("Podaj imię pracownika");
        employee[1].setImie(skaner.nextLine());
        System.out.println("Podaj nazwisko pracownika");
        employee[1].setNazwisko(skaner.nextLine());
        System.out.println("Podaj ile zarabia pracownik");
        employee[1].setWyplata(skaner.nextDouble());
        skaner.nextLine(); //pozbywamy się "\n" System.out.println("Podaj napis:"); String napis = skaner.nextLine();

        //suma wypłat pracowników
        double sumaWyplat = employee[0].getWyplata() + employee[1].getWyplata();
        System.out.println("Szefie, niestety musisz zapłacić tym nierobom aż " + sumaWyplat + " złotych!");




    }
}
