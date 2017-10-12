package zadanie_3;

public class School {
    public static void main(String[] args) {

        Human[] people = new Human[2];
        people[0] = new Teacher("NAUCZYCIEL", "Jan", "Sobieski", 44, "Fizyka jądrowa i molekularna");
        people[1] = new Student("UCZEŃ", "Anna", "Kowalska", 11223344, 5);

        for (Human h : people) {
            h.show();
        }
    }
}


