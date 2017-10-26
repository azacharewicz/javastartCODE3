package pl.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class CalcServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String number1String = request.getParameter("number1");
        String number2String = request.getParameter("number2");
        int number1 = Integer.valueOf(number1String);
        int number2 = Integer.valueOf(number2String);
        System.out.println("SUMA liczb " + number1 + " i " + number2 + " wynosi " + (number1 + number2));
        System.out.println("RÓŻNICA liczb " + number1 + " i " + number2 + " wynosi " + (number1 - number2));
        System.out.println("ILOCZYN liczb " + number1 + " i " + number2 + " wynosi " + (number1 * number2));
        System.out.println("ILORAZ liczb " + number1 + " i " + number2 + " wynosi " + (number1 / number2));
    }
}

//a w przeglądarce chrome wpisujemy w pasku adresu:
//http://localhost:8081/calculator?number1=10&number2=5

//    Integer x = Integer.valueOf(str);
//    // or
//    int y = Integer.parseInt(str);

