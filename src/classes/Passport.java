package classes;

import classes.enums.Country;
import classes.enums.Gender;

import java.time.LocalDate;
import java.util.Locale;

public class Passport {
    private long id;
    private String lastName;
    private String firstName;
    private LocalDate localDate;
    private Country country;
    private Gender gender;

    public Passport() {
    }

    public Passport(long id, String lastName, String firstName, LocalDate localDate, Country country, Gender gender) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.localDate = localDate;
        this.country = country;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~Passport~~~~~~~~~~~~~" +
                "\nid: " + id +
                "\nlast Name: " + lastName +
                "\nfirst Name: " + firstName +
                "\nlocal Date: " + localDate +
                "\ncountry: " + country +
                "\ngender: " + gender +
                "\n***************************************\n";
    }
}
