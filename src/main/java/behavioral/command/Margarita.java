package behavioral.command;

public class Margarita implements Pizza {

    @Override
    public void cook() {
        System.out.println("Bake dough with tomato sauce and cheese");
    }
}
