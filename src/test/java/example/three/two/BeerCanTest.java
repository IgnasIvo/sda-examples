package example.three.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BeerCanTest {

    @Test
    void drinksSomeBeer() {
        BeerCan can = new BeerCan("A nice pint");

        System.out.println(can.isFull());

        can.drink(250);
        can.drink(250);

        System.out.println(can.isFull());
        System.out.println(can.isEmpty());

        // What will be the result?
    }

    @Test
    void drinksSomeMoreBeer() {
        BeerCan can = new BeerCan("Another nice pint");

        System.out.println(can.isFull());

        can.drink(400); // what will happen if we move this into the try block?

        /*
            We can use the try-catch mechanism to handle the exceptions that are thrown by code.
         */
        try { // the try block. execute this block of code
            can.drink(100);
        } catch (IllegalArgumentException exception) { // catch block - if the try blocks code throws an exception, execute this block
            can.drink(73);
        } finally { // finally block - execute this after handling the try/catch blocks (executes after either)
            System.out.println("That was a nice drink!");
        }

        System.out.println(can.isFull());
        System.out.println(can.isEmpty());

        // What will be the result?
    }

}