package zadanie_2;

import java.util.Arrays;

public class MultiArrayTest {
    public static void main(String[] args) {

        MultiArray array1 = new MultiArray(3, 5);
        array1.print();
        System.out.println();
        System.out.println("Min value: " + array1.findMin());
        System.out.println("Max value: " + array1.findMax());

    }
}
