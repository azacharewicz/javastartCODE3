package cwiczenie_2;


public class TestHumans {
    public static void main(String[] args) {

        Customer klient1 = new Customer(12345.67, 777.77, "Anna", "Kowalska");
        //klient1.showInfo();
        klient1.printInfo();

        Employee pracownik1 = new Employee(22222.22, 100, "Sławek", "Ludwiczak");
        //pracownik1.showInfo();
        pracownik1.printInfo();
    }
}

//public Customer(double averageMonthlyShopping, double debetOnAccount, String firstName, String lasttName)
//public Employee(double salary, int levelOfHapinessFromJob, String firstName, String lasttName )