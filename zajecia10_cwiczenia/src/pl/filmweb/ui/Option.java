package pl.filmweb.ui;

public enum Option {
    ADD_MOVIE("Dodanie filmu"),
    ADD_TV_SERIES("Dodanie serialu"),
    SHOW_MOVIES("Wyświetlenie filmów"),
    SHOW_TV_SERIES("Wyświetenie seriali"),
    SAVE("Zapisz"),
    EXIT("Koniec programu");

    private final String description;

    Option(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return ordinal() + " - " + description;
    }

    public static Option getOption(int value){
        Option[] options = values();
        return options[value];
    }

}

