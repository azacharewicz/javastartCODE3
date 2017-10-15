package zadanie2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherApp {
    public static void main(String[] args) throws IOException, LicznikMniejszyOdPiec {
        FileTransfer fileTransfer = new FileTransfer();
        List<String> listaMiast = new ArrayList<>();

        //fileTransfer.wczytajMiastaDoPliku();
        fileTransfer.odczytajMiastaZPliku();
        fileTransfer.pobierzWyswietlZapiszInformacjePogodowe();
    }
}
