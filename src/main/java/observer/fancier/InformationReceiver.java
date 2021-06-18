package observer.fancier;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class InformationReceiver implements PropertyChangeListener {

    private int newNumberOfCases = 0;
    private final String name;

    public InformationReceiver(String name) {
        this.name = name;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        this.newNumberOfCases = (int) evt.getNewValue();
        System.out.println(name + ": " + newNumberOfCases + " reported positive today");
    }

}
