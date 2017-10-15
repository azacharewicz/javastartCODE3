package pl.filmweb.ui;

import pl.filmweb.model.Movie;
import pl.filmweb.model.TvSeries;
import pl.filmweb.model.Video;

import java.util.Scanner;


public class UIService {
    Scanner scanner = new Scanner(System.in);

    //definiujemy stałe (np. używane w switch'u)
    public static final int ADD_MOVIE = 0;
    public static final int ADD_TV_SERIES = 1;
    public static final int SHOW_MOVIES = 2;
    public static final int SHOW_TV_SERIES = 3;
    public static final int EXIT = 4;


    public void printOptions() {
        System.out.println("Co chcesz zrobić?");
        Option[] options = Option.values();
        for (Option option : options){
            System.out.println(option);
        }

    }

    public Movie createMovie() {
        System.out.println("Podaj tytuł filmu");
        //teraz musimy utworzyć nowy obiekt movie żeby nie było nullpointera przy próbie wczytania, że nie ma utworzonego obiektu movies[0]
        String title = scanner.nextLine();
        System.out.println("Podaj reżysera");
        String director = scanner.nextLine();
        System.out.println("Podaj opis");
        String desc = scanner.nextLine();
        System.out.println("Podaj rok produkcji");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj rok produkcji");
        int rating = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj gatunek");
        String genre = scanner.nextLine();
        return new Movie(title, director, desc, year, rating, genre);
    }


    public TvSeries createTvSeries() {
        System.out.println("Podaj tytuł filmu");
        //teraz musimy utworzyć nowy obiekt movie żeby nie było nullpointera przy próbie wczytania, że nie ma utworzonego obiektu movies[0]
        String titleTv = scanner.nextLine();
        System.out.println("Podaj opis");
        String descTv = scanner.nextLine();
        System.out.println("Podaj rok produkcji");
        int yearTv = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj rok produkcji");
        int ratingTv = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj gatunek");
        String genreTv = scanner.nextLine();
        System.out.println("Liczba sezonów");
        int seasons = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Liczba odcinków");
        int episodes = scanner.nextInt();
        scanner.nextLine();
        return new TvSeries(titleTv, descTv, yearTv, ratingTv, genreTv, seasons, episodes);
    }

    public void printMovies(Video[] videos) {
        for (Video video : videos) {
            if (video instanceof Movie)
                System.out.println(video);
        }
    }

    public void printTvSeries(Video[] videos) {
        for (Video video : videos) {
            if (video instanceof TvSeries)
                System.out.println(video);
        }
    }

    public int readInt(){
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public void printError(String error){
        System.err.println(error);
    }

}