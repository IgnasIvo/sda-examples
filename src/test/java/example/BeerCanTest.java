package example;

import example.one.Food;
import example.two.BeerCan;
import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BeerCanTest {

    @Test
    void createsCansOfBeer() {
        BeerCan greatBeerCan = new BeerCan("This ad space is for sale"); // we can create a BeerCan object. We have a full can of a beer that has no name (yet)
        BeerCan emptyCan = new BeerCan("Evil corporation empty cans", false); // we use the other constructor to give us an empty beer can

        System.out.println(greatBeerCan.getName() + ": " + greatBeerCan.isFull());
        System.out.println(greatBeerCan.getName() + ": " + emptyCan.isFull());

        greatBeerCan.drink(); // <- we can access the drink method, as this is a BeerCan.

        System.out.println(greatBeerCan.getName() /* But we can also access the getName method, as a BeerCan is also a Food. */  + ": " + greatBeerCan.isFull());
        System.out.println(greatBeerCan.getName() + ": " + emptyCan.isFull());

        // What is the output?
    }

    @Test
    void createsFood() {
        Food chips = new Food("Chips");
        Food beer = new BeerCan("A nice can of beer");

        System.out.println(chips.getName());
        System.out.println(beer.getName());

        // beer.drink(); /* can we uncomment this line? */
    }

}