package example.three.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BeerCanTest {

    @Test
    void givesInfo() {
        BeerCan beerCan = new BeerCan("SuperDuperBeer");

        System.out.println(beerCan.toString());

        // What will be the output?
    }

    @Test
    void givesInfoAfterChanges() {
        BeerCan beerCan = new BeerCan("SuperDuperBeer");
        beerCan.drink(400);


        System.out.println(beerCan.toString());

        // What will be the output?

    }

}