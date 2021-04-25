package builder;

import org.junit.jupiter.api.Test;

/***
 *
 * @author Ignas Ivoska
 *
 */
class BookTest {

    @Test
    void createsBooksWithBuilder() {
        Book crimeAndPunishment = new Book.Builder("Crime and Punishment", "Fyodor Dostoyevsky", "Philosophical novel")
                .withReleaseYear(1866)
                .build();
        Book theBrothersKaramazov = new Book.Builder("The Brothers Karamazov", "Fyodor Dostoyevsky", "Philosophical novel")
                .withReleaseYear(1879)
                .withSummary("Set in 19th-century Russia, The Brothers Karamazov is a passionate philosophical novel that enters deeply into questions of God, free will, and morality.")
                .build();
        System.out.println(crimeAndPunishment);
        System.out.println(theBrothersKaramazov);
    }
}