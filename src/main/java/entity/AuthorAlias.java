package entity;

import javax.persistence.*;

/***
 * Authors known aliases
 * Has the alias and an author
 * Author is a many-to-one relationship (reversal of Author's relationship, which is one-to-many)
 * @author Ignas Ivoska
 *
 */
@Entity
public class AuthorAlias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="author_id", nullable=false)
    private Author author;

    private String alias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
