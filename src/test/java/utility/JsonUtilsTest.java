package utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import domain.Note;
import domain.Person;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class JsonUtilsTest {

    /*
        Person object representation in JSON format:
        {"firstName":"Ignas", <- String field, field name is <firstName>, the value is <Ignas>, { marks beginning of object
         "lastName":"Ivoska", <- String field, field name is <lastName>, the value is <Ivoska>
         "dateOfBirth":839710800000, <- Number field, representing milliseconds for the date object. Could also be formatted as a date string, but additional config is required
         "notes":[ <- Array field. Name is <notes>, value is an array of objects
                   {"title":"Something", <- new object inside (represented by {} marking, first field is <title> and value is <something>
                   "description":"This is something"} <- second field for new object, name is <description>, value is <This is something>. } marks end of object
                 ], <- end of the <notes> array
         "yearsOfExperience":4, <- number field, name is <yearsOfExperience>, value is <4>
         "employed":true} <- boolean field, name is <employeed>, value is <true>
     */
    private static final String JSON_REPRESENTATION_OF_PERSON = "{\"firstName\":\"Ignas\"," +
            "\"lastName\":\"Ivoska\"," +
            "\"dateOfBirth\":839710800000," +
            "\"notes\":[{\"title\":\"Something\"," +
                        "\"description\":\"This is something\"}]," +
            "\"yearsOfExperience\":4," +
            "\"employed\":true}";

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd"); // date format
    private static final String ISO_DATE = "1996-08-11"; // date field in string format
    private static final String NAME = "Ignas";
    private static final String SURNAME = "Ivoska";
    private static final String TITLE = "Something";
    private static final String DESCRIPTION = "This is something";
    private static final int YEARS_OF_EXPERIENCE = 4;
    private static final boolean IS_EMPLOYED = true;

    /**
     * First example test.
     * Checks that the object created in Java (via examplePerson()) is equal to the JSON representation given above.
     * @throws JsonProcessingException when parsing object to JSON representation fails
     */
    @Test
    public void parsesObjectToJson() throws JsonProcessingException {
        String parsedJson = JsonUtils.toJson(examplePerson());
        System.out.println(parsedJson);
        assertEquals(JSON_REPRESENTATION_OF_PERSON, parsedJson);
    }

    /**
     * Second example test.
     * Checks that the JSON representation is converted to the object that is equal to a new examplePerson() object instance
     * They should be equal as the values in the JSON representation are identical to the ones in examplePerson()
     * @throws JsonProcessingException when parson JSON to object fails
     */
    @Test
    public void parsesJsonToObject() throws JsonProcessingException {
        Person personFromJson = JsonUtils.fromJson(JSON_REPRESENTATION_OF_PERSON, Person.class);
        assertEquals(examplePerson(), personFromJson);
    }

    /**
     * Creating a new instance of Person with given values for our needs
     * @return
     */
    private Person examplePerson() {
        return new Person(NAME, SURNAME, dateOfBirth(), singletonList(new Note(TITLE, DESCRIPTION)), YEARS_OF_EXPERIENCE, IS_EMPLOYED);
    }

    /**
     * Parsing the YYYY-MM-DD string to Date object
     * catches the parsing error and throws a new exception as RuntimeException
     * The reason is simplicity of code above. We dont need to try/catch or add throws signatures in upper methods, yet will still fail
     * if the input in ISO_DATE does not match our format of DATE_FORMAT
     * @return
     */
    private Date dateOfBirth() {
        try {
            return DATE_FORMAT.parse(JsonUtilsTest.ISO_DATE);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
