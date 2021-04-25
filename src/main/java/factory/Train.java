package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Train implements Transport {

    @Override
    public String getTransport() {
        return "Train";
    }

    @Override
    public String makeSounds() {
        return "Chugachugachuga";
    }

    @Override
    public String toString() {
        return this.into();
    }

}
