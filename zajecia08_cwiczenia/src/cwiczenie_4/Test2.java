public class Test2 {
    public static void main(String[] args) {
        Rentable car = new RentableCar("Opel", 2014, 5);
        //czy car jest wypożyczony?
        System.out.println(car);

        Person person = new Person("Jan", "Kowalski");
        car.rent(person); //wypożyczamy janowi kowalskiemu
        System.out.println(car);

        //zwracamy samochód
        car.handOver();
        System.out.println(car);
    }
}
