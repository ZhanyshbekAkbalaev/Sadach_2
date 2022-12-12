package classes.service;

import classes.Passport;
import classes.Person;
import classes.enums.Country;

import java.util.List;

public interface PersonService {
    List<Passport> getAllPasswort();
    String  getPasswortByFirstName();
    List<Country> getAllCountry();
   List <Passport> createPaswort();

}
