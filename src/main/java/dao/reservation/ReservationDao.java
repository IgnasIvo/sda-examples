package dao.reservation;

import domain.Car;
import domain.Reservation;

import java.util.Date;
import java.util.List;

/***
 * Interface for our persistence layer for Reservations
 * @author Ignas Ivoska
 *
 */
public interface ReservationDao {

    /**
     * Saves a single reservation
     * @param reservation the reservation to save
     * @return saved reservation
     */
    Reservation save(Reservation reservation);

    /**
     * Saves a list of reservations
     * @param reservations the list to save
     * @return the saved list
     */
    List<Reservation> saveAll(List<Reservation> reservations);

    /**
     * Finds current reservations
     * @param car the car that we are looking for
     * @param from the date from which we are looking for
     * @param to the date to which we are looking for
     * @return a list of current reservations
     */
    List<Reservation> findReservationsFor(Car car, Date from, Date to);

}
