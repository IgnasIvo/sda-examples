package strategy;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class RegularCommissionStrategy implements CommissionStrategy {

    @Override
    public BigDecimal calculateCommission(BigDecimal amount) {
        return amount.compareTo(BigDecimal.TEN) < 0 ? BigDecimal.ZERO : amount.multiply(BigDecimal.valueOf(0.01d));
    }

}
