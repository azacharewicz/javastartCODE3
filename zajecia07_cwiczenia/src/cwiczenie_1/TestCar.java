package cwiczenie_1;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = CarFactory.createCar();
        car1.showInfoAboutCar();

        Car car2 = CarFactory.createCar();
        car1.showInfoAboutCar();

        System.out.println(Car.carsNumber);

    }
}
