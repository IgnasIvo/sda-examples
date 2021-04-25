package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public interface Vaccine {
    String name();
    String disease();
    Double shotSuccessRate();

    default String into() {
        return String.format("%s: %s (%f)", name(), disease(), shotSuccessRate());
    }

}
