package observer.fancier;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class CovidStatisticsDepartment {
    private int numberOfCases;

    private final PropertyChangeSupport support;

    public CovidStatisticsDepartment() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setNewValue(int value) {
        support.firePropertyChange("numberOfCases", this.numberOfCases, value);
        this.numberOfCases = value;
    }
}
