package pl.filmweb.db;

import pl.filmweb.exceptions.DuplicateException;
import pl.filmweb.model.Video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {

    private List<Video> videos = new ArrayList<>();


    //private Video[] videos;  ta linijka lub powyżej lista List<Video>
    private int size;

    public Video[] getVideos() {
        Video[] existingVideos = Arrays.copyOf(this.videos, size);
        return existingVideos;
    }

    public Database(Video[] videos) {
        this.videos = videos;
    }

    public Database(int size){
        videos = new Video[size];
    }

    public void add(Video video) throws DuplicateException {
        if(video == null)
            throw new IllegalArgumentException("Nie można dodawać nulli");
        for (int i = 0; i < videos.length; i++) {
            if(videos[i].equals(video))
                throw new DuplicateException();
        }
        videos[size] = video;
    }

}
