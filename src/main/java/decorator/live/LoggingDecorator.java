package decorator.live;

/***
 *
 * @author Ignas Ivoska
 *
 */
public abstract class LoggingDecorator implements Logger {
    private final Logger logger;

    LoggingDecorator(Logger logger) {
        this.logger = logger;
    }

    public String decorate() {
        return logger.decorate();
    }

    public void log(String message) {
        logger.log(decorate() + message);
    }

}
