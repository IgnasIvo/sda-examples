package example.six.two;

import example.six.one.Consumable;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    Now that we have our consumable, we can create our Drink class.
    Knowing that something is a drink is not of much use to us on it's own - we will want to know
    how this drink behaves. We will use the abstract class mechanism to do this.

    An abstract class does not need to define the behaviour of the interface it implements. The non-abstract children will define it.
 */
public abstract class Drink implements Consumable {
}
