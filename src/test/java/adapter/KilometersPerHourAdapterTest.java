package adapter;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class KilometersPerHourAdapterTest {

    @Test
    void adapts() {
        Movable movable = new PontiacFirebird();
        MovableAdapter adaptedPontiac = new KilometersPerHourAdapter(movable);
        System.out.println("Pontiac Firebird max speed (MPH): " + movable.getMaxSpeed());
        System.out.println("Pontiac Firebird max speed (KMH): " + adaptedPontiac.getMaxSpeed());
    }

}