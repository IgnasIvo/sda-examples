package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/***
 * Author entity
 * Has first name, last name, list of the authors books, biography and known aliases
 * Books is a many-to-many relationship
 * Biography is a one-to-one relationship
 * Known aliases are a one-to-many relationship
 * @author Ignas Ivoska
 *
 */
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY )
    @JoinTable(
            name = "author_book",
            joinColumns = { @JoinColumn(name = "author_id") },
            inverseJoinColumns = { @JoinColumn(name = "book_id") }
    )
    private Set<Book> books = new HashSet<>();

    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AuthorBiography biography;

    @OneToMany(mappedBy="author")
    private Set<AuthorAlias> knownAliases;

    public Author() {}
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AuthorBiography getBiography() {
        return biography;
    }

    public void setBiography(AuthorBiography biography) {
        this.biography = biography;
    }

    public Set<AuthorAlias> getKnownAliases() {
        return knownAliases;
    }

    public void setKnownAliases(Set<AuthorAlias> knownAliases) {
        this.knownAliases = knownAliases;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return id + ": " + firstName + " " + lastName;
    }
}
