package zadanie_1b;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }


    public String name(String name) throws NameUndefinedException {
        if ((name == null) || (name.length() < 2)) {
            throw new NameUndefinedException();
        } else return name;
    }

    public int age(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException();
        } else return age;
    }

}
