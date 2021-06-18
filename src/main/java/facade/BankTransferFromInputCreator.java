package facade;

import java.math.BigDecimal;
import java.util.Scanner;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class BankTransferFromInputCreator {
    private static final BankTransferFacade TRANSFER_FACADE = new BankTransferFacade();

    public static void main(String... args) {
        doTransfer();
    }

    public static void doTransfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account");
        String fromAccount = scanner.nextLine();
        System.out.println("Enter other account");
        String toAccount = scanner.nextLine();
        System.out.println("Enter amount");
        BigDecimal amount = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
        TRANSFER_FACADE.performTransfer(fromAccount, toAccount, amount);
    }

}
