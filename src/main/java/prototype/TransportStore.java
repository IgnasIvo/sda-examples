package prototype;

import java.util.HashMap;
import java.util.Map;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class TransportStore {
    private static final Map<String, Transport> TRANSPORT_MAP = new HashMap<>();

    static {
        TRANSPORT_MAP.put("car", new Car());
        TRANSPORT_MAP.put("train", new Train());
        TRANSPORT_MAP.put("plane", new Plane());
    }

    public static Transport getTransport(String type) {
        return TRANSPORT_MAP.get(type).clone();
    }

}
