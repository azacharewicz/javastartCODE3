package calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(2, 5));
        calc.substractAndShow(11, 2);
        }
}

//    double multiply(double a, double b) {
//        double resultOfMultiply = a * b;
//        return resultOfMultiply;
//    }
//
//    void substractAndShow(int a, int b) {
//        int resultOfSubstract = a - b;
//        System.out.println(resultOfSubstract);
//    }