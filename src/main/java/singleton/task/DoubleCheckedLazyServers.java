package singleton.task;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class DoubleCheckedLazyServers {
    private static final String SERVER_MANDATORY_BEGINNING = "http";
    private static final String HTTP_PROTOCOL = "http://";
    private static final String HTTPS_PROTOCOL = "https://";

    private volatile static DoubleCheckedLazyServers INSTANCE;

    private final Set<String> servers = new HashSet<>();

    private DoubleCheckedLazyServers() {
    }

    public static DoubleCheckedLazyServers getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedLazyServers.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLazyServers();
                }
            }
        }
        return INSTANCE;
    }

    public void addServer(String server) throws InvalidServerFormatException {
        if (!server.startsWith(SERVER_MANDATORY_BEGINNING)) {
            throw new InvalidServerFormatException();
        }
        servers.add(server);
    }

    public Set<String> getServers() {
        return servers;
    }

    public Set<String> getHttpServers() {
        return getFilteredServers(HTTP_PROTOCOL);
    }

    public Set<String> getHttpsServers() {
        return getFilteredServers(HTTPS_PROTOCOL);
    }

    private Set<String> getFilteredServers(String beginning) {
        return servers.stream()
                .filter(server -> server.startsWith(beginning))
                .collect(Collectors.toSet());
    }

}
