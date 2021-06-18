package facade;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class CurrencyConverter {

    public BigDecimal convertToReceiverCurrency(String fromAccount, String toAccount, BigDecimal amount) {
        System.out.println("Converting currency");
        if (fromAccount.endsWith("USD")) {
            amount = amount.multiply(BigDecimal.valueOf(0.9d));
        } else if (toAccount.endsWith("USD")) {
            amount = amount.multiply(BigDecimal.valueOf(1.1d));
        }
        return amount;
    }

}
