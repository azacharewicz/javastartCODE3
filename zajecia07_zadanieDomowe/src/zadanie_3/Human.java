package zadanie_3;

public class Human {

    private String pozycja;
    private String firstName;
    private String lastName;

    public Human(String pozycja, String firstName, String lastName) {
        this.pozycja = pozycja;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void show(){
        System.out.println("Pozycja: " + pozycja);
        System.out.println("Imię i nazwisko: " + firstName + " " + lastName);
    }

}
