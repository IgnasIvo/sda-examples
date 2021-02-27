package domain;

import java.util.Objects;

/***
 * Example class used to map to and from JSON
 * Will be used inside of Person class
 * @author Ignas Ivoska
 *
 */
public class Note {
    private String title;
    private String description;

    public Note() {}
    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(title, note.title) &&
                Objects.equals(description, note.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
