package pl.javastart.springmvctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("")
    @ResponseBody
    public String getAllUsers() {
        List<User> allUsers = userRepository.getAllUsers();
        String result = "";
        for (User allUser : allUsers) {
            result += allUser.toString() + "<br/>";
        }
        return result;
    }

    @RequestMapping("/add")
    @ResponseBody
    public void addUser(HttpServletRequest request) {
        String name = request.getParameter("imie");
        String surname = request.getParameter("nazwisko");
        String age = request.getParameter("wiek");

        User user = new User(name, surname, Integer.parseInt(age));

        userRepository.add(user);
    }

}






