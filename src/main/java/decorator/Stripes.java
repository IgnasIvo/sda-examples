package decorator;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Stripes extends ClothingDecorator {

    public Stripes(Clothing clothing) {
        super(clothing);
    }

    public String decorate() {
        return super.decorate() + decorateWithStripes();
    }

    private String decorateWithStripes() {
        return " with stripes";
    }

}
