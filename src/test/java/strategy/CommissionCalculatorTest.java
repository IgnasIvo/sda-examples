package strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
class CommissionCalculatorTest {

    @Test
    void calculatesCommissionsDynamically() {
        CommissionCalculator calculator = new CommissionCalculator();

        System.out.println(calculator.calculateCommission(BigDecimal.ONE, false, true));
        System.out.println(calculator.calculateCommission(BigDecimal.valueOf(100d), false, true));
        System.out.println(calculator.calculateCommission(BigDecimal.valueOf(100d), true, true));
        System.out.println(calculator.calculateCommission(BigDecimal.valueOf(100d), true, false));
        System.out.println(calculator.calculateCommission(BigDecimal.valueOf(100d), false, false));
    }

}