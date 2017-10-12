package zadanie_2_2;

public class Circle {

    double promien;

    // P = pi * r*r
    // O = 2 * pi * r

    //konstruktor
    public Circle(double promien) {
        this.promien = promien;
    }

    //metoda obliczająca pole koła
    double calculateArea() {
        return (Math.PI * Math.pow(promien, 2));
    }

}
