package clean;

import java.util.Collections;
import java.util.List;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class DatabaseBankAccountRegistry implements BankAccountRegistry {

    @Override
    public List<String> getBankAccounts() {
        System.out.println("Getting from database");
        return Collections.emptyList();
    }
}
