package zadanie_2_2;

public class CalculatorTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(2.0, 3.0);
        shapes[1] = new Circle(1.0);
        shapes[2] = new Rectangle(4.0, 5.0);
        shapes[3] = new Circle(10.0);

        ShapeCalculator calculator = new ShapeCalculator();

        for (Shape s : shapes){
            System.out.println(s.getDescription() + ". Pole wynosi " + calculator.calculateArea(s));
            System.out.println(s.getDescription() + ". Obwód wynosi " + calculator.calculatePerimeter(s));
        }
    }
}
