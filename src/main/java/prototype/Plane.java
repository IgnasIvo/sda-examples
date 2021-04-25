package prototype;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Plane extends Transport {

    public Plane() {
        this.transportType = "Plane";
    }

    @Override
    void use() {
        System.out.println(transportType + " goes wooosh");
    }

}
