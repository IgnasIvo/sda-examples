package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public interface Transport {
    String getTransport();
    String makeSounds();

    default String into() {
        return String.format("%s: %s!", getTransport(), makeSounds());
    }

}
