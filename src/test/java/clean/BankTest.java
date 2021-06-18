package clean;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BankTest {

    @Test
    void createsBank() {
        Bank bank = new Bank(new DatabaseBankAccountRegistry());
    }

}