package example.seven.two;

import example.six.four.Water;
import example.six.one.Consumable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 *
 * @author Ignas Ivoska
 *
 */
class ConsumableContainerTest {

    @Test
    void createsConsumableContainer() {
        /*
        ConsumableContainer<String> consumableContainer = new ConsumableContainer<String>() {
            @Override
            public boolean hasContents() {
                return false;
            }

            @Override
            public Consumable get() {
                return null;
            }
        };
        consumableContainer.hasContents();
        consumableContainer.get();
        // Will this work?
         */

        /*
        ConsumableContainer<Water> consumableContainer = new ConsumableContainer<Water>() {
            @Override
            public boolean hasContents() {
                return false;
            }

            @Override
            public Consumable get() {
                return null;
            }
        };
        consumableContainer.hasContents();
        consumableContainer.get();
        // Will this work?
         */
    }

}