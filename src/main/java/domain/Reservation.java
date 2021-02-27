package domain;

import java.util.Date;
import java.util.Objects;

/***
 * Example class for our Reservation entity.
 * Hibernate or anything similar is not used, this is not a hibernate example :)
 * @author Ignas Ivoska
 *
 */
public class Reservation {
    private Integer id;
    private Integer carId;
    private Integer personId;
    private Date day;

    public Reservation() {}
    public Reservation(Car car, Person person, Date day) {
        this.carId = car.getId();
        this.personId = person.getId();
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(carId, that.getCarId()) &&
                Objects.equals(personId, that.getPersonId()) &&
                Objects.equals(day, that.getDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, personId, day);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
