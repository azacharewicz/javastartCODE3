package zadanie2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileTransfer {
    WeatherApi api = new WeatherApi();
    List<String> listaMiast = new ArrayList<>();
    List<WeatherInfo> informacjePogodowe = new ArrayList<>();
    WeatherInfo weatherInfo = new WeatherInfo();

    public void odczytajMiastaZPliku() throws FileNotFoundException { //
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
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        WeatherApi api = new WeatherApi();
        System.out.println("\nINFORMACJE POGODOWE:");
        for (String city : listaMiast) {
            try {
                int temperature = api.getTemperature(city);
                String description = api.getDescription(city);
                WeatherInfo weatherInfo = new WeatherInfo(city, description, temperature);
                informacjePogodowe.add(weatherInfo);
                System.out.println(
                        "Pogoda w mieście " + weatherInfo.getCity() + ": " + weatherInfo.getDescription() + ". "
                                + "Aktualna temperatura " + weatherInfo.getTemperature() + " stopni");
                //zapis do pliku pogoda.csv
                fileWriter.write(weatherInfo.getCity() + ";" + weatherInfo.getTemperature() + ";" + weatherInfo.getDescription() + "\n");
            } catch (IOException e) {
                System.err.println("Nie udało się pobrać informacji dla miasta " + city);
            }
        }
        fileWriter.close(); //ważne
        System.out.println("\nZAPISANO DO PLIKU " + "pogoda.csv");
    }

//
//    public void pobierzWyswietlZapiszInformacjePogodowe() throws IOException {
//        FileWriter fileWriter = new FileWriter("pogoda.csv", false); //dopisywanie BufferedWriter
//        BufferedWriter bfw = new BufferedWriter(fileWriter);
//        //WeatherApi api = new WeatherApi();
//        System.out.println("\nINFORMACJE POGODOWE:");
//        for (String city : listaMiast) {
//            try {
//                pobierzInformacjePogodowe(api, city);
//                wyswietlInformacjePogodowe(weatherInfo);
//                zapiszDoPlikuInformacjePogodowe(weatherInfo);
//                //zapiszDoPlikuInformacjePogodowe(informacjePogodowe); //ta medota zapisuje NULL w pliku csv
//            } catch (IOException e) {
//                System.err.println("Nie udało się pobrać informacji dla miasta " + weatherInfo.getCity());
//            }
//        }
//        fileWriter.close(); //ważne
//        System.out.println("\nZAPISANO DO PLIKU " + "pogoda.csv");
//    }
//
//
//    public void pobierzInformacjePogodowe(WeatherApi api, String city) throws IOException {
//        int temperature = api.getTemperature(city);
//        String description = api.getDescription(city);
//        weatherInfo = new WeatherInfo(city, description, temperature);
//        informacjePogodowe.add(weatherInfo);
//    }
//
//    public void wyswietlInformacjePogodowe(WeatherInfo weatherInfo) {
//        System.out.println(
//                "Pogoda w mieście " + weatherInfo.getCity() + ": " + weatherInfo.getDescription() + ". "
//                        + "Aktualna temperatura " + weatherInfo.getTemperature() + " stopni");
//    }
//
//    //ta metoda zapisuje NULL w pliku csv
//    public void zapiszDoPlikuInformacjePogodowe(WeatherInfo weatherInfo) throws IOException {
//        FileWriter fileWriter = new FileWriter("pogoda.csv", false); //dopisywanie BufferedWriter
//        fileWriter.write(weatherInfo.getCity() + ";" + weatherInfo.getTemperature() + ";" + weatherInfo.getDescription() + "\n");
//    }


    //ta metoda zapisuje NULL w pliku csv
//    public void zapiszDoPlikuInformacjePogodowe(List<WeatherInfo> informacjePogodowe) throws IOException {
//        FileWriter fileWriter = new FileWriter("pogoda.csv", false); //dopisywanie BufferedWriter
//        fileWriter.write(informacjePogodowe.toString() + "\n");
//    }


}