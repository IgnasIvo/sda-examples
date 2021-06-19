package example.seven.five;

import example.seven.four.Bottle;
import example.six.four.Water;
import example.six.two.Drink;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    We can now create a concrete implementation of our bottle - a bottle that will hold water.
 */
public class WaterBottle implements Bottle {

    private final int millilitreCapacity;
    private int remaining;

    public WaterBottle(int millilitreCapacity) {
        this.millilitreCapacity = millilitreCapacity;
        this.remaining = millilitreCapacity;
    }

    @Override
    public int getCapacityMillilitres() {
        return millilitreCapacity;
    }

    @Override
    public boolean hasContents() {
        return remaining > 0;
    }

    @Override
    public Drink get() {
        if (!hasContents()) {
            throw new IllegalStateException("Container is empty");
        }
        remaining--;
        return new Water();
    }

}
