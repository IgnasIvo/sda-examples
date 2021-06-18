package facade;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class AccountValidator {

    public void validateAccount(String account) {
        System.out.println("Validating bank account");
        if (!account.startsWith("LT"))
            throw new RuntimeException("Account must start with LT...");
    }

}
