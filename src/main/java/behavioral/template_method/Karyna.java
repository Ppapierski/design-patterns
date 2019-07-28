package behavioral.template_method;

public class Karyna extends Person {

    @Override
    protected void work() {
        System.out.println("Szlachta nie pracuje");
    }

    private void zrobDymNaOlx() {
        System.out.println("Dej ma choro cukre");
    }

    @Override
    public void liveADay() {

        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
        zrobDymNaOlx();
    }
}
