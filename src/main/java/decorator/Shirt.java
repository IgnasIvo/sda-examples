package decorator;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Shirt implements Clothing {

    @Override
    public String decorate() {
        return "Shirt";
    }

}
