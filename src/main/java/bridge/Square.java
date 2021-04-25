package bridge;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Square implements Shape {
    private final Color color;
    private final Color fill;

    public Square(Color color, Color fill) {
        this.color = color;
        this.fill = fill;
    }

    @Override
    public Color color() {
        return color;
    }

    @Override
    public Color fill() {
        return fill;
    }

    @Override
    public String shape() {
        return "square";
    }

    @Override
    public String toString() {
        return color().color() + " " + shape() + " with " + fill().color() + " fill";
    }

}
