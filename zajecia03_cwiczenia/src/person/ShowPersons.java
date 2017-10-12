package person;

import person.Person;

public class ShowPersons {
    public static void main(String[] args) {

        Person person1 = new Person("Anna", "Zacharewicz", 18, "Wrocław");
        person1.showInfo();
        TimeMachine timemachine = new TimeMachine();
        timemachine.backInTime(person1);
        person1.showInfo();
        timemachine.timeTravel(person1, 8);
        person1.showInfo();

    }
}
