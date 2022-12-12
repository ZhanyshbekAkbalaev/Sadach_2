package classes;

import classes.enums.Status;

import java.util.List;

public class Whatsapp {
    private int id;
    private String phoneNumber;
    private String image = "DEFOULT 📱";
    private String passwort;
    private String userName;
    private Status status;
    private List<Contacs> contacs;
    private List<Massage> massages;

    public Whatsapp() {
    }

    public Whatsapp(int id, String phoneNumber, String image, String passwort, String userName, Status status) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.passwort = passwort;
        this.userName = userName;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Contacs> getContacs() {
        return contacs;
    }

    public void setContacs(List<Contacs> contacs) {
        this.contacs = contacs;
    }

    public List<Massage> getMassages() {
        return massages;
    }

    public void setMassages(List<Massage> massages) {
        this.massages = massages;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~Whatsapp~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\nid: " + id +
                "\nphone Number: " + phoneNumber +
                "\nimage: " + image +
                "\nparol: " + passwort +
                "\nuser Name: " + userName +
                "\nstatus: " + status +
                "\ncontacts: " + contacs +
                "\nmassage: "+massages +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    }
}
