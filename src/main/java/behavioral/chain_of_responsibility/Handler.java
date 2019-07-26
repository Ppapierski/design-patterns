package behavioral.chain_of_responsibility;

public class Handler {

    private static int nextID = 1;
    private int id = nextID++;

    private Handler nextInChain;


    //todo implement
    void execute(Event event){

    }

    //todo implement
    void addHandler(Handler handler){

    }
}
