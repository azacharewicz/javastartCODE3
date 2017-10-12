package zadanie_2_2;

public class Rectangle extends Shape {
    private double bokA;
    private double bokB;

    @Override
    public String getDescription() {
        return super.getDescription() + "Prostokąt o bokach " + bokA + ", " + bokB;
    }

    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }
}
