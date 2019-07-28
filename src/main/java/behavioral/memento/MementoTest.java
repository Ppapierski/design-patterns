package behavioral.memento;

public class MementoTest {

    public static void main(String[] args) {
        Game game = new Game();
        game.makeProgess();
        System.out.println(game.getProgress());

        game.makeProgess();
        game.makeProgess();
        game.saveState("Jack");

        System.out.println(game.getProgress());

        game.makeProgess();
        game.makeProgess();

        System.out.println(game.getProgress());

        game.loadState("Jack");

        System.out.println(game.getProgress());

    }
}
