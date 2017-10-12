package calculator;

class Calculator {

    void sumAndShow(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    int sumAndReturn(int a, int b) {
        int sum = a + b;
        return sum;
    }


    double multiply(double a, double b) {
        double resultOfMultiply = a * b;
        return resultOfMultiply;
    }


    void substractAndShow(int a, int b) {
        int resultOfSubstract = a - b;
        System.out.println(resultOfSubstract);
    }


}


