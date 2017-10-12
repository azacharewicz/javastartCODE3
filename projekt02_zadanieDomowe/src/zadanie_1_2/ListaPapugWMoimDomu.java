package zadanie_1_2;

public class ListaPapugWMoimDomu {

    public static void main(String[] args) {

        //Papuga(String o, String i, String k, boolean ch, int w)

        Papuga papuga1 = new Papuga("Nimfa", "April", "cytrynowy", false, 5);
        Papuga papuga2 = new Papuga("Nierozłączka", "Lea", "błękitny", true, 8);

        System.out.println("DANE PIERWSZEJ PAPUGI");
        System.out.println("odmiana: " + papuga1.odmiana);
        System.out.println("imię: " + papuga1.imie);
        System.out.println("kolor: " + papuga1.kolor);
        System.out.println("czy posiada wredny charakter: " + papuga1.czyWrednyCharakter);
        System.out.println("wiek: " + papuga1.wiek + " miesięcy");

        System.out.println("DANE DRUGIEJ PAPUGI");
        System.out.println("odmiana: " + papuga2.odmiana);
        System.out.println("imię: " + papuga2.imie);
        System.out.println("kolor: " + papuga2.kolor);
        System.out.println("czy posiada wredny charakter: " + papuga2.czyWrednyCharakter);
        System.out.println("wiek: " + papuga2.wiek + " miesięcy");


        System.out.println("Kocham je obie tak samo!");
    }
}
