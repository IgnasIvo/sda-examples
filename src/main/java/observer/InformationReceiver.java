package observer;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class InformationReceiver {
    int cases = 0;
    final String receiverName;

    public InformationReceiver(String receiverName) {
        this.receiverName = receiverName;
    }

    public void update(int positiveCases) {
        this.cases = positiveCases;
        System.out.println(receiverName + ": We currently have " + cases + " positive cases reported for the day");
    }

}
