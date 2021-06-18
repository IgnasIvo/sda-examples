package strategy;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class InternationalTransferCommissionStrategy implements CommissionStrategy {

    @Override
    public BigDecimal calculateCommission(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.1d));
    }
}
