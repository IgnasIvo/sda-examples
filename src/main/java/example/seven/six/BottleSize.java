package example.seven.six;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    We can now create bottles of any size, but that is also an issue - usually bottles are of similar sizes and you wont see a 10ml bottle.
    Enumerations can be a great way to solve this
    Enumeration is a list of allowed values that can hold their own values.
    In this example, we will define a set of possible bottle sizes.
 */
public enum BottleSize {
    /* Name of our size */
    SMALL(500), /* The properties of our bottle size */
    MEDIUM(1000),
    LARGE(2000),
    HUGE(5000),
    WHY_WOULD_YOU_DEFINE_THIS(50000);
    /* You can think of these as constructors for our predefined sizes. Enums constructor cannot be called beyond this point - only our defined sizes will be available */

    private final int millilitres;

    /*
        An enum is also a class of sorts - to pass these properties, we need to define a constructor and logic to hold and give the bottle size in millilitres
     */
    BottleSize(int millilitres) {
        this.millilitres = millilitres;
    }

    public int getMillilitres() {
        return millilitres;
    }

}
