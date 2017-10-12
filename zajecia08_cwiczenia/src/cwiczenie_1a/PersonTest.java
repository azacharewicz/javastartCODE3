package cwiczenie_1a;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person("Anna", "Stara", "45083106777", 88);
        Person p2 = new Person("Anna", "Stara", "45083106777", 88);
        Person p3 = new Person("Jagoda", "Młoda", "95083106777", 28);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
    }
}


//String firstName, String lastName, int pesel, int age