package decorator;

/***
 *
 * @author Ignas Ivoska
 *
 */
public abstract class ClothingDecorator implements Clothing {
    private final Clothing clothing;

    ClothingDecorator(Clothing clothing) {
        this.clothing = clothing;
    }

    @Override
    public String decorate() {
        return clothing.decorate();
    }
}
