package classes;

public class Massage {
    private String userName;

    public Massage() {
    }

    public Massage(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Massage" +
                "\nuserName: " + userName +
                "~~~~~~~~~";
    }
}
