package behavioral.visitor;

import java.math.BigDecimal;

public class VisitorTest {
    public static void main(String[] args) {

        Whisky jack = new Whisky(BigDecimal.valueOf(80.99), "Jack Danniels");
        Cola coke = new Cola(BigDecimal.valueOf(3.14), "Coca cola");

        Cashier cashier = new Cashier();

        jack.accept(cashier);
        coke.accept(cashier);

        System.out.println(cashier.getSum());

    }

}
