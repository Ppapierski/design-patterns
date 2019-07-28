package behavioral.observer;

public class Fan implements Observer{

    String name;

    @Override
    public void onNotify() {
        System.out.println("I have been notified!");
    }
}
