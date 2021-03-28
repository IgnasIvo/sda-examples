package configuration;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class ApplicationConfiguration {
    private static final String IS_DEVELOPER_MODE_PROPERTY = "app.developer.mode.enabled";

    private ApplicationConfiguration() {
    }

    public static boolean isDeveloperMode() {
        return ConfigurationFetcher.getBooleanProperty(IS_DEVELOPER_MODE_PROPERTY);
    }

    public static String get(String key) {
        return ConfigurationFetcher.getStringProperty(key);
    }

}
