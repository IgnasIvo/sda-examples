package example;

import example.one.Food;
import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class FoodTest {

    @Test
    void creatingObjects() {
        Food iceCream = new Food("Ice cream");
        Food watermelon = new Food("Watermelon");

        System.out.println(iceCream.getName());
        System.out.println(watermelon.getName());

        // What will be the output?
    }

    @Test
    void updatingObjects() {
        Food iceCream = new Food("Ice cream");
        Food watermelon = new Food("Watermelon");
        iceCream.setName("Cream of ice");
        watermelon.setName("Ice cream");

        System.out.println(iceCream.getName());
        System.out.println(watermelon.getName());

        // What will be the output?
    }

}