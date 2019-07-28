package behavioral.visitor;

import java.math.BigDecimal;

public class Cola implements Product {
    private BigDecimal price;
    private String name;

    public Cola(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void accept(Cashier visitor) {
        visitor.addPrice(price);
    }
}
