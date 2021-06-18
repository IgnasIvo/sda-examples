package strategy;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class CommissionCalculatorContext {

    private final CommissionStrategy strategy;

    public CommissionCalculatorContext(CommissionStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal executeStrategy(BigDecimal amount) {
        return strategy.calculateCommission(amount);
    }

}
