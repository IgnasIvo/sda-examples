package example.four;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BeerCanTest {

    @Test
    void showsStrength() {
        BeerCan can = new BeerCan("Something", 4.5);

        System.out.println(can.toString());
    }

}