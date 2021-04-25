package factory.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 *
 * @author Ignas Ivoska
 *
 */
class FurnitureFactoryTest {

    @Test
    void factoryCreatesObjects() {
        Furniture chair = FurnitureFactory.createFurnitureByType("chair");
        System.out.println(chair.type());
    }

}