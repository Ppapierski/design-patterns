package behavioral.memento;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Game {

    private int progress;
    Map<String, GameState> saves;

    public Game() {
        this.saves = new HashMap<>();
    }

    public void loadState(String name) {
        this.progress = saves.get(name).getProgress();
    }

    public void saveState(String name) {
        GameState gameState = new GameState(LocalDateTime.now(), name, this.progress);
        saves.put(name, gameState);
    }

    public void makeProgess() {
        this.progress += 10;
    }

    public int getProgress() {
        return progress;
    }
}
