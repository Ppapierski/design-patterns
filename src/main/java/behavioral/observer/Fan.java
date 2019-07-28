package behavioral.observer;

public class Fan implements Observer{

    String name;
    Observable observable;

    public Fan(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void onNotify() {
        System.out.println(
                "Observer: " +name + " has been notified by Observable: "+
                        observable.getName()
        );
    }
}
