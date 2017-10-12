package zadanie_2_2_version2;

public class zzzCircle {

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
