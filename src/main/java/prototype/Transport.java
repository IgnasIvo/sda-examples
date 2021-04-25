package prototype;

/***
 *
 * @author Ignas Ivoska
 *
 */
public abstract class Transport implements Cloneable {

    protected String transportType;

    abstract void use();

    public Transport clone() {
        Transport clone = null;
        try {
            clone = (Transport) super.clone();
            clone.transportType = "Cloned " + clone.transportType;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
