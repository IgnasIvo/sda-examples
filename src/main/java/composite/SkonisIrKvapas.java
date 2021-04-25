package composite;

import java.util.Objects;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class SkonisIrKvapas implements Store {
    private final String name = "Skonis ir kvapas";

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkonisIrKvapas that = (SkonisIrKvapas) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
