package example.six.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 *
 * @author Ignas Ivoska
 *
 */
class ConsumableTest {

    @Test
    void creatingConsumable() {
        // Consumable consumable = new Consumable(); can this be done?

        Consumable consumable = new Consumable() { // We can declare how this object will behave in-line (think anonymous classes)
            @Override
            public void consume() {
                System.out.println("Nom nom nom");
            }
        };

        consumable.consume();

        // what will be the output?
    }

}