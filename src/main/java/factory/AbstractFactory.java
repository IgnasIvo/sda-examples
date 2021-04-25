package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public interface AbstractFactory<T> {

    T create(String type);

}
