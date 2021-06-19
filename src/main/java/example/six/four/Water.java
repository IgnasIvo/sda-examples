package example.six.four;

import example.six.two.Drink;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    We now can create a concrete implementation of our Drink
 */
public class Water extends Drink {

    // can this be removed?
    @Override
    public void consume() {
        System.out.println("Gulp!");
    }

}
