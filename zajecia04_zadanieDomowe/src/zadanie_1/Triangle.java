package zadanie_1;

public class Triangle {

    private double bokA;
    private double bokB;
    private double bokC;

    public Triangle(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
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

    public double getBokC() {
        return bokC;
    }

    public void setBokC(double bokC) {
        this.bokC = bokC;
    }
}
