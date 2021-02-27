package domain;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/***
 *
 * Example class that will be used to map to and from JSON
 * @author Ignas Ivoska
 *
 */
public class Person {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private List<Note> notes;
    private Integer yearsOfExperience;
    private Boolean isEmployed;

    public Person() {}
    public Person(String firstName, String lastName, Date dateOfBirth, List<Note> notes, Integer yearsOfExperience, Boolean isEmployed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.notes = notes;
        this.yearsOfExperience = yearsOfExperience;
        this.isEmployed = isEmployed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                dateOfBirth.equals(person.dateOfBirth) &&
                notes.equals(person.notes) &&
                yearsOfExperience.equals(person.yearsOfExperience) &&
                isEmployed.equals(person.isEmployed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, notes, yearsOfExperience, isEmployed);
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }
}
