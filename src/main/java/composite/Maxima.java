package composite;

import java.util.Objects;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Maxima implements Store {
    private final String name = "Maxima";

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maxima maxima = (Maxima) o;
        return Objects.equals(name, maxima.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
