package domain;

import java.util.Objects;

/***
 * Example class for our Car entity.
 * Hibernate or anything similar is not used, this is not a hibernate example :)
 * @author Ignas Ivoska
 *
 */
public class Car {
    private Integer id;

    public Car() {}
    public Car(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
