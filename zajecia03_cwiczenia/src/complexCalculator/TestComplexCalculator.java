package complexCalculator;

public class TestComplexCalculator {

    public static void main(String[] args) {

        ComplexCalculator calc = new ComplexCalculator();

        String c1 = calc.addTwoStrings("Hakuna ","Matata!");
        System.out.println(c1);

        double c2 = calc.addTwoNoIntegerNumber(7.777,123.3456789);
        System.out.println(c2);

    }
}
