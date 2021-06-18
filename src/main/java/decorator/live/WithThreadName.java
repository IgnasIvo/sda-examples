package decorator.live;

import java.util.Date;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class WithThreadName extends LoggingDecorator {

    public WithThreadName(Logger logger) {
        super(logger);
    }

    @Override
    public String decorate() {
        return "[SUPER-THREAD] ";
    }

}
