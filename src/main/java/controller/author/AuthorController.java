package controller.author;

import controller.Controller;
import entity.Author;
import service.AuthorService;
import utilities.input.InputReceiver;
import utilities.output.OutputProducer;

import java.util.List;

/***
 *
 * Example of console controller that has functionality related to authors
 * InputReceiver and OutputProducer are added for unit test purposes, they could be simply input/output
 * @author Ignas Ivoska
 *
 */
public class AuthorController implements Controller {

    private final AuthorService authorService;
    private final InputReceiver receiver;
    private final OutputProducer output;

    /**
     * Constructor for the controller
     * Arguments are the classes that are required for this controller to function
     * @param authorService Service for author related logic
     * @param receiver Service that receives the input from the user
     * @param output Service that produces the output for the user
     */
    public AuthorController(AuthorService authorService,
                            InputReceiver receiver,
                            OutputProducer output) {
        this.authorService = authorService;
        this.receiver = receiver;
        this.output = output;
    }

    /**
     * Entry point
     */
    @Override
    public void run() {
        output.produce("===== AUTHOR MANAGEMENT =====");
        printInstructions();
        receiveInputAndAct();
    }

    /**
     * Print available controls
     */
    private void printInstructions() {
        output.produce("L - List of authors");
        output.produce("F - Find author");
        output.produce("C - Create new author");
        output.produce("B - Return");
    }

    /**
     * Receives input from the user and routes to the method of the specific functionality
     */
    private void receiveInputAndAct() {
        String input = receiver.receiveLine().toUpperCase();
        switch (input) {
            case "L": {
                listAllAuthors();
                break;
            }
            case "F": {
                findAuthor();
                break;
            }
            case "C": {
                createNewAuthor();
                break;
            }
            case "B": {
                return;
            }
            default: {
                output.produce("Action unrecognised.");
                printInstructions();
            }
        }
        receiveInputAndAct();
    }

    /**
     * Method to create a new author
     * Receives input for needed data, calls service to save it
     */
    private void createNewAuthor() {
        output.produce("First name of the new author:");
        String firstName = receiver.receiveLine();
        output.produce("Last name of the new author:");
        String lastName = receiver.receiveLine();
        authorService.saveNewAuthor(firstName, lastName);
        output.produce("New author saved successfully!");
    }

    /**
     * Method to find an author
     * Receives needed input, calls service to find the authors
     * Then prints the result
     */
    private void findAuthor() {
        output.produce("Enter to fragment to search by");
        List<Author> authors = authorService.findAuthorsByNameFragment(receiver.receiveLine());
        output.produce("Found authors:");
        authors.forEach(author -> output.produce(author.toString()));
    }

    /**
     * Method for listing all authors
     * Calls service to get all authors, then prints the result
     */
    private void listAllAuthors() {
        output.produce("==== All authors ====");
        authorService.findAllAuthors().forEach(author -> output.produce(author.toString()));
        output.produce("=====================");
    }


}
