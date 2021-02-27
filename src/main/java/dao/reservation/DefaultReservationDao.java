package dao.reservation;

import dao.EntityManager;
import domain.Car;
import domain.Reservation;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/***
 * The default implementation of our Reservation persistence layer
 * @author Ignas Ivoska
 *
 */
public class DefaultReservationDao implements ReservationDao {

    private final EntityManager entityManager;

    /**
     * Constructor for this service with parameters that are needed in order for it to work as intended
     * Needs an implementation of our fake entity manager. Again, does not care what the implementation is because
     * we are using an interface
     * @param entityManager
     */
    public DefaultReservationDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Implementation of the save method
     * In our implementation, it sets the id and calls the fake entity manager to persist
     * @param reservation the reservation to save
     * @return saved reservation
     */
    @Override
    public Reservation save(Reservation reservation) {
        reservation.setId(1);
        entityManager.persist(reservation);
        return reservation;
    }

    /**
     * Implementation of the save all method
     * In our implementation, it sets all ids and calls the fake entity manager to persist
     * @param reservations the list to save
     * @return saved list
     */
    @Override
    public List<Reservation> saveAll(List<Reservation> reservations) {
        reservations.forEach(reservation -> reservation.setId(1));
        entityManager.persist(reservations);
        return reservations;
    }

    /**
     * Our implementation to find all the reservations
     * Calls the find method in the fake entity manager
     * Now always returns an empty list
     * @param car the car that we are looking for
     * @param from the date from which we are looking for
     * @param to the date to which we are looking for
     * @return empty list :)
     */
    @Override
    public List<Reservation> findReservationsFor(Car car, Date from, Date to) {
        entityManager.find();
        return Collections.emptyList();
    }
}
