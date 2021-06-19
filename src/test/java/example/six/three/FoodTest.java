package example.six.three;

import example.six.one.Consumable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 *
 * @author Ignas Ivoska
 *
 */
class FoodTest {

    @Test
    void createsFood() {
        // Food food = new Food(); Do I even need to ask?

        Food food = new Food() {
            @Override
            public void chew() {
                System.out.println("Nom");
            }
        };

        // food.chew(); /* can we do this? */
        // food.consume(); /* can we do this? */

        Consumable something = new Food() {
            @Override
            public void chew() {
                System.out.println("Bleh");
            }
        };

        // something.chew();  /* can we do this? */
        // something.consume(); /* can we do this? */

        // What is the output?
    }

}