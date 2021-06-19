package example.seven.seven;

import example.seven.four.Bottle;
import example.seven.six.BottleSize;
import example.six.four.Water;
import example.six.two.Drink;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    Let's upgrade our water bottle to take a predefined size.
 */
public class WaterBottle implements Bottle {

    private final int millilitreCapacity;
    private int remaining;

    public WaterBottle(BottleSize bottleSize) {
        this.millilitreCapacity = bottleSize.getMillilitres();
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
