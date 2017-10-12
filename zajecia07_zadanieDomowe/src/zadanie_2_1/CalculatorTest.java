package zadanie_2_1;

import sun.security.provider.SHA;

public class CalculatorTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(2.0, 3.0);
        shapes[1] = new Circle(1.0);
        shapes[2] = new Rectangle(4.0, 5.0);
        shapes[3] = new Circle(10.0);

        ShapeCalculator calculator = new ShapeCalculator();

        for (Shape s : shapes){
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle)s;
                System.out.println(s.getType() + " o bokach " + r.getBokA() + ", " + r.getBokB() + ". Pole wynosi " + calculator.rectangleArea(r));
                System.out.println(s.getType() + " o bokach " + r.getBokA() + ", " + r.getBokB() + ". Obwód wynosi " + calculator.rectanglePerimeter(r));
            }
            else if (s instanceof Circle) {
                Circle c = (Circle)s;
                System.out.println(s.getType() + " o promieniu " + c.getRadius() + ". Pole wynosi " + calculator.circleArea(c));
                System.out.println(s.getType() + " o promieniu " + c.getRadius() + ". Obwód wynosi " + calculator.circlePerimeter(c));
            }
        }
    }
}
