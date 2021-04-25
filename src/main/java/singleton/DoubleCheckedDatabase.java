package singleton;

/***
 *
 * Example of a double checked singleton
 * @author Ignas Ivoska
 *
 */
public class DoubleCheckedDatabase {
    private static volatile DoubleCheckedDatabase INSTANCE; // Our instance - volatile guarantees the visibility in all threads (as its written in the main memory)

    private DoubleCheckedDatabase() { // Private constructor so it could not be created by other means
        System.out.println("Double checked database initialized!");
    }

    public static DoubleCheckedDatabase getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedDatabase();
                }
            }
        }
        return INSTANCE;
    }

}
