package facade;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class AutomaticTransferListReceiver {

    public List<AutomaticTransferData> getNeededTransfers() {
        return Arrays.asList(new AutomaticTransferData("LT000", "LT002", BigDecimal.TEN),
                new AutomaticTransferData("LT000", "LT005-USD", BigDecimal.ONE));
    }

}
