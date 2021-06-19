package example.six.two;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class DrinkTest {

    @Test
    void createsFood() {
        // Drink drink = new Drink(); can we do this?

        Drink drink = new Drink() { // what is this?
            @Override
            public void consume() {
                System.out.println("Gulp");
            }
        };

        drink.consume();

        // What is the output?
    }

}