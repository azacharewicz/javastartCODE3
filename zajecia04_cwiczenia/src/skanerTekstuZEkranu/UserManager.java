package skanerTekstuZEkranu;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {

        //User user = new User("65083106723", 52, "Janina", "Pobożna");

        User user1 = new User();

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swój pesel i naciśnij ENTER");
        String pesel = scan.nextLine();
        user1.setPesel(pesel);
        System.out.println("Twój pesel to: " + pesel);

        System.out.println("Podaj swój wiek (jako liczbę całkowitą) i naciśnij ENTER");
        int wiek = scan.nextInt();
        user1.setWiek(wiek);
        System.out.println("Twój wiek to: " + wiek);
        scan.nextLine(); //pozbywamy się "\n" (nie trzeba tego robic tylko po Stringach)

        System.out.println("Podaj swoje imię i naciśnij ENTER");
        String imie = scan.nextLine();
        user1.setImie(imie);
        System.out.println("Twoje imię to: " + imie);

        System.out.println("Podaj swoje nazwisko i naciśnij ENTER ");
        String nazwisko = scan.nextLine();
        user1.setNazwisko(nazwisko);
        System.out.println("Twoje nazwisko to: " + nazwisko);

        scan.close();

        user1.info();

    }
}