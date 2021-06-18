package clean;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Bank {

    private final BankAccountRegistry bankAccountRegistry;

    public Bank(BankAccountRegistry bankAccountRegistry) {
        this.bankAccountRegistry = bankAccountRegistry;
    }

}
