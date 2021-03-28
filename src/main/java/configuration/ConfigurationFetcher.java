package configuration;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

import java.io.File;
import java.util.Optional;

/***
 *
 * @author Ignas Ivoska
 *
 */
class ConfigurationFetcher {

    // Private constructor - this is a utility class and should not have new instances created
    private ConfigurationFetcher() {
    }

    static String getStringProperty(String key) {
        return Optional.ofNullable(overridingConfiguration().getString(key, null))
                .orElseGet(() -> baseConfiguration().getString(key, null));
    }

    static Boolean getBooleanProperty(String key) {
        return Optional.ofNullable(overridingConfiguration().getBoolean(key, null))
                .orElseGet(() -> baseConfiguration().getBoolean(key, false));
    }

    private static Configuration baseConfiguration() {
        return configuration("application.properties");
    }

    private static Configuration overridingConfiguration() {
        return configuration("application_local.properties");
    }

    private static Configuration configuration(String file) {
        Configurations configurations = new Configurations();
        try {
            return configurations.properties(new File(file));
        } catch (Exception e) {
            throw new RuntimeException("Failed to load properties for " + file, e);
        }
    }

}
