package example.three.two;

import example.one.Food;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    There are still issues with our class. Let's fix the flaws from part one to make the class less logically flawed.
    The issues are mainly
        - Our isFull can method is faulty
            - it tells us if the can is empty, not if it's full
            - being not empty and being full are two different things
        - We can keep drinking even once the can is empty
 */
public class BeerCan extends Food {

    /*
        We defined two fields instead of one.
        maximumCanMillilitres contains the maximum capacity - this cannot be changed normally without breaking the can, so we declare this
                                                              as a final field. This means it cannot be changed.
        millilitres contains the remaining amount of liquid. We set the value by default
        
        We set the value of millilitres by default - why cant we define the maximum capacity here also?
     */
    private final int maximumCanMillilitres;
    private int millilitres = 473;

    public BeerCan(String name) {
        super(name);
        this.maximumCanMillilitres = millilitres; /* We set the value in the constructor - a final field MUST be set during construction */
    }

    public BeerCan(String name, int millilitres) {
        super(name);
        this.maximumCanMillilitres = millilitres;
        this.millilitres = millilitres;
    }

    /*
        Our method to get can size.
        Can we have a method to set the can size?
     */
    public int getMaximumCanMillilitres() {
        return maximumCanMillilitres;
    }

    /*
            Our method which tells us if the can is full
     */
    public boolean isFull() {
        return maximumCanMillilitres == millilitres; // Now the can can only be full if the remaining liquid is the same as the maximum capacity.
    }

    /*
        Our method to say if the can is empty or not
     */
    public boolean isEmpty() {
        return millilitres == 0;
    }

    /*
        Our method to "extract" a specific amount of liquid from the can.
     */
    public void drink(int millilitres) {
        if (!canDrink(millilitres)) {
            /*
                We use exceptions to stop from drinking an illegal amount
                If an exception is thrown, the millilitres will not be extracted, and an error will given.
             */
            throw new IllegalArgumentException("Cannot drink that much from this can");
        }
        this.millilitres -= millilitres; // This method is also still logically flawed, but these fixes will be in step two.
    }

    /*
        In this method we check if the amount can be extracted from the can.
     */
    private boolean canDrink(int millilitresToDrink) {
        return millilitresToDrink > 0 && millilitres >= millilitresToDrink;
    }

}
