package behavioral.state;

public class StateTest {

    public static void main(String[] args) {
        Lock lock = new Lock();
        Door door = new Door(lock);

        door.open();
        door.open();
        door.close();
        door.close();

        lock.lock();
        door.open();




    }
}
