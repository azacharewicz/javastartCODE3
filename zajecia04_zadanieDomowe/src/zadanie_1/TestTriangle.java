package zadanie_1;

public class TestTriangle {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3,4,5);
        TriangleMethods triangleMethods = new TriangleMethods();

        boolean isTriangleRectangular = triangleMethods.isRightTriangle(triangle1);
        System.out.println("Czy trójkąt jest prostokątny: " + isTriangleRectangular);
    }

}
