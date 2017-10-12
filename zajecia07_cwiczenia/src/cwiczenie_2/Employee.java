package cwiczenie_2;

public class Employee extends Human{

    private double salary;
    private int levelOfHapinessFromJob;

    public Employee(){
    }

    public Employee(double salary, int levelOfHapinessFromJob, String firstName, String lasttName ) {
        super(firstName, lasttName);
        this.salary = salary;
        this.levelOfHapinessFromJob = levelOfHapinessFromJob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getLevelOfHapinessFromJob() {
        return levelOfHapinessFromJob;
    }

    public void setLevelOfHapinessFromJob(int levelOfHapinessFromJob) {
        this.levelOfHapinessFromJob = levelOfHapinessFromJob;
    }

//    public void showInfo(){
//        //System.out.println("imię i nazwisko: " + getFirstName() + " " + getLasttName());
//        super.printInfo(); //wyświetla metodę z klasy nadrzędnej
//        System.out.println("wynagrodzenie: " + salary);
//        System.out.println("poziom zadowolenia z pracy: " + levelOfHapinessFromJob + "%\n");
//    }


    @Override
    public void printInfo() {
        super.printInfo(); //wyświetla metodę z klasy nadrzędnej
        System.out.println("wynagrodzenie: " + salary);
        System.out.println("poziom zadowolenia z pracy: " + levelOfHapinessFromJob + "%\n");
    }


}



