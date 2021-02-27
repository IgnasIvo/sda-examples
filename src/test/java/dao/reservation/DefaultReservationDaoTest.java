package dao.reservation;

import dao.EntityManager;
import domain.Car;
import domain.Reservation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.then;

/***
 *
 * Tests for the default ReservationDao implementation using Mockito
 * @author Ignas Ivoska
 */
@ExtendWith(MockitoExtension.class) // <- Annotation added so that JUnit knows to use mockito for this class
public class DefaultReservationDaoTest {

    @Mock // <- Annotation that marks that this is a mock. It uses no actual implementation and only returns the result we tell it to
    private EntityManager entityManager;

    @Mock // <- Annotation that tells this is a mock. We will use this reservation in parameters of the class we test. Parameters along with other used classes can be mocked
    private Reservation reservation;

    @InjectMocks // <- It tells that for this field, the constructors parameters should be mocks when it is used in our tests
    private DefaultReservationDao defaultReservationDao;

    /**
     * First test for the implementation
     * Makes sure that if the save method is called, that the fake entity manager will call the persist method to save the data
     * It does not care how it does it or what it does, it only needs to know that it was done.
     */
    @Test
    public void savesReservation() {
        defaultReservationDao.save(reservation); // <- we call the method we are testing

        then(entityManager).should().persist(reservation); // <- Mockito's then method makes sure that when we called the method above, entityManager.persist() was called
    }

    /**
     * Second test for the implementation
     * Makes sure that if the saveAll method is called, that the fake entity manager will call the persist method to save the data
     * It does not care how it does it or what it does, it only needs to know that it was done.
     */
    @Test
    public void savesReservationList() {
        defaultReservationDao.saveAll(singletonList(reservation)); // <- we call the method we are testing

        then(entityManager).should().persist(singletonList(reservation)); // <- Mockito's then method makes sure that when we called the method above, entityManager.persist() was called
    }

    /**
     * Third test for the implementation
     * Makes sure that if the find method is called, that the fake entity manager will call the find method to find the data needed
     * It does not care how it does it or what it does, it only needs to know that it was done.
     * In another implementation it might be needed to check that the result is equal to what was found, but in our implementation, it does not return the found value
     * it instead returns an empty list.
     */
    @Test
    public void searchesForReservations() {
        defaultReservationDao.findReservationsFor(new Car(), new Date(), new Date()); // <- we call the method we are testing

        then(entityManager).should().find(); // <- Mockito's then method makes sure that when we called the method above, entityManager.find() was called
    }

}