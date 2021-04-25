package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class KostjasHomemadeBrew implements Vaccine {

    @Override
    public String name() {
        return "Kostja's homemade brew";
    }

    @Override
    public String disease() {
        return "Any disease";
    }

    @Override
    public Double shotSuccessRate() {
        return 0d;
    }

    @Override
    public String toString() {
        return this.into();
    }

}
