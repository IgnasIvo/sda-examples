package example.seven.two;

import example.seven.one.Container;
import example.six.one.Consumable;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    We can now create another interface - a container for consumables
    This is still abstract - consumables could be in various containers. This is just a container for consumables.
    We define that only Consumables can be used with this generic (we state that our T must extend Consumable)
 */
public interface ConsumableContainer<T extends Consumable> extends Container<Consumable> {

    boolean hasContents();

}
