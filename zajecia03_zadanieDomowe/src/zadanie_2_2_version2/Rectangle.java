package zadanie_2_2_version2;

public class Rectangle {
    double bokA;
    double bokB;


    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    double calculateArea(){
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        return shapeCalculator.rectArea(this);
    }
}
