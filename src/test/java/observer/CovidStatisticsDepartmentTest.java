package observer;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class CovidStatisticsDepartmentTest {

    @Test
    void receiversObserve() {
        CovidStatisticsDepartment department = new CovidStatisticsDepartment();
        department.addReceiver(new InformationReceiver("BNS"));
        department.updateNumber(500);
        department.addReceiver(new InformationReceiver("SAM"));
        department.updateNumber(600);
        department.addReceiver(new InformationReceiver("Mociute"));
        department.updateNumber(700);
    }

}