package zadanie2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherApp {
    public static void main(String[] args) throws IOException {
        FileTransfer fileTransfer = new FileTransfer();

        fileTransfer.odczytajMiastaZPliku();
        fileTransfer.pobierzWyswietlZapiszInformacjePogodowe();
    }
}
