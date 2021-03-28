import configuration.ApplicationConfiguration;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class HelloWorldApplication {
    private static final String DATABASE_NAME_PROPERTY = "db.name";
    private static final String DATABASE_USER_PROPERTY = "db.user";
    private static final String DATABASE_USER_PASSWORD_PROPERTY = "db.password";

    public static void main(String[] args) {
        System.out.println("Database: " + ApplicationConfiguration.get(DATABASE_NAME_PROPERTY));
        System.out.println("Database user: " + ApplicationConfiguration.get(DATABASE_USER_PROPERTY));
        System.out.println("Database password: " + ApplicationConfiguration.get(DATABASE_USER_PASSWORD_PROPERTY));
        if (ApplicationConfiguration.isDeveloperMode()) {
            System.out.println("=========================================================================");
            System.out.println("=                            WARNING!                                   =");
            System.out.println("=                    Running in Developer Mode                          =");
            System.out.println("=                    DO NOT RUN IN PRODUCTION!                          =");
            System.out.println("=========================================================================");
        }
    }

}
