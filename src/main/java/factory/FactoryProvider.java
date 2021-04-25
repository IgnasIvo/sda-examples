package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        switch (choice.toUpperCase()) {
            case "TRANSPORT":
                return new TransportFactory();
            case "VACCINE":
                return new VaccineFactory();
            default:
                return null;
        }
    }

}
