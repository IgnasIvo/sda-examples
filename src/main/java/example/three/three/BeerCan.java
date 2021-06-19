package example.three.three;

import example.one.Food;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    I said there would be two steps, but ill give you a third one for free!

    There are a few more upgrades we can do to our class.
        - We could not know the amount of liquid left in the can
        - We would like to get some more information about our can
 */
public class BeerCan extends Food {

    private final int maximumCanMillilitres;
    private int millilitres = 473;

    public BeerCan(String name) {
        super(name);
        this.maximumCanMillilitres = millilitres;
    }

    public BeerCan(String name, int millilitres) {
        super(name);
        this.maximumCanMillilitres = millilitres;
        this.millilitres = millilitres;
    }

    public int getMaximumCanMillilitres() {
        return maximumCanMillilitres;
    }

    /*
        We generate a getter to see how much of the can is left
     */
    public int getMillilitres() {
        return millilitres;
    }

    public boolean isFull() {
        return maximumCanMillilitres == millilitres;
    }

    public boolean isEmpty() {
        return millilitres == 0;
    }

    public void drink(int millilitres) {
        if (!canDrink(millilitres)) {
            throw new IllegalArgumentException("Cannot drink that much from this can");
        }
        this.millilitres -= millilitres;
    }

    private boolean canDrink(int millilitresToDrink) {
        return millilitresToDrink > 0 && millilitres >= millilitresToDrink;
    }

    /*
        We give a method to give some nice info about our beer can.
        All of our classes are children of another class - Object.
        Object class has some methods of it's own, that we use to work with them. A few examples:
            equals, toString
        toString method gives us a String object representation of our object.
        Java allows us to change the behaviour of this method using polymerisation - we can override the method of the parent.
        For the sake of sanity, let's add @Override on top of our overridden method.
     */
    @Override
    public String toString() {
        /*
            We can use + to add together multiple strings to form one string.
            We have to use the getter to access fields of the parent class as they are private.
        */
        return "A can of " + getName() + " (" + maximumCanMillilitres + "ml) - " + millilitres + "ml left";
    }

}
