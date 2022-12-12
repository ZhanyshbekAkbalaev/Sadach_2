package classes.service.impl;
import classes.Passport;
import classes.Person;
import classes.enums.Country;
import classes.enums.Gender;
import classes.service.PersonService;

import java.time.LocalDate;
import java.util.*;

public class PersonImpl implements PersonService{
    List<Passport> passports = new ArrayList<>();
    @Override
    public  List<Passport> getAllPasswort() {
        return passports;

    }
    @Override
    public String  getPasswortByFirstName() {
        System.out.println("Name jaz");
        String name = new Scanner(System.in).nextLine();
        for (Passport passport : this.passports) {
            if (passport.getFirstName().equals(name)){
                System.out.println(passport);
            }
        }
        return "Fist name туура жазыныз!";
    }
    @Override
    public List<Country> getAllCountry() {
        List<Country> roleList = Arrays.asList(Country.values());
        roleList.forEach(System.out::println);
        return roleList;
    }
    @Override
    public List<Passport> createPaswort() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Id beriniz");
        long id = scanner.nextLong();
        System.out.println("Last name beriniz");
        String last = scanner1.nextLine();
        System.out.println("First name beriniz");
        String first = scanner2.nextLine();
        System.out.println("Locan Date beriniz yyyy mm dd");
        int yyyy = scanner.nextInt();
        int mm = scanner.nextInt();
        int dd = scanner.nextInt();
        LocalDate.of(yyyy,mm,dd);
        System.out.println("Country beriniz");
        String country = new Scanner(System.in).nextLine();
        System.out.println("Genderin beriniz");
        String gender = new Scanner(System.in).nextLine();
        Passport passport = new Passport(id,last,first,LocalDate.of(yyyy,mm,dd),Country.valueOf(country.toUpperCase()), Gender.valueOf(gender.toUpperCase()));
        passports.add(passport);
        return passports;
    }
    }//0228886604
