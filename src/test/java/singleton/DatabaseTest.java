package singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class DatabaseTest {

    @Test
    void enumSingletonHasOneInstance() {
        Database database = Database.INSTANCE;
        System.out.printf("Executed queries in the beginning: %d%n", database.getExecutedQueries());
        Assertions.assertEquals(database.getExecutedQueries(), 0);

        Database.INSTANCE.executeQuery();
        System.out.printf("Executed queries after executeQuery(): %d%n", database.getExecutedQueries());
        Assertions.assertEquals(database.getExecutedQueries(), 1);
    }

}