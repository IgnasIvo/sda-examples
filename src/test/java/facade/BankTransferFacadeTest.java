package facade;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BankTransferFacadeTest {

    @Test
    void doesAutoTransfers() {
        new AutomaticBankTransferCreator().performTransfers();
    }

    @Test
    void facadeDoesTransfer() {
        new BankTransferFacade().performTransfer("LT000", "LT002", BigDecimal.TEN);
    }

}