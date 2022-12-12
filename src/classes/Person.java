package classes;

import classes.enums.Country;
import classes.enums.Gender;

import java.time.LocalDate;

public class Person extends Passport {
    public Person() {
    }

    public Person(long id, String lastName, String firstName, LocalDate localDate, Country country, Gender gender) {
        super(id, lastName, firstName, localDate, country, gender);
    }
}
