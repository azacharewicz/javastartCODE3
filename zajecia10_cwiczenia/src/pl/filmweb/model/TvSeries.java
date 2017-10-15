package pl.filmweb.model;

public class TvSeries extends Video{
    private int seasons;
    private int episodes;

    public TvSeries(String title, String desc, int year, int rating, String genre, int seasons, int episodes) {
        super(title, desc, year, rating, genre);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    //String title, String desc, int year, int rating, String genre, int seasons, int episodes
    public void show() {
        System.out.printf("%s %s %d %d %s %d %d", getTitle(), getDesc(), getYear(), getRating(), getGenre(), getSeasons(), getEpisodes());
    }

    @Override
    public String toString() {
        return super.toString() + "seasons=" + seasons +
                ", episodes=" + episodes +
                '}';
    }
}
