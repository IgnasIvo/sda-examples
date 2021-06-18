package observer;

import java.util.ArrayList;
import java.util.List;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class CovidStatisticsDepartment {
    private int dailyPositiveCases = 0;
    private final List<InformationReceiver> receivers = new ArrayList<>();

    public void addReceiver(InformationReceiver receiver) {
        this.receivers.add(receiver);
    }

    public void removeReceiver(InformationReceiver receiver) {
        this.receivers.remove(receiver);
    }

    public void updateNumber(int newNumber) {
        dailyPositiveCases = newNumber;
        receivers.forEach(receiver -> receiver.update(dailyPositiveCases));
    }

}
