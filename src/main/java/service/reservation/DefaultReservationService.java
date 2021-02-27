package service.reservation;

import dao.reservation.ReservationDao;
import domain.Car;
import domain.Person;
import domain.Reservation;
import exception.CarIsAlreadyReservedException;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/***
 * The default implementation of our ReservationService
 * @author Ignas Ivoska
 *
 */
public class DefaultReservationService implements ReservationService {

    private final ReservationDao reservationDao;

    /**
     * Constructor with what is required for our service to work
     * @param reservationDao our persistence layer, implementation of the layer is also hidden under an interface
     *                       this gives us the freedom to use a different implementation in this service during it's construction, e.g. if we have
     *                       DefaultReservationDao which saves to database,
     *                       ToFileReservationDao which would save the data to files in the local machine
     *                       This makes our service not care about the implementation of where and how data is saved - it only controls the logic of
     *                       when to save/search for something.
     */
    public DefaultReservationService(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }

    /**
     * Implementation of the reserve method
     * Checks if the car is already reserved or not. If it is - throws an exception, if not, saves a list of reservations
     * (Lets pretend that in this business case, it was ordered that a new record is saved for each day that the reservation is done)
     * @param car car which we reserve
     * @param person person for which we reserve the car
     * @param from date from which reservation is valid
     * @param to date to which reservation is valid
     */
    @Override
    public void reserve(Car car, Person person, Date from, Date to) {
        if (carReservedInThisPeriod(car, from, to)) {
            throw new CarIsAlreadyReservedException();
        }

        reservationDao.saveAll(createReservationsFor(car, person, from, to));
    }

    /**
     * Checks if our data contains records for this car's reservation during this period
     * Again, it does not care how the data layer finds this, it only cares about the result
     * @param car The car we are looking for
     * @param from Date from which we are looking for
     * @param to Date to which we are looking for
     * @return whether there are currently reservations in this time period
     */
    private boolean carReservedInThisPeriod(Car car, Date from, Date to) {
        return !reservationDao.findReservationsFor(car, from, to).isEmpty();
    }

    /**
     * Creates a list of records that are needed to be saved
     * Lack of time, so this method is incomplete - instead of going through all of the dates, it creates two records - one from, one to date
     * @param car The car we are reserving
     * @param person The person that's reserving the car
     * @param from Date from which car is being reserved
     * @param to Date to which the car is being reserved
     * @return a list of Reservation objects to save
     */
    private List<Reservation> createReservationsFor(Car car, Person person, Date from, Date to) {
        return Arrays.asList(new Reservation(car, person, from), new Reservation(car, person, to));
    }

}
