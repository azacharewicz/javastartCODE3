package pl.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String userpassword = request.getParameter("userpassword");

        //wysyłamy odpowiedź
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if ((username.equals("admin")) && (userpassword.equals("admin"))) {
            writer.print("Zalogowano pomyślnie");
        } else {
            writer.print("Zalogowanie nie powiodło się");
        }
    }
}
