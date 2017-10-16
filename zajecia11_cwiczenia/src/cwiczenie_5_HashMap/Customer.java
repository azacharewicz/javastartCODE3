package cwiczenie_5_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {

    int id;
    String firstName;
    String lastName;
    int telNumber;

    public Customer(int id, String firstName, String lastName, int telNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }


    @Override
    public String toString() {
        return "Customer " +
                "[id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", telNumber=" + telNumber +
                ']' + "\n";
    }
}
