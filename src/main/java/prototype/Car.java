package prototype;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Car extends Transport {

    public Car() {
        this.transportType = "Car";
    }

    @Override
    void use() {
        System.out.println(transportType + " goes skrrr");
    }

}
