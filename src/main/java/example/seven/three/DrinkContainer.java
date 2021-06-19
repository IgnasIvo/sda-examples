package example.seven.three;

import example.seven.two.ConsumableContainer;
import example.six.two.Drink;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*

    We go one more level up the abstractions
    A consumable container can be a drink container

 */
public interface DrinkContainer<T extends Drink> extends ConsumableContainer<Drink> {
}
