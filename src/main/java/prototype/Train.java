package prototype;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Train extends Transport {

    public Train() {
        this.transportType = "Train";
    }

    @Override
    void use() {
        System.out.println(transportType + " goes chugachugachuga");
    }
}
