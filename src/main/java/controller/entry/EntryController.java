package controller.entry;

import controller.Controller;
import utilities.input.InputReceiver;
import utilities.output.OutputProducer;


/***
 *
 * Example of base controller that routes to functionality controllers
 * InputReceiver and OutputProducer are added for unit test purposes, they could be simply input/output
 * @author Ignas Ivoska
 *
 */
public class EntryController implements Controller {

    private final Controller authorController;
    private final Controller bookController;
    private final InputReceiver receiver;
    private final OutputProducer output;

    /**
     * Constructor for the controller
     * Arguments are the classes that are required for this controller to function
     * @param authorController controller that routes to author functionality
     * @param bookController controller that routes to book functionality
     * @param receiver Service that receives the input from the user
     * @param output Service that produces the output for the user
     */
    public EntryController(Controller authorController,
                           Controller bookController,
                           InputReceiver receiver,
                           OutputProducer output) {
        this.authorController = authorController;
        this.bookController = bookController;
        this.receiver = receiver;
        this.output = output;
    }

    /**
     * Entry point
     */
    @Override
    public void run() {
        output.produce("===== Welcome! =====");
        printInstructions();
        receiveInputAndAct();
    }

    /**
     * Print available controls
     */
    private void printInstructions() {
        output.produce("A - Author management");
        output.produce("B - Book management");
        output.produce("X - Exit");
    }

    /**
     * Receives input from the user and routes to the method of the specific functionality
     */
    private void receiveInputAndAct() {
        String input = receiver.receiveLine().toUpperCase();
        switch (input) {
            case "A": {
                authorController.run();
                break;
            }
            case "B": {
                bookController.run();
                break;
            }
            case "X": {
                return;
            }
            default: {
                output.produce("Action unrecognised.");
                printInstructions();
            }
        }
        receiveInputAndAct();
    }

}
