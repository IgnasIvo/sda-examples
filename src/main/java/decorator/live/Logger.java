package decorator.live;

/***
 *
 * @author Ignas Ivoska
 *
 */
public interface Logger {

    String decorate();

    void log(String message);

}
