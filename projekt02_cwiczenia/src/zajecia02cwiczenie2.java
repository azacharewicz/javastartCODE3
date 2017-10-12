public class zajecia02cwiczenie2 {

    public static void main(String[] args) {

//        System.out.println(9/4);
//        System.out.println(9.0/4.0);

    int number = 1;
    number = number++;
        System.out.println(number++);
        System.out.println(++number);
        System.out.println(number--);
        System.out.println(number--);

        double number2 = 5.0;
        double suma1 = number + number2;


        //konwersja typu - obcina część dziesiętną, nawet jeżeli końcóka będzie 0.9
        int suma2 = (int)(number + number2);

    }

}
