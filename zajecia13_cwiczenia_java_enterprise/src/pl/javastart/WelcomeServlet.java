package pl.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/welcome"})
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //odbieramy żądanie
        request.setCharacterEncoding("UTF-8");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        //wysyłąmy odpowiedz
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        //writer.println(firstName + " " + lastName + " " + age);

        if(firstName == null){
            writer.println("Witaj Tajemniczy Gościu! ");
        } else {
            writer.println("Cześć " + firstName + "! ");
        }
        if(lastName == null){
            writer.println("Nazwiskiem nie chcesz się pochwalić? Trudno... ");
        } else {
            writer.println(lastName + " to bardzo szacowne nazwisko. ");
        }
        if(age == null){
            writer.println("Co do wieku, którego nie chcesz zdradzić, to powiem Ci, że nie wiek, a mądrość i dobre serce liczy się w życiu ;-) ");
        } else {
            writer.println("Ehh... Też kiedyś miałam " + age + " lat. Wiele bym oddała, żeby mieć tyle znowu... ");
        }


//a w przeglądarce chrome wpisujemy w pasku adresu:
//http://localhost:8081/welcome?firstName=Anna&lastName=Kowalska&age=66

    }
}
