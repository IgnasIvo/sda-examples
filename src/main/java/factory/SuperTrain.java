package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class SuperTrain extends Train {

    @Override
    public String getTransport() {
        return "Super Train";
    }

    @Override
    public String makeSounds() {
        return "Zooom";
    }

}
