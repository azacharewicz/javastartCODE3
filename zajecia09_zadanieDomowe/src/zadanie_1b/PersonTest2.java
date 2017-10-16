package zadanie_1b;

import java.util.Scanner;

public class PersonTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = null;
        boolean definitionOk = false;
        boolean ageGettingFinished = false;

        do {
            try {
                System.out.println("Podaj imię:");
                String firstName = scanner.nextLine();

                System.out.println("Podaj nazwisko:");
                String lastName = scanner.nextLine();

                System.out.println("Podaj wiek:");
                ageGettingFinished = false;
                int age = scanner.nextInt();
                ageGettingFinished = true;
                scanner.nextLine();

                System.out.println("Podaj pesel:");
                String pesel = scanner.nextLine();

                person1 = new Person(firstName, lastName, age, pesel);
                definitionOk = true;
            } catch (IncorrectAgeException e) {
                System.out.println("Podano zły wiek. Spróbuj jeszcze raz.");
            } catch (NameUndefinedException e) {
                System.out.println("Zły format imienia lub nazwiska. Spróbuj jeszcze raz.");
            } catch (Exception e) {
                System.out.println("Złe dane. Spróbuj jeszcze raz.");
            }

            if (!ageGettingFinished)
                scanner.nextLine();

        } while (!definitionOk);


        System.out.println();
        System.out.println("INFORMACJE O OSOBIE:");
        System.out.println("imię: " + person1.getFirstName());
        System.out.println("nazwisko: " + person1.getLastName());
        System.out.println("wiek: " + person1.getAge());
        System.out.println("pesel: " + person1.getPesel());

    }
}

