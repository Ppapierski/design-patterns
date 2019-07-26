package behavioral.memento;

import java.time.LocalDateTime;

public class GameState {

    private LocalDateTime time;
    private String name;
    private int progress;


    public GameState(LocalDateTime time, String name, int progress) {
        this.time = time;
        this.name = name;
        this.progress = progress;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }

    @Override
    public String toString() {
        return "GameState{" +
                "time=" + time +
                ", name='" + name + '\'' +
                ", progress=" + progress +
                '}';
    }
}
