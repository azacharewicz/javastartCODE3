package cwiczenie_5_HashMap;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer, Customer> klienci = new HashMap<>();
        klienci.put(1, new Customer(101, "Anna", "Kowalska", 888777666));
        klienci.put(2, new Customer(102, "Jagoda", "Nowak", 999888777));
        klienci.put(3, new Customer(103, "Malwina", "Wójcik", 777666555));

        Set<Integer> klucze = klienci.keySet();
        System.out.println(klucze);
        Collection<Customer> daneKlientow = klienci.values(); //zamiast Collection możmy pobrać daneKlientów "iteratorem"
        System.out.println(daneKlientow.toString());

        pobierzIDKlientaWyswietlDane(klienci); //ta metoda to ćwiczenie "z gwiazdką" *
    }

    static void pobierzIDKlientaWyswietlDane(HashMap<Integer, Customer> klienci) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id klienta");
        int idKlienta = scanner.nextInt();
        scanner.nextLine();
        Customer daneKlienta = klienci.get(idKlienta);
        if (daneKlienta != null) {
            System.out.println(idKlienta + ", " + daneKlienta.toString());
        } else {
            System.out.println("Klient o wskazanym id nie istnieje");
        }
    }
}
