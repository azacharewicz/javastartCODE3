package zadanie_1a;

import java.util.Scanner;

public class PersonTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();

        System.out.println("Podaj wiek:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj pesel:");
        String pesel = scanner.nextLine();

        Person person1 = new Person(firstName, lastName, age, pesel);

        System.out.println();
        System.out.println("INFORMACJE O OSOBIE:");
        System.out.println("imię: " + person1.getFirstName());
        System.out.println("nazwisko: " + person1.getLastName());
        System.out.println("wiek: " + person1.getAge());
        System.out.println("pesel: " + person1.getPesel());

    }
}

