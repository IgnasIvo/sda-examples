package example.three.one;

import example.one.Food;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    Now we had a beer can that we can drink, but it still had problems. Let's say we identified a few, which would be
        - We can drink only the full can
        - We can drink an empty can

    Lets try to solve these issues in two steps. This class demonstrates the first step
 */
public class BeerCan extends Food {

    /*
        We changed the boolean isFull which used to tell us, well.. if the can is full.
        Instead, we now have millilitres of the content defined - it allows us to drink some amount, leaving the rest.
     */
    private int millilitres;

    public BeerCan(String name) {
        super(name);
        this.millilitres = 473; // Why 473? :)
    }

    public BeerCan(String name, int millilitres) {
        super(name);
        this.millilitres = millilitres;
    }

    /*
        Our method which tells us if the can is full
     */
    public boolean isFull() {
        return millilitres > 0; // This method is now logically flawed - but we will fix this in step two.
    }

    /*
        Our method to "extract" a specific amount of liquid from the can.
     */
    public void drink(int millilitres) {
        this.millilitres -= millilitres; // This method is also still logically flawed, but these fixes will be in step two.
    }

}
