package service.reservation;

import dao.reservation.ReservationDao;
import domain.Car;
import domain.Person;
import domain.Reservation;
import exception.CarIsAlreadyReservedException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

/***
 * Tests for the default ReservationService implementation using Mockito
 * @author Ignas Ivoska
 *
 */
@ExtendWith(MockitoExtension.class)
class DefaultReservationServiceTest {

    private static final Date DATE = new Date(); // the date we will be using in the tests

    @Mock // <- Annotation that marks that this is a mock. It uses no actual implementation and only returns the result we tell it to
    private ReservationDao reservationDao;

    @Mock // <- Annotation that tells this is a mock. We will use this reservation in parameters of the class we test. Parameters along with other used classes can be mocked
    private Reservation reservation;
    @Mock // <- Annotation that tells this is a mock. We will use this reservation in parameters of the class we test. Parameters along with other used classes can be mocked
    private Car car;
    @Mock // <- Annotation that tells this is a mock. We will use this reservation in parameters of the class we test. Parameters along with other used classes can be mocked
    private Person person;

    @InjectMocks // <- It tells that for this field, the constructors parameters should be mocks when it is used in our tests
    private DefaultReservationService defaultReservationService;

    /**
     * First test for the implementation
     *
     * Makes sure that if there are reservations returned, an exception is thrown and nothing is saved.
     * If we take a look at the current implementation of the Dao we have, achieving this result is impossible, as there are never reservations returned
     * That does not matter. This class fits the requirement that were given to it, and should act accordingly. It does not care about what the DAO it uses does
     * It only cares that if the DAO provides a certain result, it will act accordingly.
     */
    @Test
    public void throwsExceptionIfCarIsAlreadyReserved() {
        given(reservationDao.findReservationsFor(car, DATE, DATE)).willReturn(singletonList(reservation)); // Mockito's given method tells our mock, that if we call this specific method with these specific parameters, this specific result SHOULD be returned

        assertThrows(CarIsAlreadyReservedException.class, () -> defaultReservationService.reserve(car, person, DATE, DATE)); // We make sure that the exception is thrown

        then(reservationDao).should(times(0)).saveAll(any()); // Mockitos then method can verify that something was called or was not called. In this case, we wanted saveAll method to not be called at all
        then(reservationDao).should(times(0)).save(any()); // Mockitos then method can verify that something was called or was not called. In this case, we wanted save method to not be called at all
        // any() is also a method from Mockito - it tells us that it does not matter with what arguments the method is called. In our case, nothing should be saved in this scenario
    }

    /**
     * Second test for the implementation
     *
     * Makes sure that if there are no reservations returned, it will save the newly created reservations via the saveAll method and does not save anything one by one.
     * This class fits the requirement that were given to it, and should act accordingly. It does not care about what the DAO it uses does
     * It only cares that if the DAO provides a certain result, it will act accordingly.
     */
    @Test
    public void savesReservationsIfCarIsNotReserved() {
        given(reservationDao.findReservationsFor(car, DATE, DATE)).willReturn(emptyList()); // Mockito's given method tells our mock, that if we call this specific method with these specific parameters, this specific result SHOULD be returned

        defaultReservationService.reserve(car, person, DATE, DATE); // We call the method we are testing

        then(reservationDao).should().saveAll(asList(new Reservation(car, person, DATE), new Reservation(car, person, DATE))); // We make sure that the saveAll method was called with our expected input. We do not care what happens inside, we only care that this class did what it was supposed to
        then(reservationDao).should(times(0)).save(any()); // We make sure that save method was not called. We do not want to save anything one-by-one in our implementation
    }

}