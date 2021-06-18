package facade;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class TransferValidator {

    public void validateAmount(BigDecimal amount) {
        System.out.println("Validating the transfer..");
        if (amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new RuntimeException("Transfer amount cannot be less than zero");
    }

    public void validateTransferAccounts(String fromAccount, String toAccount) {
        System.out.println("Validation accounts");
        if (fromAccount.equalsIgnoreCase(toAccount))
            throw new RuntimeException("Transfer cannot be performed to the same account");
    }

}
