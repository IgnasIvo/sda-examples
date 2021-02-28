package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/***
 * Book entity
 * Has name and a set of authors that wrote it
 * Authors are a many-to-many relationship. Generally, reverse of author's relationship, but reverse of many-to-many is
 * also many-to-many
 * @author Ignas Ivoska
 *
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "books", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Author> authors = new HashSet<>();

    public Book() {
    }
    public Book(String name, Set<Author> authors) {
        this.name = name;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return authorNames() + ": " + name;
    }

    private String authorNames() {
        return authors.stream()
                .map(author -> author.getFirstName() + " " + author.getLastName())
                .collect(Collectors.joining(", "));
    }
}
