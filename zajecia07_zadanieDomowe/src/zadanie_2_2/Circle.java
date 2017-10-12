package zadanie_2_2;

public class Circle extends Shape {
    private double radius;

    @Override
    public String getDescription() {
        return super.getDescription() + "Koło o promieniu " + radius;
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
