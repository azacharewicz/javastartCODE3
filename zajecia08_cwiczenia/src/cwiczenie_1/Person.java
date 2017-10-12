package cwiczenie_1;

public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstName, String lastName, String pesel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", pesel: " + pesel + ", wiek: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;

        if (firstName == null) {
            if (other.firstName != null) return false;
        } else if (!firstName.equals(other.firstName)) return false;

        if (lastName == null) {
            if (other.lastName != null) return false;
        } else if (!lastName.equals(other.lastName)) return false;

        if (pesel == null) {
            if (other.pesel != null) return false;
        } else if (!pesel.equals(other.pesel)) return false;

        if (age != other.age) return false;
        return true;
    }

}
