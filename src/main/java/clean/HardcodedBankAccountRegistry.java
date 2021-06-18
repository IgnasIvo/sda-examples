package clean;

import java.util.Arrays;
import java.util.List;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class HardcodedBankAccountRegistry implements BankAccountRegistry {

    @Override
    public List<String> getBankAccounts() {
        return Arrays.asList("aaa", "bbb");
    }

}
