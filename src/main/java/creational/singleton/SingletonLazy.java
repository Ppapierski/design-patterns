package creational.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;


    private SingletonLazy() {
        // very resource heavy operation

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
