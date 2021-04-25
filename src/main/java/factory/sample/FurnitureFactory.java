package factory.sample;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class FurnitureFactory {

    public static Furniture createFurnitureByType(String type) {
        if (type.equalsIgnoreCase("chair")) {
            return new Chair();
        } else if (type.equalsIgnoreCase("table")) {
            return new Table();
        }

        return null;
    }

}
