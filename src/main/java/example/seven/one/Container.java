package example.seven.one;

/***
 *
 * @author Ignas Ivoska
 *
 */
/*

    Let's create a container that can hold something.
    Technically, it's not only food we can hold, so let's abstract all the way from the beginning.

    Generics allow us to work with objects ignoring their specifics - we will know what to do with the objects, but now what they are and how we can interact with them directly.

    For example, let's say we have a box. We know how to put stuff in it - you take the item, and place it in the box.
    It does not matter if that item is gray, brown, is it an apple, orange or a banana - we pick it up and put it in the same way.

 */
public interface Container<T> /* <T> mark means that this is a generic interface - it's implementations can work with any objects (of the same type). */ {

    T get(); // an abstract method - we know how to take a "thing" out of our container - doesn't matter what that "thing" is, as long as it's the thing this container is for

}
