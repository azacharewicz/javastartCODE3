package zadanie_2_2_version2;

public class TestShapeCalculator {
    public static void main(String[] args) {

        //wywołanie obiektów
        Square square = new Square(1.1);
        Circle circle = new Circle(2.2);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Rectangle rectangle = new Rectangle(6.6, 7.7);
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        //wywołanie funkcji
        double poleKwadratu = shapeCalculator.squareArea(square);
        double poleKola = shapeCalculator.circleArea(circle);
        double obwodTrojkata = shapeCalculator.trianglePerimeter(triangle);
        double obwodProstokata = shapeCalculator.rectPerimeter(rectangle);

        //wyświetlenie wyników obliczeń
        System.out.println();
        System.out.println("WYNIKI KOŃCOWE");
        System.out.println();
        System.out.println("Pole kwadratu o boku "+ square.bok + " wynosi " + poleKwadratu);
        //System.out.printf("Pole kwadratu = %f", poleKwadratu);
        System.out.println("Pole koła o promeniu "+ circle.promien + " wynosi " + poleKola);
        System.out.println("Obwód trójkąta o bokach " + triangle.bokA + ", " + triangle.bokB + ", " + triangle.bokC + " wynosi " + obwodTrojkata);
        System.out.println("Obwód prostokąta o bokach " + rectangle.bokA + ", " + rectangle.bokB + " wynosi " + poleKwadratu);
        System.out.println();
        System.out.println("KONIEC RAPORTU");

    }
}



