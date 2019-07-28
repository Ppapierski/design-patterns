package behavioral.command;

public class CommandTest {

    public static void main(String[] args) {
        TheCook theCook = new TheCook();

        theCook.cook(new Margarita());
        theCook.cook(new Capriciosa());

        theCook.cook(new Pizza() {
            @Override
            public void cook() {
                System.out.println("Bake dough with tomato sauce" +
                        ", cheese, champignions, ham and broccoli.");
            }
        });
    }
}
