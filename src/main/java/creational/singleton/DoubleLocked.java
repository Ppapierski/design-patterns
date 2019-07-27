package creational.singleton;

public class DoubleLocked {
    private static volatile DoubleLocked instance;


    private DoubleLocked() {
        // very resource heavy operation

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DoubleLocked getInstance() {
        if (instance == null) {
            synchronized (DoubleLocked.class) {
                if (instance == null) {
                    instance = new DoubleLocked();
                }
            }
        }
        return instance;
    }

}
