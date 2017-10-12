package zadanie_2;

import java.util.Scanner;

public class FamilyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Family[] family = new Family[3];

        int i = 0;
        for (i = 0; i < family.length; i++) {

            System.out.println(i + ". Podaj pesel matki: ");
            String input_pesel_mother = scanner.nextLine();

            System.out.println(i + ". Podaj pesel ojca: ");
            String input_pesel_father = scanner.nextLine();

            System.out.println(i + ". Podaj liczbę ich dzieci: ");
            int input_number_of_children = scanner.nextInt();
            scanner.nextLine(); //zawsze pozbywamy się "\n" przed wpisaniem stringa w następnej linii

            family[i] = new Family(input_pesel_mother, input_pesel_father, input_number_of_children);

            if (i > 0) {
                for (int j = 0; j < i; ++j) {
                    boolean familyIsEquals = (family[i].equals(family[j]));
                    if (familyIsEquals == true) {
                        System.out.println("Element już istnieje w tablicy. Wprowadź kolejną rodzinę.");
                        --i;
                        break;
                    }
                }
            }
        }
        System.out.println("Wprowadzono " + i + " elem. do tablicy.");
    }
}


//PESELE
//1 - 92040104437
//2 - 36111410133
//3 - 82081101414
//4 - 67052819875
//5 - 82020715791
//6 - 50031707294