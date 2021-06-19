package example.three.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BeerCanTest {

    @Test
    void drinksSomePortion() {
        BeerCan can = new BeerCan("Some type of beer");
        can.drink(73);

        System.out.println(can.isFull());

        can.drink(400);

        System.out.println(can.isFull());

        //    What is the output?
    }

}