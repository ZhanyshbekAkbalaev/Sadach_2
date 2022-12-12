package classes;

import java.util.SplittableRandom;

public class Contacs {
    private int id ;
    private String userName;

    public Contacs() {
    }

    public Contacs(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Contacs" +
                "\nid: " + id +
                "\nuserName: " + userName;
    }
}
