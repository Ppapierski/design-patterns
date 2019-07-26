package behavioral.memento;

import java.util.Map;

public class Game {

    private int progress;

    Map<String, GameState> saves;


    public void loadState(String name) {
        saves.get(name);
    }

    //todo implement
    public void saveState(String name) {
    }

    public void makeProgess() {
        this.progress += 10;
    }
}
