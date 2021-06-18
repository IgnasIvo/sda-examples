package facade;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class BankOperationCreator {

    public void createOperation(String fromAccount, String toAccount, BigDecimal amount) {
        System.out.printf("Operation created: %s -> %s (%f)%n", fromAccount, toAccount, amount.doubleValue());
    }

}
