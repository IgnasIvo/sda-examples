package factory.sample;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Chair implements Furniture {

    @Override
    public String type() {
        return "Chair";
    }

}
