package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> kidsList = new ArrayList<>();
        for (Person person : ppl) {
            if (person.getAge() < 18) {
                kidsList.add(person.getName());
            }
        }
        return kidsList;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> usersList = new ArrayList<>();
        for (Person person : people) {
            usersList.add(new User(person.getName(), person.getAge(), (person.getName() + "_" + person.getAge())));
        }
        return usersList;
    }
}
