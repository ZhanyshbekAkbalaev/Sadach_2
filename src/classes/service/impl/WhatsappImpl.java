package classes.service.impl;

import classes.Contacs;
import classes.Massage;
import classes.Passport;
import classes.Whatsapp;
import classes.enums.Country;
import classes.enums.Status;
import classes.service.WhatsappService;

import javax.xml.stream.events.StartDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WhatsappImpl implements WhatsappService {
    List<Whatsapp> whatsapps = new ArrayList<>();

    @Override
    public List<Whatsapp> getAllWhatsapp() {
        return whatsapps;
    }

    @Override
    public String goToYourProfile() {
        System.out.println("user name jaz");
        String userName = new Scanner(System.in).nextLine();
        for (Whatsapp whatsapp : this.whatsapps) {
            if (whatsapp.getUserName().equals(userName)){
                System.out.println(whatsapp);
            }
        }
        return "null";
    }

    @Override
    public List<Status> getWhatsappStatus() {
        List<Status> roleList = Arrays.asList(Status.values());
        roleList.forEach(System.out::println);
        return roleList;
    }

    @Override
    public List<Whatsapp> intstallWhatsapp() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Id beriniz");
        int id = scanner.nextInt();
        System.out.println("Phone number beriniz");
        String phone = scanner1.nextLine();
        System.out.println("image beriniz");
        String image = scanner2.nextLine();
        System.out.println("Parol beriniz");
        String parol = scanner3.nextLine();
        System.out.println("User name beriniz");
        String user = scanner4.nextLine();
        System.out.println("Status beriniz");
        String status = scanner5.nextLine();
        System.out.println("Contacs jaz");
        Whatsapp whatsapp = new Whatsapp(id, phone, image, parol, user, Status.valueOf(status));
        this.whatsapps.add(whatsapp);
        return whatsapps;

    }

    @Override
    public String changeStatus(List<Status> statuses) {
        System.out.println("User name jaz");
        String user = new Scanner(System.in).nextLine();
        for (Whatsapp whatsapp : this.whatsapps) {
            if (whatsapp.getUserName().equals(user)) {
                System.out.print("Status jaz: ");
                String nameStatus = new Scanner(System.in).nextLine();
                for (Status status : statuses) {
                    if (status.name().equals(nameStatus.toUpperCase())) {
                        whatsapp.setStatus(status);
                    }
                }
            }
        }

        return "Koshuldu!";
    }

    @Override
    public String  addContact() {
        System.out.println("User name:");
        String user = new Scanner(System.in).nextLine();
        for (Whatsapp whatsapp : this.whatsapps) {
            if (whatsapp.getUserName().equals(user)){
                System.out.println("id jaz");
                int id = new Scanner(System.in).nextInt();
                System.out.println("phone numbers jaz!");
                String pheneNumbers = new Scanner(System.in).nextLine();
                Contacs contacs1 = new Contacs(id,pheneNumbers);
                whatsapp.getContacs().add(contacs1);
            }
        }
        return "Good";
    }

    @Override
    public String sendAMassage() {
        System.out.println("user name beriniz");
        String user = new Scanner(System.in).nextLine();
        for (Whatsapp whatsapp : this.whatsapps) {
            if (whatsapp.getUserName().equals(user)){
                System.out.println("jaz contact:");
                String contact = new Scanner(System.in).nextLine();
                System.out.println();
                    Massage massage = new Massage();



            }
        }
        return null;
    }
}
