package zadanie_2_2_version2;

public class zzzRectangle {
    double bokA;
    double bokB;

    //konstruktor
    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    //metoda obliczająca obwód prostokąta
    double calculatePerimeter() {
        return (2 * bokA + 2 * bokB);
    }

}
