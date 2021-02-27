package service.reservation;

import domain.Car;
import domain.Person;

import java.util.Date;

/***
 * Interface for our Reservation service
 * Let's say for our current functionality, the only action needed is to reserve a car in this service
 * @author Ignas Ivoska
 *
 */
public interface ReservationService {

    /**
     * Signature for reservation method
     * @param car car which we reserve
     * @param person person for which we reserve the car
     * @param from date from which reservation is valid
     * @param to date to which reservation is valid
     */
    void reserve(Car car, Person person, Date from, Date to);

}
