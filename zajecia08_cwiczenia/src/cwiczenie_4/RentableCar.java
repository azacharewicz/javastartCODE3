public class RentableCar extends Car implements Rentable {
    private Person person; //komu wypożyczony jest samochód

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public void rent(Person person) {
        this.person = person;
    }

    @Override
    public boolean isRent() {
        return person != null; //czy ktoś aktualnie wypożycza samochód?
    }

    @Override
    public void handOver() {
        this.person = null;
    }

    @Override
    public String toString() {
        return super.toString() + " " + (person == null? "niewypożyczony":"wypożyczony dla " + person);
    }
}
