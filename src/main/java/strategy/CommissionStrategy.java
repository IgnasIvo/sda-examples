package strategy;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public interface CommissionStrategy {

    BigDecimal calculateCommission(BigDecimal amount);

}
