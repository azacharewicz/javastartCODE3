package pl.filmweb.app;

import com.sun.org.apache.xpath.internal.SourceTree;
import pl.filmweb.db.Database;
import pl.filmweb.exceptions.DuplicateException;
import pl.filmweb.model.Movie;
import pl.filmweb.model.TvSeries;
import pl.filmweb.model.Video;
import pl.filmweb.ui.Option;
import pl.filmweb.ui.UIService;
import java.util.Scanner;
import static pl.filmweb.ui.UIService.*;

public class FilmwebApp {

    //definiujemy stałe (np. używane w switch'u)
    public static final int ADD_MOVIE = 0;
    public static final int ADD_TV_SERIES = 1;
    public static final int SHOW_MOVIES = 2;
    public static final int SHOW_TV_SERIES = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        final String appName = "Filmweb v0.1";
        System.out.println(appName);
        Scanner scanner = new Scanner(System.in);
        UIService uiService = new UIService();
        Database database = new Database(20);

        // v.1
//        pl.filmweb.model.Movie movie = new pl.filmweb.model.Movie();
//        movie.title = "Avatar";
//        movie.director = "James Cameron";
//        movie.desc = "Film o niebieskich ludzikach";
//        movie.year = 2010;
//        movie.rating = 8;
//        movie.genre = "SciFi";

//        //v.2
//        Movie movie = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//        Movie movie2 = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//        Movie movie3 = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//        movie.show();
//        movie2.show();
//        movie3.show();
//        System.out.println(movie.getTitle());

//        //v.3
//        //tworzymy tablicę filmów
//        Movie[] movies = new Movie[10]; //mamy uzupełnioną wartościami domyślnymi, wartości = 0, obiekt = null, boolean = false
//        TvSeries[] tvSeries = new TvSeries[10]; //mamy uzupełnioną wartościami domyślnymi, wartości = 0, obiekt = null, boolean = false
//        int size = 0;
//
//        //movies[0] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//        // movies[1] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//        // movies[2] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//
//        // movies[0].show();
//        //movies[1].show();
//        // movies[2].show();
//
////        for (Movie movie : movies) {
////            if (movie != null)
////                movie.show();
////        }
//
//        //Scanner --> chcemy wprowadzić sknerem informacje o nowym filmie
//
//        int option;
//
//        do {
//
//            System.out.println("Co chcesz zrobić?");
//            System.out.println(ADD_MOVIE + " Dodanie filmu");
//            System.out.println(ADD_TV_SERIES + " Dodanie serialu");
//            System.out.println(SHOW_MOVIES + " Wyświetl filmy");
//            System.out.println(SHOW_TV_SERIES + " Wyświetl seriale");
//            System.out.println(EXIT + " EXIT");
//            option = scanner.nextInt(); //wyrzucamy przed pętlę
//            scanner.nextLine();
//
//
//            switch (option) {
//                case ADD_MOVIE:
//                    System.out.println("Podaj tytuł filmu");
//                    //teraz musimy utworzyć nowy obiekt movie żeby nie było nullpointera przy próbie wczytania, że nie ma utworzonego obiektu movies[0]
//                    String title = scanner.nextLine();
//                    System.out.println("Podaj reżysera");
//                    String director = scanner.nextLine();
//                    System.out.println("Podaj opis");
//                    String desc = scanner.nextLine();
//                    System.out.println("Podaj rok produkcji");
//                    int year = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Podaj rok produkcji");
//                    int rating = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Podaj gatunek");
//                    String genre = scanner.nextLine();
//                    movies[size] = new Movie(title, director, desc, year, rating, genre);
//                    size++;
//                    break;
//                case ADD_TV_SERIES:
//                    System.out.println("Podaj tytuł filmu");
//                    //teraz musimy utworzyć nowy obiekt movie żeby nie było nullpointera przy próbie wczytania, że nie ma utworzonego obiektu movies[0]
//                    String titleTv = scanner.nextLine();
//                    System.out.println("Podaj opis");
//                    String descTv = scanner.nextLine();
//                    System.out.println("Podaj rok produkcji");
//                    int yearTv = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Podaj rok produkcji");
//                    int ratingTv = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Podaj gatunek");
//                    String genreTv = scanner.nextLine();
//                    System.out.println("Liczba sezonów");
//                    int seasons = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Liczba odcinków");
//                    int episodes = scanner.nextInt();
//                    scanner.nextLine();
//                    tvSeries[size] = new TvSeries(titleTv, descTv, yearTv, ratingTv, genreTv, seasons, episodes);
//                    size++;
//                    break;
//                case SHOW_MOVIES:
//                    for (Movie movie : movies) {
//                        if (movie != null)
//                            movie.show();
//                    }
//                    break;
//                case SHOW_TV_SERIES:
//                    for (TvSeries tv : tvSeries) {
//                        if (tv != null)
//                            tv.show();
//                    }
//                    break;
//                case EXIT:
//                    System.out.println("Koniec programu");
//                    break;
//            }
//        }
//        while (option == EXIT);

        //po wszystkich typach innych niż string robimy zawsze, np. po int robimy
        //scanner.nextLine();

//            movies[0] = new Movie(title, director, desc, year, rating, genre);
//            movies[1] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//            movies[2] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");


//        //v.3
//        //tworzymy tablicę filmów
//        Movie[] movies = new Movie[10]; //mamy uzupełnioną wartościami domyślnymi, wartości = 0, obiekt = null, boolean = false
//        TvSeries[] tvSeries = new TvSeries[10]; //mamy uzupełnioną wartościami domyślnymi, wartości = 0, obiekt = null, boolean = false
//        int size = 0;

        //movies[0] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
        // movies[1] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
        // movies[2] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");

        // movies[0].show();
        //movies[1].show();
        // movies[2].show();

//        for (Movie movie : movies) {
//            if (movie != null)
//                movie.show();
//        }

        //Scanner --> chcemy wprowadzić sknerem informacje o nowym filmie



        //v.4
        //        //tworzymy tablicę obiektów video
//
//        Movie[] movies = new Movie[10]; //mamy uzupełnioną wartościami domyślnymi, wartości = 0, obiekt = null, boolean = false
//        TvSeries[] tvSeries = new TvSeries[10]; //mamy uzupełnioną wartościami domyślnymi, wartości = 0, obiekt = null, boolean = false

//przeniesiono do database
//        Video[] videos = new Video[10];
//        int size = 0;
//        int option;
//
//        //movies[0] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//        // movies[1] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");
//        // movies[2] = new Movie("Avatar", "James Cameron", "Film o niebieskich ludzikach", 2010, 8, "SciFi");

        Option option;
        do {
            uiService.printOptions();
            option = Option.getOption(uiService.readInt());

            switch (option) {
                case ADD_MOVIE:
                    Movie movie = uiService.createMovie();
                    try {
                        database.add(movie);
                    } catch (DuplicateException e){
                        uiService.printError("Film " + movie.toString() + " już istnieje");
                    }
                    break;
                case ADD_TV_SERIES:
                    TvSeries tvSeries = uiService.createTvSeries();
                    try {
                    database.add(tvSeries);
                    } catch (DuplicateException e){
                        uiService.printError("Serial " + tvSeries.toString() + " już istnieje");
                    }
                    break;
                case SHOW_MOVIES:
                    uiService.printMovies(database.getVideos());
                    break;
                case SHOW_TV_SERIES:
                    uiService.printTvSeries(database.getVideos());
                    break;
                case EXIT:
                    System.out.println("Koniec programu");
                    break;
            }
        }
        while (option == Option.EXIT);






    }
}

