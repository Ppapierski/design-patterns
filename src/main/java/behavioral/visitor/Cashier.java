package behavioral.visitor;

import java.math.BigDecimal;

public class Cashier {

    private BigDecimal sum;

    public Cashier() {
        this.sum = BigDecimal.ZERO;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void addPrice(BigDecimal sum) {
        this.sum = this.sum.add(sum);
    }
}
