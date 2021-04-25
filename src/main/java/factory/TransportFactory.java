package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class TransportFactory implements AbstractFactory<Transport> {

    @Override
    public Transport create(String type) {
        switch (type.toUpperCase()) {
            case "TRAIN":
                return new SuperTrain();
            case "MOTORCYCLE":
                return new Motorcycle();
            case "OLD_TRAIN":
                return new Train();
            default:
                return null;
        }
    }

}
