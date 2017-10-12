package zadanie_2_1;

import com.sun.org.apache.regexp.internal.RE;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ShapeCalculator {

    public static double rectangleArea(Rectangle rectangle){
        return (rectangle.getBokA() * rectangle.getBokB());
    }

    public static double circleArea(Circle circle){
        return (PI * pow(circle.getRadius(), 2));
    }

    public static double rectanglePerimeter(Rectangle rectangle){
        return ((2 * rectangle.getBokA()) + (2 * rectangle.getBokB()));
    }

    public static double circlePerimeter(Circle circle){
        return (2 * PI * circle.getRadius());
    }

}
