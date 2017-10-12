package zadanie_3_1;

import com.sun.javafx.geom.Vec2d;

public class Test {
    public static void main(String[] args) {
        Ball b = new Ball(10.0);
        Circle c = new Circle(3.0);
        Cube q = new Cube(4.0);
        Line2D l2d = new Line2D(new Vec2d(0.0, 0.0), new Vec2d(3.0, 4.0));
        Rectangle r = new Rectangle(4.0, 5.0);

        ShapeCalculator calc = new ShapeCalculator();

        System.out.println("ball " + b.getRadius() + ": volume: " + calc.ballVolume(b));
        System.out.println("circle " + c.getRadius() + ": area: " + calc.circleArea(c));
        System.out.println("cube " + q.getA() + ": volume: " + calc.cubeVolume(q));
        System.out.println("line2d " + l2d.getStart() + " --> " + l2d.getEnd() + ": lenght: " + calc.lineLength(l2d));
        System.out.println("rectangle " + r.getA() + ", " + r.getB() + ": area: " + calc.rectangleArea(r));
    }
}


//Zdefiniuj	dodatkową	klasę	testową,
// w	której	stworzysz	kilka	obiektów reprezentujących	kształty
// i	obliczysz	ich	pola,	długości	lub	pojemności.
