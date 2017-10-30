package pl.javastart.springmvctest;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private List<User> users;

    public UserRepository(RandomNumberGenerator randomNumberGenerator) {
        users = new ArrayList<>();
        users.add(new User("Daniel", "Abacki", 15));
        users.add(new User("Marcin", "Jutrzejszy", 25));
        users.add(new User("Kasia", "Wczorajszy", 35));
        users.add(new User("Kamil", "Bednarek", 45));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void add(User user){
        users.add(user);
    }

}