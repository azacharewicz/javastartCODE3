package cwiczenie_2;

public class Customer extends Human {

    private double averageMonthlyShopping;
    private double debetOnAccount;

    public Customer(){
        super();
        //super(null,null);
    }

    public Customer(double averageMonthlyShopping, double debetOnAccount, String firstName, String lasttName) {
        super(firstName, lasttName);
        this.averageMonthlyShopping = averageMonthlyShopping;
        this.debetOnAccount = debetOnAccount;
    }

    public double getAverageMonthlyShopping() {
        return averageMonthlyShopping;
    }

    public void setAverageMonthlyShopping(double averageMonthlyShopping) {
        this.averageMonthlyShopping = averageMonthlyShopping;
    }

    public double getDebetOnAccount() {
        return debetOnAccount;
    }

    public void setDebetOnAccount(double debetOnAccount) {
        this.debetOnAccount = debetOnAccount;
    }

//    public void showInfo() {
//        //System.out.println("imię i nazwisko: " + getFirstName() + " " + getLasttName());
//        super.printInfo(); //wyświetla metodę z klasy nadrzędnej
//        System.out.println("średnie miesięczne zakupy: " + getAverageMonthlyShopping());
//        System.out.println("niespłacona linia kredytowa: " + getDebetOnAccount() + "\n");
//    }


    @Override
    public void printInfo() {
        super.printInfo(); //wyświetla metodę z klasy nadrzędnej
        System.out.println("średnie miesięczne zakupy: " + getAverageMonthlyShopping());
        System.out.println("niespłacona linia kredytowa: " + getDebetOnAccount() + "\n");
    }


}

//public Customer(double averageMonthlyShopping, double debetOnAccount, String firstName, String lasttName)