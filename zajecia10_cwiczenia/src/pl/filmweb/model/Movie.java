package pl.filmweb.model;

public class Movie extends Video {

    private String director;

    public Movie(String title, String director, String desc, int year, int rating, String genre) {
        super(title, desc, year, rating, genre);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void show() {
        System.out.printf("%s %s %s %d %d %s", getTitle(), this.director, getDesc(), getYear(), getRating(), getGenre());
    }

    @Override
    public String toString() {
        return super.toString() + "director='" + director + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        if (!super.equals(o)) return false;

        Movie movie = (Movie) o;

        return getDirector() != null ? getDirector().equals(movie.getDirector()) : movie.getDirector() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getDirector() != null ? getDirector().hashCode() : 0);
        return result;
    }
}
