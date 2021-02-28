package utilities.input;

import java.util.Scanner;

/***
 * Implementation of the InputReceiver
 * Simply receives next input line. Created for unit test purposes
 * @author Ignas Ivoska
 *
 */
public class DefaultInputReceiver implements InputReceiver {

    private final Scanner in = new Scanner(System.in);

    @Override
    public String receiveLine() {
        return in.nextLine();
    }

}
