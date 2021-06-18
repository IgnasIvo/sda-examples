package facade;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class AutomaticBankTransferCreator {
    private final AutomaticTransferListReceiver transferListReceiver = new AutomaticTransferListReceiver();
    private final BankTransferFacade transferFacade = new BankTransferFacade();

    public void performTransfers() {
        transferListReceiver.getNeededTransfers()
                .forEach(transfer -> transferFacade.performTransfer(transfer.getFromAccount(), transfer.getToAccount(), transfer.getAmount()));
    }

}
