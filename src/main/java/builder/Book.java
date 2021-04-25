package builder;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Book {

    private final String name;
    private final String author;
    private final String genre;
    private Integer releaseYear;
    private String summary;
    private String color;
    private String blablabla;


    private Book(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public static class Builder {
        private final Book book;

        public Builder(String name, String author, String genre) {
            this.book = new Book(name, author, genre);
        }

        public Builder withReleaseYear(Integer releaseYear) {
            book.releaseYear = releaseYear;
            return this;
        }

        public Builder withSummary(String summary) {
            book.summary = summary;
            return this;
        }

        public Book build() {
            return book;
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", summary='" + summary + '\'' +
                '}';
    }

}
