package observer.fancier;

import org.junit.jupiter.api.Test;


/***
 *
 * @author Ignas Ivoska
 *
 */
class FancierCovidStatisticsDepartmentTest {

    @Test
    void receiversObserve() {
        InformationCounter counter = new InformationCounter();
        CovidStatisticsDepartment department = new CovidStatisticsDepartment();
        department.addPropertyChangeListener(counter);
        department.addPropertyChangeListener(new InformationReceiver("BNS"));
        department.setNewValue(500);
        department.addPropertyChangeListener(new InformationReceiver("SAM"));
        department.removePropertyChangeListener(counter);
        department.setNewValue(600);
        department.addPropertyChangeListener(new InformationReceiver("Mociute"));
        department.setNewValue(700);
    }

}