package composite;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class AkropolisTest {

    @Test
    void fillsTheStore() {
        Maxima maxima = new Maxima();
        SkonisIrKvapas skonisIrKvapas = new SkonisIrKvapas();

        Akropolis akropolis = new Akropolis();

        akropolis.addStore(maxima);
        akropolis.addStore(skonisIrKvapas);

        akropolis.printName();
    }

}