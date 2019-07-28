package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class FanPage implements Observable{

    private String name;

    private List<Observer> observerList;

    public FanPage(String name) {
        this.name = name;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::onNotify);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public String getName() {
        return name;
    }
}
