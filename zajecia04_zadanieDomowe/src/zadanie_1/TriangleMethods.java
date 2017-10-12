package zadanie_1;

import static java.lang.Math.pow;

public class TriangleMethods {

    public boolean isRightTriangle(Triangle triangle) {
        double x = pow(triangle.getBokA(), 2) + pow(triangle.getBokB(), 2);
        double y = pow(triangle.getBokC(), 2);
        return (x == y);
        }

}

