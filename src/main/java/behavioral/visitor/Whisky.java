package behavioral.visitor;

import java.math.BigDecimal;

public class Whisky implements Product{

    private BigDecimal price;
    private String name;

    public Whisky(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void accept(Cashier visitor) {
        visitor.addPrice(price);
    }
}
