package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Motorcycle implements Transport {

    @Override
    public String getTransport() {
        return "Motorcycle";
    }

    @Override
    public String makeSounds() {
        return "Wroom";
    }

    @Override
    public String toString() {
        return this.into();
    }

}
