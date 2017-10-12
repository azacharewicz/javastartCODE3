package zadanie_1a;

import java.util.Scanner;

public class PersonTest1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();

        System.out.println("Podaj imię:");
        person1.setFirstName(scanner.nextLine());
        if((person1.getFirstName() == null) || (person1.getFirstName().length() < 2)) {
            throw new NameUndefinedException();
        }
        else System.out.println("podałeś imię: " + person1.getFirstName());

        System.out.println("Podaj nazwisko");
        person1.setLastName(scanner.nextLine());
        if((person1.getLastName() == null) || (person1.getLastName().length() < 2)) {
            throw new NameUndefinedException();
        }
        else System.out.println("podałeś nazwisko: " + person1.getLastName());

        System.out.println("Podaj wiek:");
        person1.setAge(scanner.nextInt());
            if(person1.getAge() < 1) {
                throw new IncorrectAgeException();
            }
            else System.out.println("podałeś wiek: " + person1.getAge());
        scanner.nextLine();

        System.out.println("Podaj pesel:");
        person1.setPesel(scanner.nextLine());
        System.out.println("podałeś pesel: " + person1.getPesel());

        System.out.println();
        System.out.println("INFORMACJE O OSOBIE:");
        System.out.println("imię: " + person1.getFirstName());
        System.out.println("nazwisko: " + person1.getLastName());
        System.out.println("wiek: " + person1.getAge());
        System.out.println("pesel: " + person1.getPesel());


//        System.out.println("podałeś imię: " + person1.getFirstName());
//        System.out.println("podałeś nazwisko: " + person1.getLastName());
//        System.out.println("podałeś wiek: " + person1.getAge());
//        System.out.println("podałeś pesel: " + person1.getPesel());



    }
}


//    private String firstName;
//    private String lastName;
//    private int age;
//    private String pesel;