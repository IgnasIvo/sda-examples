package adapter;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class KilometersPerHourAdapter implements MovableAdapter {
    private final Movable movableItem;

    KilometersPerHourAdapter(Movable movableItem) {
        this.movableItem = movableItem;
    }

    @Override
    public double getMaxSpeed() {
        return movableItem.getMaxSpeed() * 1.6 ;
    }

}
