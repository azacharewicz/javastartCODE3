public class Test1 {
    public static void main(String[] args) {
        Moveable car1 = new Car("Seat", 2010, 5);
        System.out.println(car1); //Car Seat 2010 Przód 5
        car1.goBack();
        System.out.println(car1); //Car Seat 2010 Tył 5
    }
}
