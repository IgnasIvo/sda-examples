package example.seven.six;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BottleSizeTest {

    @Test
    void getsSizes() {
        BottleSize size = BottleSize.HUGE;

        System.out.println(size.getMillilitres());
    }

}