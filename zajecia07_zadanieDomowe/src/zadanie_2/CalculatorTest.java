package zadanie_2;

import sun.security.provider.SHA;

public class CalculatorTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(2.0,3.0);
        Circle c = new Circle(1.0);
        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println("Pole prostokąta o bokach " + r.getBokA() + ", " + r.getBokB() + " wynosi " + calculator.rectangleArea(r));
        System.out.println("Obwód prostokąta o bokach " + r.getBokA() + ", " + r.getBokB() + " wynosi " + calculator.rectanglePerimeter(r));
        System.out.println("Pole koła o promieniu " + c.getRadius() + " wynosi " + calculator.circleArea(c));
        System.out.println("Obwód koła o promieniu " + c.getRadius() + " wynosi " + calculator.circlePerimeter(c));


    }
}
