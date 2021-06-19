package example.four;

import example.one.Food;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    We have a decent beer can class. But the thing is, that beer is different not only in branding (e.g. name)
    The liquid has various properties of it's own which we need to define.
    There are various way to perform this. For this example, let's make use of inner classes.

    Inner classes are classes defined of another class as an inner-classification for easier grouping.

 */
public class BeerCan extends Food {
    /*
        Our inner class - liquid properties have their own logic of working and are separated from the beer can itself.
     */
    public static class LiquidProperties {
        private final double alcohol;

        public LiquidProperties(double alcohol) {
            if (alcohol < 0) {
                throw new IllegalArgumentException("Strength cannot be negative");
            }
            this.alcohol = alcohol;
        }

        public double getAlcohol() {
            return alcohol;
        }
    }

    private final int maximumCanMillilitres;
    /*
        Our beer now as an internal class which we will use as another field. Once the cans liquid properties are set - can they be changed?
     */
    private final LiquidProperties liquidProperties;
    private int millilitres = 473;

    public BeerCan(String name, Double strength) {
        super(name);
        this.maximumCanMillilitres = millilitres;
        this.liquidProperties = new LiquidProperties(strength);
    }

    public BeerCan(String name, int millilitres, Double strength) {
        super(name);
        this.maximumCanMillilitres = millilitres;
        this.millilitres = millilitres;
        this.liquidProperties = new LiquidProperties(strength);
    }

    public int getMaximumCanMillilitres() {
        return maximumCanMillilitres;
    }

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

    @Override
    public String toString() {
        return "A can of " + getName() + " (" + maximumCanMillilitres + "ml, " + liquidProperties.getAlcohol() + "%) - " + millilitres + "ml left";
    }

}
