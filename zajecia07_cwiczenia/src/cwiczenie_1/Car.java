package cwiczenie_1;

public class Car {

    private String name;
    private int litresOn100km;
    private int speedLimit;
    public static int carsNumber = 0;

    public Car(String name, int litresOn100km, int speedLimit) {
        this.name = name;
        this.litresOn100km = litresOn100km;
        this.speedLimit = speedLimit;
        carsNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLitresOn100km() {
        return litresOn100km;
    }

    public void setLitresOn100km(int litresOn100km) {
        this.litresOn100km = litresOn100km;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public static int getCarsNumber() {
        return carsNumber;
    }


    public void showInfoAboutCar(){
        System.out.println();
        System.out.println("nazwa: " + getName());
        System.out.println("ile pali na 100 km: " + getLitresOn100km());
        System.out.println("max prędkość: " + getSpeedLimit());
        System.out.println("numer samochodu: " + getCarsNumber());
        System.out.println();

    }

}
