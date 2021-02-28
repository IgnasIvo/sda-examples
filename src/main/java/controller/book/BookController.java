package controller.book;

import controller.Controller;
import entity.Author;
import entity.Book;
import service.AuthorService;
import service.BookService;
import utilities.input.InputReceiver;
import utilities.output.OutputProducer;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/***
 *
 * Example of console controller that has functionality related to books
 * InputReceiver and OutputProducer are added for unit test purposes, they could be simply input/output
 * @author Ignas Ivoska
 *
 */
public class BookController implements Controller {

    private final BookService bookService;
    private final AuthorService authorService;
    private final InputReceiver receiver;
    private final OutputProducer output;

    /**
     * Constructor for the controller
     * Arguments are the classes that are required for this controller to function
     * @param bookService service related to book functionality
     * @param authorService service related to author functionality, since an author is needed in the logic
     *                      note that the service is used instead of repository - repositories should only be called
     *                      by the respective services
     * @param receiver Service that receives the input from the user
     * @param output Service that produces the output for the user
     */
    public BookController(BookService bookService,
                          AuthorService authorService,
                          InputReceiver receiver,
                          OutputProducer output) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.receiver = receiver;
        this.output = output;
    }

    /**
     * Entry point
     */
    @Override
    public void run() {
        output.produce("===== BOOK MANAGEMENT =====");
        printInstructions();
        receiveInputAndAct();
    }

    /**
     * Print available controls
     */
    private void printInstructions() {
        output.produce("L - List of books");
        output.produce("F - Find book");
        output.produce("C - Create new book");
        output.produce("B - Return");
    }

    /**
     * Receives input from the user and routes to the method of the specific functionality
     */
    private void receiveInputAndAct() {
        String input = receiver.receiveLine().toUpperCase();
        switch (input) {
            case "L": {
                listAllBooks();
                break;
            }
            case "F": {
                findBook();
                break;
            }
            case "C": {
                createNewBook();
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
     * Method to list all available books
     * Calls the service method and prints the result
     */
    private void listAllBooks() {
        output.produce("==== All authors ====");
        bookService.findAllBooks().forEach(book -> output.produce(book.toString()));
        output.produce("=====================");
    }

    /**
     * Method to find books by criteria
     * Calls the service method, returns the result
     */
    private void findBook() {
        output.produce("Enter to fragment to search by");
        List<Book> books = bookService.searchByNameFragment(receiver.receiveLine());
        output.produce("Found books:");
        books.forEach(book -> output.produce(book.toString()));
    }

    /**
     * Method to create a new book
     * Receives the input. For creating, an author is needed. That is why author service is needed here
     */
    private void createNewBook() {
        output.produce("Name of the book:");
        String firstName = receiver.receiveLine();
        output.produce("Authors (enter author numbers, separated by commas):");
        Set<Author> authors = getAuthorsFromInput();
        bookService.saveNewBook(firstName, authors);
        output.produce("New author saved successfully!");
    }

    /**
     * Finds all authors, reads input string and from the string resolves authors required
     * @return filtered authors
     */
    private Set<Author> getAuthorsFromInput() {
        List<Author> allAuthors = authorService.findAllAuthors();
        allAuthors.forEach(author -> output.produce(author.toString()));
        Map<Long, Author> authorMap = allAuthors.stream().collect(Collectors.toMap(Author::getId, author -> author));
        List<String> input = asList(receiver.receiveLine().split(","));
        return input.stream()
                .map(value -> getAuthorFromMap(value, authorMap))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());
    }

    /**
     * Method that takes an author by id from the map and prints warnings if author was not found
     * @param input user's input
     * @param authorMap map of all authors
     * @return specific author
     */
    private Optional<Author> getAuthorFromMap(String input, Map<Long, Author> authorMap) {
        Author author = null;
        try {
            long numericValue = Long.parseLong(input);
            author = authorMap.get(numericValue);
            if (author == null) {
                output.produce("Author could not be found by given id: " + numericValue);
            }
        } catch (NumberFormatException e) {
            output.produce("Could not get author " + input + " as it's not a valid id");
        }
        return Optional.ofNullable(author);
    }

}
