package singleton;

/***
 *
 * Example of an eager singleton
 * @author Ignas Ivoska
 *
 */
public class EagerDatabase {
    private static final EagerDatabase INSTANCE = new EagerDatabase();

    private EagerDatabase() { // private constructor so an instance could not be created any other way
        System.out.println("Connected to the database in an eager way!");
    }

    public static EagerDatabase getInstance() {
        return INSTANCE;
    }

}
