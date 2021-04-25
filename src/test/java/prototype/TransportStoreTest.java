package prototype;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class TransportStoreTest {

    @Test
    void getsTransportClonesFromStore() {
        TransportStore.getTransport("car").use();
        TransportStore.getTransport("plane").use();
        TransportStore.getTransport("train").use();
    }

}