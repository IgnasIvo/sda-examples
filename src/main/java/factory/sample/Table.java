package factory.sample;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Table implements Furniture {

    @Override
    public String type() {
        return "Table";
    }

}
