package decorator;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class CrappyLogo extends ClothingDecorator {

    public CrappyLogo(Clothing clothing) {
        super(clothing);
    }

    public String decorate() {
        return super.decorate() + decorateWithLogo();
    }

    private String decorateWithLogo() {
        return " with a crappy logo";
    }

}