package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class VaccineFactory implements AbstractFactory<Vaccine> {

    @Override
    public Vaccine create(String type) {
        switch (type.toUpperCase()) {
            case "SPUTNIK":
                return new Sputnik();
            case "KOSTJAS":
                return new KostjasHomemadeBrew();
            default:
                return null;
        }
    }

}
