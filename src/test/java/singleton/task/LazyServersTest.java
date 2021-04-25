package singleton.task;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class LazyServersTest {

    @Test
    void ambiguousAnswers() throws InvalidServerFormatException {
        EagerServers.getInstance().addServer("http://aaaa");
        Servers.INSTANCE.addServer("http://aaaaa");

    }

}