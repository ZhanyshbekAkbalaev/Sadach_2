package classes.service;

import classes.Contacs;
import classes.Passport;
import classes.Whatsapp;
import classes.enums.Status;

import javax.swing.*;
import java.util.List;

public interface WhatsappService {
    List<Whatsapp> getAllWhatsapp();
    String goToYourProfile();
    List<Status> getWhatsappStatus();
    List<Whatsapp> intstallWhatsapp();
    String changeStatus(List<Status> statuses);
    String  addContact();

    String sendAMassage();

}
