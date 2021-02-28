package controller.author;

import entity.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import service.AuthorService;
import utilities.input.InputReceiver;
import utilities.output.OutputProducer;

import static java.util.Arrays.asList;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

/***
 * Example of tests for the controller using mockito
 * We can test that the controller acts as expected on certain inputs.
 * @author Ignas Ivoska
 *
 */
@ExtendWith(MockitoExtension.class)
class AuthorControllerTest {

    @Mock
    private AuthorService authorService;
    @Mock
    private InputReceiver receiver;
    @Mock
    private OutputProducer output;

    @Mock
    private Author authorOne;
    @Mock
    private Author authorTwo;

    @InjectMocks
    private AuthorController authorController;

    @Test
    public void exits() {
        given(receiver.receiveLine()).willReturn("B");

        authorController.run();

        then(output).should().produce("===== AUTHOR MANAGEMENT =====");
        then(output).should().produce("L - List of authors");
        then(output).should().produce("F - Find author");
        then(output).should().produce("C - Create new author");
        then(output).should().produce("B - Return");
        then(receiver).should().receiveLine();
        then(authorService).shouldHaveNoInteractions();
    }

    @Test
    public void triesToPrintAllAuthorsAndExits() {
        given(receiver.receiveLine()).willReturn("L", "B");
        given(authorService.findAllAuthors()).willReturn(asList(authorOne, authorTwo));
        given(authorOne.toString()).willReturn("1: Pirmas Autorius");
        given(authorTwo.toString()).willReturn("2: Antras Autorius");

        authorController.run();

        then(output).should().produce("===== AUTHOR MANAGEMENT =====");
        then(output).should().produce("L - List of authors");
        then(output).should().produce("F - Find author");
        then(output).should().produce("C - Create new author");
        then(output).should().produce("B - Return");
        then(receiver).should(times(2)).receiveLine();
        then(output).should().produce("==== All authors ====");
        then(authorService).should().findAllAuthors();
        then(output).should().produce("1: Pirmas Autorius");
        then(output).should().produce("2: Antras Autorius");
        then(output).should().produce("=====================");
    }

    @Test
    public void triesToFindAuthorByFragmentAndExits() {
        given(receiver.receiveLine()).willReturn("F", "Autor", "B");
        given(authorService.findAuthorsByNameFragment("Autor")).willReturn(asList(authorOne, authorTwo));
        given(authorOne.toString()).willReturn("1: Pirmas Autorius");
        given(authorTwo.toString()).willReturn("2: Antras Autorius");

        authorController.run();

        then(output).should().produce("===== AUTHOR MANAGEMENT =====");
        then(output).should().produce("L - List of authors");
        then(output).should().produce("F - Find author");
        then(output).should().produce("C - Create new author");
        then(output).should().produce("B - Return");
        then(receiver).should(times(3)).receiveLine();
        then(output).should().produce("Enter to fragment to search by");
        then(authorService).should().findAuthorsByNameFragment("Autor");
        then(output).should().produce("Found authors:");
        then(output).should().produce("1: Pirmas Autorius");
        then(output).should().produce("2: Antras Autorius");
    }

    @Test
    public void triesToSaveAuthorAndExits() {
        given(receiver.receiveLine()).willReturn("C", "Pirmas", "Autorius", "B");

        authorController.run();

        then(output).should().produce("===== AUTHOR MANAGEMENT =====");
        then(output).should().produce("L - List of authors");
        then(output).should().produce("F - Find author");
        then(output).should().produce("C - Create new author");
        then(output).should().produce("B - Return");
        then(receiver).should(times(4)).receiveLine();
        then(output).should().produce("First name of the new author:");
        then(output).should().produce("Last name of the new author:");
        then(authorService).should().saveNewAuthor("Pirmas", "Autorius");
        then(output).should().produce("New author saved successfully!");
    }

    @Test
    public void asksForAnotherInputWhenFirstOneIsUnclear() {
        given(receiver.receiveLine()).willReturn(".",  "B");

        authorController.run();

        then(output).should().produce("===== AUTHOR MANAGEMENT =====");
        then(output).should(times(2)).produce("L - List of authors");
        then(output).should(times(2)).produce("F - Find author");
        then(output).should(times(2)).produce("C - Create new author");
        then(output).should(times(2)).produce("B - Return");
        then(receiver).should(times(2)).receiveLine();
        then(output).should().produce("Action unrecognised.");
    }
}