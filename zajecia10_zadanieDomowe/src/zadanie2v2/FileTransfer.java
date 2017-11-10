package zadanie2v2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileTransfer {
    List<String> listaMiast = new ArrayList<>();

    public void odczytajMiastaZPliku() throws FileNotFoundException {
        System.out.println("\nODCZYTANO Z PLIKU: ");
        File file = new File("cities.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            listaMiast.add(nextLine);
            System.out.println(listaMiast.get(listaMiast.size() - 1));
        }
    }

    public void pobierzWyswietlZapiszInformacjePogodowe() throws IOException {
        FileWriter fileWriter = new FileWriter("pogoda.csv", false); //dopisywanie BufferedWriter

        System.out.println("\nINFORMACJE POGODOWE:");
        WeatherInfoComponent component = new WeatherInfoComponent();
        List<WeatherInfo> weatherInfoList = component.createWeatherInfoList(listaMiast);

        for (WeatherInfo weatherInfo : weatherInfoList) {
            try {
                System.out.println(
                        "Pogoda w mieście " + weatherInfo.getCity() + ": " + weatherInfo.getDescription() + ". "
                                + "Aktualna temperatura " + weatherInfo.getTemperature() + " stopni");
                //zapis do pliku pogoda.csv
                fileWriter.write(weatherInfo.getCity() + ";" + weatherInfo.getTemperature() + ";" + weatherInfo.getDescription() + "\n");
            } catch(IOException e) {
                System.err.println("Nie udało się pobrać informacji dla miasta " + weatherInfo.getCity());

            }
        }
        fileWriter.close(); //wazne
        System.out.println("\nZAPISANO DO PLIKU " + "pogoda.csv");
    }

}