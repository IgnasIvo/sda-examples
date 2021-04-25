package singleton;

/***
 *
 * Example of a lazy singleton
 * @author Ignas Ivoska
 *
 */
public class LazyDatabase {
    private static LazyDatabase INSTANCE; // The instance is not created immediately - it is null

    private LazyDatabase() { // The constructor - its private so an instance of this class cannot be created anywhere other than through getInstance
        System.out.println("Connected to the database in a lazy way!");
    }

    public static LazyDatabase getInstance() { // Method to get the instance with lazy initialization
        if (INSTANCE == null) { // The lazy initialization part - first we check if it is null, and if it is, we create the instance
            INSTANCE = new LazyDatabase(); // Cals the private constructor
        } // Lazy initialization has problems - if we are working with a multi-threaded application, the initialization could be done multiple times, thus breaking the Singleton principle
        return INSTANCE;
    }

}
