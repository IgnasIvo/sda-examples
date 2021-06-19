package example.two;

import example.one.Food;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    Our first beer had a problem - it's a beer that cannot be drank.
    We want to drink our can of beer. We know that is beer, we want bear, we will get beer.
    This is where inheritance comes into play - we can create more specific classes of objects, which are children (a variation) of our generic class

    Let's extend our Food to be able to distinguish our Beer from other Food and give it specific properties
    This class has multiple quite obvious logical flaws, try to name them, but ignore them for now - it gets better
 */
public class BeerCan /* The name of our class in CamelCase */ extends /* This keyword tells us that our class is a child class */ Food /* This is the name of the parent class */ {

    /*
        Let's define another field, which will help us interact with our beer
        We need to empty the can. On getting our beer, our beer can should be full (unless you are buying beer from some place that you really should not)
        We create a boolean that says that our can, on it's purchase (instantiation) is full.
     */
    private boolean isFull = true;

    /*
        Our constructor. If we provide the name only by default, we will have a full can of beer
     */
    public BeerCan(String name) {
        super(name);
    }

    /*
        Our secondary constructor. Let's say for some reason, we may want to buy an empty beer can. This allows us to state, that this beer can is empty on its purchase.
     */
    public BeerCan(String name, boolean isFull) {
        super(name); // <- super method calls the constructor of the parent class. In our case, new Food(String name);
        this.isFull = isFull;
    }

    /*
        We give a way to check our beer can's contents though our own specified way.
     */
    public boolean isFull() {
        return isFull;
    }

    /*
        We give a way to drink the contents through our own specified way.
     */
    public void drink() {
        isFull = false;
    }

}
