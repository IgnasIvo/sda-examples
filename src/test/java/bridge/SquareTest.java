package bridge;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class SquareTest {

    @Test
    void createsSquares() {
        Square redSquareWithBlueFill = new Square(new Red(), new Blue());
        Square blueSquareWithRedFill = new Square(new Blue(), new Red());
        System.out.println(redSquareWithBlueFill);
        System.out.println(blueSquareWithRedFill);
    }

}