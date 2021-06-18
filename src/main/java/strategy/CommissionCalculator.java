package strategy;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class CommissionCalculator {

    public BigDecimal calculateCommission(BigDecimal amount, boolean isVIP, boolean localTransfer) {
        return new CommissionCalculatorContext(selectStrategy(isVIP, localTransfer)).executeStrategy(amount);
    }

    private CommissionStrategy selectStrategy(boolean isVip, boolean localTransfer) {
        if (isVip)
            return new VIPCommissionStrategy();
        if (!localTransfer)
            return new InternationalTransferCommissionStrategy();

        return new RegularCommissionStrategy();
    }

}
