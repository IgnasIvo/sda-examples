package decorator;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class ShirtTest {

    @Test
    void decoratesShirts() {
        Clothing shirt = new Shirt();
        System.out.println(shirt.decorate());
        shirt = new Stripes(shirt);
        System.out.println(shirt.decorate());
        shirt = new CrappyLogo(shirt);
        System.out.println(shirt.decorate());
    }

}