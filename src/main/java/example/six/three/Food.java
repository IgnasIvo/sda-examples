package example.six.three;

import example.six.one.Consumable;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*

    We will now define our food.
    As we found before, food needs to be chewed in order to be consumed.
    Abstract classes can have methods, similarly to interfaces, which have to be implemented by the non-abstract children.

    We will compose this Consumable interface with abstract methods to create a food that needs to be chewed to be consumed.

 */
public abstract class Food implements Consumable {

    public abstract void chew();

    @Override
    public void consume() {
        /*
            To consume a food, we chew it. Children classes of Food need to know how to be chewed, but the dont need to know how to consume them anymore
            They can, however, override this behaviour.
         */
        chew();
    }

}
