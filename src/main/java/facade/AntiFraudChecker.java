package facade;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class AntiFraudChecker {

    public void checkForFraud(String fromAccount, String toAccount, BigDecimal amount) {
        if (fromAccount.contains("SCAM") || toAccount.contains("SCAM")) {
            System.err.println("The accounts are marked as fraud-prone");
        }
        if (amount.compareTo(BigDecimal.valueOf(1000000L)) > 0) {
            System.err.println("The amount is very large!");
        }
    }

}
