package cwiczenie_1;

import java.util.Scanner;

public class CarFactory {

    public static Car createCar(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę: ");
        String nazwa = scanner.nextLine();
        System.out.println("Podaj ile pali litrów na 100 km: ");
        int ilePali = scanner.nextInt();
        System.out.println("Podaj jakie ma ograniczenie max prędkości: ");
        int ileMaxKm = scanner.nextInt();
        Car car = new Car(nazwa, ilePali, ileMaxKm);
    return car;
    }

}



//    private String name;
//    private int litresOn100km;
//    private int speedLimit;
//    public static int carsNumber;