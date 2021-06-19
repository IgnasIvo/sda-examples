package example.five;

import example.one.Food;
import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class AnonymousTest {

    // Ignore this - this is to help the navigation through the code :)
    private final Anonymous anonymous = new Anonymous();

    @Test
    void createsAnonymousClass() {
        Food watermelon = new Food("Watermelon");
        Food someStrangeFood = new Food("Watermelon") { // We create a new child of our food class with different behaviour, but of an unknown (anonymous) subtype.
          @Override
          public String getName() { // we override the behaviour of our food's getName() method
              return "?";
          }
        };
        Food anEvenStrangerFood = new Food("Watermelon") {
            @Override
            public String getName() {
                return "Whoa " + super.getName(); // we overwrite the getName() method by adding additional logic and then calling the parent (Food class) getName() method
            }
        };
        System.out.println(watermelon.getName());
        System.out.println(someStrangeFood.getName());
        System.out.println(anEvenStrangerFood.getName());

        // What is the output?
    }

}