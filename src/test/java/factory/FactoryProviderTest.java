package factory;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class FactoryProviderTest {

    @Test
    void getsFromFactories() {
        System.out.println(FactoryProvider.getFactory("Transport").create("Train"));
        System.out.println(FactoryProvider.getFactory("Transport").create("Motorcycle"));
        System.out.println(FactoryProvider.getFactory("Vaccine").create("Sputnik"));
        System.out.println(FactoryProvider.getFactory("Vaccine").create("Kostjas"));
        System.out.println(FactoryProvider.getFactory("Vaccine").create("Pfizer"));
    }

}