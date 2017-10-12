package zadanie_2_2_version2;

public class ShapeCalculator {


    //pole kwadratu
    double squareArea(Square square) {
        //return (square.bok * square.bok);
        return Math.pow(square.bok, 2);
    }

    //pole protokąta
    double rectArea(Rectangle rectangle) {
        return (rectangle.bokA * rectangle.bokB);
    }

    //pole koła  P = pi * r*r
    double circleArea(Circle cirle) {
        return (Math.PI * Math.pow(cirle.promien, 2));
    }

    //obwód trójkąta O = a+b+c
    double trianglePerimeter(Triangle triangle) {
        return (triangle.bokA + triangle.bokB + triangle.bokC);
    }

    //obwód prostokąta O = 2*a + 2*b
    double rectPerimeter(Rectangle rectangle) {
        return (2 * rectangle.bokA + 2 * rectangle.bokB);
    }

}






