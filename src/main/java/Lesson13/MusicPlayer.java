package Lesson13;

import org.springframework.beans.factory.annotation.Value;


import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }

    private List<Music> musicGenre;

    public MusicPlayer(List<Music> musicGenre) {
        this.musicGenre = musicGenre;
    }
    public String playMusic() {
        Random random = new Random();
        Music currentGenre = musicGenre.get(random.nextInt(musicGenre.size()));
        return "Playing: " + currentGenre.getSong();
    }
}
