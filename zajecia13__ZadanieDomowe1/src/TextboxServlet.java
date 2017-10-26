import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import static jdk.nashorn.internal.objects.NativeArray.reverse;

@WebServlet("/textbox")
public class TextboxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usertext = request.getParameter("usertext");

        //wysyłamy odpowiedź
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        //tekst wpisany przez użytkownika
        //writer.print("Zapisano tekst: \"" + usertext + "\";  ");

        //ilość wszystkich znaków w tekście
        int iloscWszystkichZnakowWTekscie =  usertext.length();
        writer.print("Liczba znaków w tekście: " + iloscWszystkichZnakowWTekscie + "<br><br>");

        //dzielimy tekst na wyrazy
        String wyrazy[] = null;
        //Do tablicy wyrazy trafi zawartość zmiennej tekst podzielona na elementy
        wyrazy = usertext.split(" ");
        int iloscWyrazow = wyrazy.length;
        int iloscZnakowBezSpacji = iloscWszystkichZnakowWTekscie - iloscWyrazow + 1;

        //ilość znaków bez spacji
        writer.print(" Ilość znaków bez spacji: " + iloscZnakowBezSpacji + "<br><br>");

        //ilość wyrazów w tekście
        writer.print(" Ilość wyrazów w tekście: " + iloscWyrazow + "<br><br>");

        //czy tekst jet palindromem (czytany wspak jest identyczny z oryginalnym)
        StringBuilder builder = new StringBuilder(usertext);
        String reversed = builder.reverse().toString();
        writer.print(" Oryginalny tekst: " + usertext + "<br>");
        writer.print(" Odwrócony tekst: " + reversed + "<br>");
        if(usertext.equals(reversed)){
            writer.print(" Zapisany tekst JEST PALINDROMEM<br>");
        } else {
            writer.print(" Zapisany tekst NIE JEST PALINDROMEM<br>");
        }

    }
}
