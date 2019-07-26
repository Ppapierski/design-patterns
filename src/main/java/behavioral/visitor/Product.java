package behavioral.visitor;

public interface Product {

    void accept(Cashier visitor);

}
