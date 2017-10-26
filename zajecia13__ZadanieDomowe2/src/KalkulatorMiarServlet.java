import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

//Nie wiem w jaki sposób mogę się w tym servlecie zabezpieczyć przed wyjątkiem NumberFormatException
//Jak zrobić komunikat "Podałeś litery zamiast liczby" lub try catch'a w przypadku servletu...

@WebServlet("/kalkulatormiar")
public class KalkulatorMiarServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ileMetrow = request.getParameter("ileMetrow");
        String ileKilogramow = request.getParameter("ileKilogramow");
        double dlugosc = Double.parseDouble(ileMetrow.replace(",", "."));
        double waga = Double.parseDouble(ileKilogramow.replace(",", "."));

        //wysyłamy odpowiedź
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        //konwersja długości
        KonwerterMetrow konwerterMetrow = new KonwerterMetrow();
        writer.print("<b>" + dlugosc + " m </b> = "
                + konwerterMetrow.dlugoscWCentymetrach(dlugosc) + " cm = "
                + konwerterMetrow.dlugoscWMilimetrach(dlugosc) + " mm <br>");

        //konwersja wagi
        KonwerterKilogramow konwerterKilogramow = new KonwerterKilogramow();
        writer.print("<b>" + waga + " kg </b> = "
                + konwerterKilogramow.wagaWGramach(waga) + " g = "
                + konwerterKilogramow.wagaWMiligramach(waga) + " mg");
    }
}
