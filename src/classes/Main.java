package classes;

import classes.enums.Status;
import classes.service.impl.PersonImpl;
import classes.service.impl.WhatsappImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("""
                    1-> Get all passwort
                    2-> Get passwort by first name
                    3-> Get all whatsapp
                    4-> Go to your profile
                    5-> Get all country
                    6-> Get whatsapp status
                    7-> Create a passwort
                    8-> Install whatsapp
                    9-> Change status
                    10-> Add contact
                    11-> Send a massage
                    """);
            PersonImpl person = new PersonImpl();
            WhatsappImpl whatsapp = new WhatsappImpl();
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println(person.getAllPasswort());
                    break;
                case 2:
                    System.out.println(person.getPasswortByFirstName());
                    break;
                case 3:
                    System.out.println(whatsapp.getAllWhatsapp());
                    break;
                case 4:
                    System.out.println(whatsapp.goToYourProfile());
                    break;
                case 5:
                    System.out.println(person.getAllCountry());
                    break;
                case 6:
                    System.out.println(whatsapp.getWhatsappStatus());
                    break;
                case 7:
                    System.out.println(person.createPaswort());
                    break;
                case  8:
                    System.out.println(whatsapp.intstallWhatsapp());
                    break;
                case 9:
                    System.out.println(whatsapp.changeStatus(List.of(Status.values())));
                    break;
                case 10:
                    System.out.println(whatsapp.addContact());
                    break;
                case 11:
                    System.out.println(whatsapp.sendAMassage());
                    break;
                default:
                    System.out.println("Learn to give the number correctly,please give it again!");
            }
        }
    }
}
