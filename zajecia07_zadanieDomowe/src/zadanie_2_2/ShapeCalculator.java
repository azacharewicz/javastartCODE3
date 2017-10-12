package zadanie_2_2;

import com.sun.org.apache.regexp.internal.RE;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ShapeCalculator {

    public static double calculateArea(Shape s){
        if (s instanceof Rectangle)
            return (((Rectangle)s).getBokA() * ((Rectangle)s).getBokB());
        else if (s instanceof Circle)
            return (PI * pow(((Circle)s).getRadius(), 2));
        else
            return 0.0;
    }

    public static double calculatePerimeter(Shape s){
        if (s instanceof Rectangle)
            return ((2 * ((Rectangle)s).getBokA()) + (2 * ((Rectangle)s).getBokB()));
        else if (s instanceof Circle)
            return (2 * PI * ((Circle)s).getRadius());
        else
            return 0.0;
    }
}
