package zadanie_2_1;

public class Circle extends Shape {
    private double radius;

    public String getType() {
        return "Koło";
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
