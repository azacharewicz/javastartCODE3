package cwiczenie_3;

public class Director extends Employee {
    private double bonusPremia;

    public Director(double salary, String firstName, String lastName, double bonusPremia) {
        super(salary, firstName, lastName);
        this.bonusPremia = bonusPremia;
    }

}
