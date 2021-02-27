package exception;

/***
 * A certain business rule wrapped into an exception
 * Makes the code more readable and tidy if specific cases are wrapped under specific exceptions.
 * Extends RuntimeException - we do not need to add "throws" signatures.
 * @author Ignas Ivoska
 *
 */
public class CarIsAlreadyReservedException extends RuntimeException {

    public CarIsAlreadyReservedException() {
        super("This car is already reserved during this time period");
    }

}
