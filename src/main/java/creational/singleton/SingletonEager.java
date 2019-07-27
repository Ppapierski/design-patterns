package creational.singleton;

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        // very resource heavy operation

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public SingletonEager getInstance(){
        return instance;
    }
}
