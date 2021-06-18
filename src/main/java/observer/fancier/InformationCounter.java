package observer.fancier;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class InformationCounter implements PropertyChangeListener {

    private int timesUpdatedToday = 0;

    public void propertyChange(PropertyChangeEvent evt) {
        timesUpdatedToday++;
        System.out.println("Times updated today:" + timesUpdatedToday);
    }
}
