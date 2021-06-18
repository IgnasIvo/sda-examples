package decorator.live;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class ConsoleLoggerTest {

    @Test
    void logs() {
        Logger logger = new ConsoleLogger();
        logger.log("Hello world");
        logger = new WithTimestamp(logger);
        logger.log("Hello again, world!");
        logger = new WithThreadName(logger);
        logger.log("Hey hey hey");
    }

}