package factory;/***
*
* @author Ignas Ivoska
*
*/
public class Sputnik implements Vaccine {

    @Override
    public String name() {
        return "Sputnik";
    }

    @Override
    public String disease() {
        return "COVID-19";
    }

    @Override
    public Double shotSuccessRate() {
        return 100d;
    }

    @Override
    public String toString() {
        return this.into();
    }

}
