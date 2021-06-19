package example.six.one;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*
    Let's use the interface mechanism in java to define our very base level - a thing that can be consumed.
    An interface is not a class - it does not define how our objects will behave in specific - it instead gives us a contract - things that our object will be able to do, but now how.
 */
public interface Consumable {

    // our consumable objects will have to implement the consume method
    void consume();

}
