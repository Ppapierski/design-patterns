package behavioral.state;

public class Lock {

    private boolean isLocked;

    public void lock() {
        this.isLocked = true;
    }

    public void unlock() {
        this.isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
