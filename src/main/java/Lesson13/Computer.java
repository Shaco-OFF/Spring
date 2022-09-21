package Lesson13;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    //Прописываем зависимость от бина MusicPlayer, который в свою очередь также имеет зависимость от бина с типом Music

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic() + "\n"
                + "Name: " + musicPlayer.getName() + "\n"
                + "Volume: " + musicPlayer.getVolume();
    }
}
