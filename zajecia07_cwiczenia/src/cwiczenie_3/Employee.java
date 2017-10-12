package cwiczenie_3;

public class Employee extends Person{
    private double salary;

    public Employee(double salary, String firstName, String lastName) {
        super(firstName, lastName);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
