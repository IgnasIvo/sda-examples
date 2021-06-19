package example.six.five;

import example.six.three.Food;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*

    We can now create a concrete implementation of our food.

 */
public class GummyBear extends Food {

    @Override
    public void chew() {
        System.out.println("Nom nom nom");
    }

}
