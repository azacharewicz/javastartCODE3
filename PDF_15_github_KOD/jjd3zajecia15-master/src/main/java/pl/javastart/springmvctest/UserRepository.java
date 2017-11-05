package pl.javastart.springmvctest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users;

    public UserRepository(RandomNumberGenerator randomNumberGenerator) {
        users = new ArrayList<>();
        users.add(new User("Daniel", "Abacki", randomNumberGenerator.nextAge()));
        users.add(new User("Marcin", "Jutrzejszy", 39));
        users.add(new User("Kasia", "Wczorajsza", 25));
        users.add(new User("Kamil", "Bydnarek", 30));
    }

    public List<User> getAllUsers() {
        return users;
    }


    public void add(User user) {
        users.add(user);
    }
}
