package zadanie2v2;

import java.io.IOException;

public class WeatherApp {
    public static void main(String[] args) throws IOException {
        FileTransfer fileTransfer = new FileTransfer();

        fileTransfer.odczytajMiastaZPliku();
        fileTransfer.pobierzWyswietlZapiszInformacjePogodowe();
    }
}
