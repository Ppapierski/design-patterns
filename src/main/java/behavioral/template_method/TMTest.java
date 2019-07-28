package behavioral.template_method;

public class TMTest {

    public static void main(String[] args) {
        Person person = new Person();
        Karyna karyna = new Karyna();

        System.out.println("=== Person===\n");
        person.liveADay();
        System.out.println("\n===Karyna===\n");
        karyna.liveADay();
    }

}
