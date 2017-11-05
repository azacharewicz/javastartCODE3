package pl.javastart.springmvctest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request) {
        return "Cześć tu Marcin! Twoje IP to : " + request.getRemoteAddr();
    }




}
