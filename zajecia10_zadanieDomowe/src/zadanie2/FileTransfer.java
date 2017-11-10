package zadanie2;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileTransfer {
    List<String> listaMiast = new ArrayList<>();
    List<WeatherInfo> informacjePogodowe= new ArrayList<>();



    public void pobierzWyswietlZapiszInformacjePogodowe() throws IOException {
        FileWriter fileWriter = new FileWriter("pogoda.csv", false); //dopisywanie BufferedWriter
        BufferedWriter bfw = new BufferedWriter(fileWriter);

        System.out.println("\nINFORMACJE POGODOWE:");
        for (String city : listaMiast) {
            try {
                WeatherApi api = new WeatherApi();
                int temperature = api.getTemperature(city);
                String description = api.getDescription(city);
                System.out.printf("Pogoda w mieście %s: %s\n", city, description);
                System.out.printf("Aktualna temperatura: %d stopni\n", temperature);
                //zapis do pliku pogoda.csv
                fileWriter.write(city + ";" + temperature + ";" + description + "\n");
            } catch (IOException e) {
                System.err.println("Nie udało się pobrać informacji dla miasta " + city);
            }
        }

        fileWriter.close(); //ważne
        System.out.println("\nZAPISANO DO PLIKU " + "pogoda.csv");
    }

    public void odczytajMiastaZPliku() throws FileNotFoundException  { //
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
            System.out.println(listaMiast.get(listaMiast.size()-1));
        }
    }

    public void wczytajMiastaDoPliku() throws LicznikMniejszyOdPiec, InputMismatchException, IOException {
        Scanner scanner = new Scanner(System.in);
        //scanner.useLocale(Locale.US);
        FileWriter fileWriter = new FileWriter("cities.txt", true); //dopisywanie BufferedWriter
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        boolean goodNumber = true;
        boolean goodValue = true;
        int licznik = 0;
        String[] tablica = new String[licznik];
        int i = 0;
        do {
            System.out.println("Ile miast chcesz wprowadzić do pliku? Podaj liczbę większą niż 4.");
            try {
                licznik = scanner.nextInt();
                tablica = new String[ustawLicznik(licznik)];
                goodNumber = true;
            } catch (LicznikMniejszyOdPiec e) {
                System.out.print("Podaj liczbę większą niż 4. ");
                goodNumber = false;
            } catch (InputMismatchException e) {
                System.out.print("Podaj liczbę całkowitą większą niż 4. ");
                goodNumber = false;
            }
            scanner.nextLine();
        } while (goodNumber == false);
        for (i = 0; i < tablica.length; i++) {
            do {
                System.out.println("Wprowadź nazwę " + (i + 1) + ". miasta. Odpowiedni format tekstu to np.: \"wrocław\"");
                try {
                    tablica[i] = scanner.nextLine();
                    fileWriter.write((tablica[i]) + "\n");
                    goodValue = true;
                } catch (InputMismatchException e) {
                    System.out.println("Niepoprawny zapis. Odpowiedni format tekstu to np.: \"wrocław\"");
                    goodValue = false;
                }
            } while (goodValue == false);
        }
        fileWriter.close(); //ważne
        System.out.println("ZAPISANO DO PLIKU LISTĘ " + i + " MIAST.");
    }


    public static int ustawLicznik(double licznik) throws LicznikMniejszyOdPiec, InputMismatchException {
        if (licznik < 5) {
            throw new LicznikMniejszyOdPiec();
        } else if (((licznik * 10) % 10) != 0) {
            throw new InputMismatchException();
        } else return (int) licznik;
    }
}