package zadanie_2_2_kopia;

public class Triangle {

    //O = a+b+c

    double bokA;
    double bokB;
    double bokC;

    //konstruktor
    public Triangle(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    //metoda obliczająca obwód trójkąta
    double calculatePerimeter() {
        return (bokA + bokB + bokC);
    }

}
