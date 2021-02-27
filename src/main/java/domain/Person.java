package domain;

import java.util.Objects;

/***
 * Example class for our Person entity.
 * Hibernate or anything similar is not used, this is not a hibernate example :)
 * @author Ignas Ivoska
 *
 */
public class Person {
    private Integer id;

    public Person() {}
    public Person(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.getId());
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
