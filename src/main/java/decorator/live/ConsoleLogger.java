package decorator.live;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class ConsoleLogger implements Logger {

    @Override
    public String decorate() {
        return "";
    }

    @Override
    public void log(String message) {
        System.out.println(decorate() + message);
    }

}
