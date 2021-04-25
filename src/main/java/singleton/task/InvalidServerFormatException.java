package singleton.task;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class InvalidServerFormatException extends Exception {

    public InvalidServerFormatException() {
        super("Servers must start with http");
    }

}
