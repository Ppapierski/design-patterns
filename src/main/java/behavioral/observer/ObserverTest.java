package behavioral.observer;

public class ObserverTest {

    public static void main(String[] args) {
        FanPage fanPage = new FanPage("Janusz");

        fanPage.addObserver(new Fan("Grażyna", fanPage));

        fanPage.notifyObservers();
    }

}
