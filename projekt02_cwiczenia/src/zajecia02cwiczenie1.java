public class zajecia02cwiczenie1 {

    public static void main(String[] args) {

        String produkt1 = "Produkt1:";
        String nazwaProdukt1 = "Mleko";
        String producentProdukt1 = "Mlekowita";
        double cenaProdukt1 = 2.5;

        String produkt2 = "Produkt2:";
        String nazwaProdukt2 = "Czekolada";
        String producentProdukt2 = "Wedel";
        double cenaProdukt2 = 2.19;

        System.out.println(produkt1);
        System.out.println(nazwaProdukt1 + " " + producentProdukt1 + " " + cenaProdukt1);
        System.out.println(produkt2);
        System.out.println(nazwaProdukt2 + " " +  producentProdukt2 + " " + cenaProdukt2);
        System.out.println();

        System.out.println(produkt1);
        System.out.printf("%s %s %f \n", nazwaProdukt1, producentProdukt1, cenaProdukt1);
        System.out.println(produkt2);
        System.out.printf("%s %s %.2f \n", nazwaProdukt2, producentProdukt2, cenaProdukt2);

        // %d - liczby całkowite
        // %b - wartości logiczne
        // %.1f - liczba miejsc po przecinku = 1


    }

}
