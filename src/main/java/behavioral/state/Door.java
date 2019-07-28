package behavioral.state;

public class Door {

    private Lock lock;
    private boolean isOpen;

    public Door(Lock lock) {
        this.lock = lock;
    }

    public void open() {
        if (isOpen) {
            System.out.println("The door is already open");
        } else {
            if (lock.isLocked()) {
                System.out.println("Can't open, the lock is locked!");
            } else {
                isOpen = true;
                System.out.println("Please come in!");
            }
        }
    }

    public void close() {
        if (isOpen) {
            if (lock.isLocked()) {
                System.out.println("Can't close, the lock is locked!");
            } else {
                isOpen = false;
                System.out.println("Closed!");
            }
        } else {
            System.out.println("The door is already closed");
        }
    }
}
