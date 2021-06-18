package facade;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class BankTransferFacade {
    private final AccountValidator accountValidator = new AccountValidator();
    private final AntiFraudChecker antiFraudChecker = new AntiFraudChecker();
    private final BankOperationCreator bankOperationCreator = new BankOperationCreator();
    private final CurrencyConverter currencyConverter = new CurrencyConverter();
    private final TransferValidator transferValidator = new TransferValidator();

    public void performTransfer(String fromAccount, String toAccount, BigDecimal amount) {
        accountValidator.validateAccount(fromAccount);
        accountValidator.validateAccount(toAccount);
        transferValidator.validateTransferAccounts(fromAccount, toAccount);
        transferValidator.validateAmount(amount);
        antiFraudChecker.checkForFraud(fromAccount, toAccount, amount);
        amount = currencyConverter.convertToReceiverCurrency(fromAccount, toAccount, amount);
        bankOperationCreator.createOperation(fromAccount, toAccount, amount);
    }

}
