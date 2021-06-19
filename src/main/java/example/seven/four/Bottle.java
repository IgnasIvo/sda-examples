package example.seven.four;

import example.seven.three.DrinkContainer;
import example.six.two.Drink;

/***
 *
 * @author Ignas Ivoska
 *
 */
public interface Bottle extends DrinkContainer<Drink> {

    int getCapacityMillilitres(); // our bottle has a maximum millilitres it can hold.

}
