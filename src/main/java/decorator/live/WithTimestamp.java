package decorator.live;

import java.util.Date;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class WithTimestamp extends LoggingDecorator {

    public WithTimestamp(Logger logger) {
        super(logger);
    }

    @Override
    public String decorate() {
        return new Date().toString() + " ";
    }

}
