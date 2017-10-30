package pl.javastart.springmvctest;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test") //wchodze na podstrone:/test czyli: http://localhost:8081/test
    @ResponseBody
    public String test(HttpServletRequest request) {
        return "Cześć tu Ania! Twoje IP to: <br>" + request.getRemoteAddr();
    }



}
