package singleton.shelf;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BookShelfTest {

    @Test
    void singletonWorks() {
        BookShelf.getInstance().add("A");
        BookShelf.getInstance().add("B");
    }

}