package pl.javastart.springmvctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
//vesrion 1
//    @RequestMapping("/add")
//    @ResponseBody
//    public void addUser(HttpServletRequest request) {
//        String name = request.getParameter("imie");
//        String surname = request.getParameter("nazwisko");
//        String age = request.getParameter("wiek");
//
//        User user = new User(name, surname, Integer.parseInt(age));
//
//        userRepository.add(user);
//    }


    //version2
    @RequestMapping("/add")
    @ResponseBody
    public void addUser(@RequestParam(value = "imie", required = false, defaultValue= "Anonim") String name,
                        @RequestParam(value = "nazwisko") String surname,
                        @RequestParam(value = "wiek") int age) {
        User user = new User(name, surname, age);
        userRepository.add(user);
    }
}

//http://localhost:8081/users/add?imie=Anna&nazwisko=Kowalska&wiek=80

//http://localhost:8081/users
//wynik
//        User{name='Daniel', surname='Abacki', age=15}
//        User{name='Marcin', surname='Jutrzejszy', age=25}
//        User{name='Kasia', surname='Wczorajszy', age=35}
//        User{name='Kamil', surname='Bednarek', age=45}
//        User{name='Anna', surname='Kowalska', age=80}