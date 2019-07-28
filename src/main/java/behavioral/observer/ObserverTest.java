package behavioral.observer;

public class ObserverTest {

    public static void main(String[] args) {
        FanPage fanPage = new FanPage();

        fanPage.addObserver(new Fan());

        fanPage.notifyObservers();
    }

}
