package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Akropolis implements Store {
    private final String name = "Akropolis";
    private List<Store> stores;

    public Akropolis() {
        stores = new ArrayList<>();
    }

    @Override
    public void printName() {
        stores.forEach(Store::printName);
    }

    public void addStore(Store store) {
        this.stores.add(store);
    }

    public void removeStore(Store store) {
        this.stores.remove(store);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Akropolis akropolis = (Akropolis) o;
        return Objects.equals(name, akropolis.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
