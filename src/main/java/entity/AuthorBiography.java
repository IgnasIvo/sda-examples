package entity;

import javax.persistence.*;
import java.time.LocalDate;

/***
 * Author's biogrpahy
 * Has birth place, date of birth and author
 * Author is a one-to-one relationship. (Generally also reverse of authors relationship, but it is also one-to-one, so
 * reverse is also one-to-one)
 * @author Ignas Ivoska
 *
 */
@Entity
public class AuthorBiography {

    @Id
    @Column(name = "author_id")
    private Long id;
    private String birthPlace;
    private LocalDate dateOfBirth;
    @OneToOne
    @MapsId
    @JoinColumn(name = "author_id")
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
