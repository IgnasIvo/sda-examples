package example.seven.five;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class WaterBottleTest {

    @Test
    void hydrates() {
        WaterBottle waterBottle = new WaterBottle(10);
        System.out.println(waterBottle.hasContents());
        for (int i=0; i<10; i++) {
            waterBottle.get().consume();
        }
        System.out.println(waterBottle.hasContents());
    }


    @Test
    void drinksMore() {
        WaterBottle waterBottle = new WaterBottle(10);
        System.out.println(waterBottle.hasContents());
        for (int i=0; i<10; i++) {
            waterBottle.get().consume();
        }
        System.out.println(waterBottle.hasContents());
        waterBottle.get().consume();
    }

}