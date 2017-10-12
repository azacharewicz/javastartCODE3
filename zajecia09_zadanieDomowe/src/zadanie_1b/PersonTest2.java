package zadanie_1b;

import java.util.Scanner;

public class PersonTest2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        boolean isGood = true;

        System.out.println();
        do {
            System.out.println("Podaj imię:");
            person1.setFirstName(scanner.nextLine());
            try {
                System.out.println("podałeś imię: " + person1.name(person1.getFirstName()));
                isGood = true;
            } catch (NameUndefinedException ne) {
                System.err.println("Wpisałeś mniej niż 2 znaki");
                isGood = false;
            }
        } while (isGood == false);

        System.out.println();
        do {
            System.out.println("Podaj nazwisko:");
            person1.setLastName(scanner.nextLine());
            try {
                System.out.println("podałeś nazwisko: " + person1.name(person1.getLastName()));
                isGood = true;
            } catch (NameUndefinedException ne) {
                System.err.println("Wpisałeś mniej niż 2 znaki");
                isGood = false;
            }
        } while (isGood == false);

        System.out.println();
        do {
            System.out.println("Podaj wiek:");
            person1.setAge(scanner.nextInt());
            try {
                System.out.println("podałeś wiek: " + person1.age(person1.getAge()));
                isGood = true;
            } catch (IncorrectAgeException ae) {
                System.err.println("podałeś wiek mniejszy niż 1");
                isGood = false;
            }
        } while (isGood == false);

        scanner.nextLine();

        System.out.println();
        System.out.println("Podaj pesel:");
        person1.setPesel(scanner.nextLine());
        System.out.println("podałeś pesel: " + person1.getPesel());

        scanner.close();

        System.out.println();
        System.out.println("INFORMACJE O OSOBIE");
        System.out.println("imię: " + person1.getFirstName());
        System.out.println("nazwisko: " + person1.getLastName());
        System.out.println("wiek: " + person1.getAge());
        System.out.println("pesel: " + person1.getPesel());


    }
}