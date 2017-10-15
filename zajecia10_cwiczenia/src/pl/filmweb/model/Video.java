package pl.filmweb.model;

public class Video {
    private String title;
    private String desc;
    private int year;
    private int rating;
    private String genre;

    public Video(String title, String desc, int year, int rating, String genre) {
        this.title = title;
        this.desc = desc;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;

        Video video = (Video) o;

        if (getYear() != video.getYear()) return false;
        if (getRating() != video.getRating()) return false;
        if (getTitle() != null ? !getTitle().equals(video.getTitle()) : video.getTitle() != null) return false;
        if (getDesc() != null ? !getDesc().equals(video.getDesc()) : video.getDesc() != null) return false;
        return getGenre() != null ? getGenre().equals(video.getGenre()) : video.getGenre() == null;
    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getDesc() != null ? getDesc().hashCode() : 0);
        result = 31 * result + getYear();
        result = 31 * result + getRating();
        result = 31 * result + (getGenre() != null ? getGenre().hashCode() : 0);
        return result;
    }
}
