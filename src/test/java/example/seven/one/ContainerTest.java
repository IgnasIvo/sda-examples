package example.seven.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 *
 * @author Ignas Ivoska
 *
 */
class ContainerTest {

    @Test
    void createsContainer() {
        /* While creating an object that uses generics, we have to specify the class it will work with (replacing the <T> with <String> in this instance) */
        Container<String> container = new Container<String>() {
            @Override
            public String get() {
                return "This string is inside the container";
            }
        };

        System.out.println(container.get());

        // what's the output?
    }

}