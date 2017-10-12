package cwiczenie_2;

public class Human {
    private String firstName;
    private String lasttName;


    public Human() {
    }

    public Human(String firstName, String lasttName) {
        this.firstName = firstName;
        this.lasttName = lasttName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public void printInfo() {
        System.out.println("imię i nazwisko: " + getFirstName() + " " + getLasttName());
    }
}
