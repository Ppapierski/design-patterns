package behavioral.command;

public class Capriciosa implements Pizza{

    @Override
    public void cook() {
        System.out.println("Bake dough with tomato sauce" +
                ", cheese, champignions and ham.");
    }
}
