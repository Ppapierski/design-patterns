package behavioral.template_method;

public class Person {

    protected void getUp(){
        System.out.println("Getting up from bed");
    }

    protected void eat(){
        System.out.println("Eating a sandwich...");
    }

    protected void work(){
        System.out.println("Working...");
    }

    protected void goToSleep(){
        System.out.println("ZZZZZzzzzzzZZZZZzZz");
    }

    public void liveADay(){
        getUp();
        eat();
        work();
        eat();
        goToSleep();
    }
}
