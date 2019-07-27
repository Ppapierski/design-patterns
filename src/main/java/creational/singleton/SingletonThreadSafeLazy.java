package creational.singleton;

public class SingletonThreadSafeLazy {

    private static SingletonThreadSafeLazy instance;


    private SingletonThreadSafeLazy() {
        // very resource heavy operation

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized SingletonThreadSafeLazy getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafeLazy();
        }
        return instance;
    }

}
