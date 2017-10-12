package zadanie_1_1;

public class ListaPapugWMoimDomu {

    public static void main(String[] args) {

        Papuga papuga1 = new Papuga();
        papuga1.odmiana = "Nimfa";
        papuga1.imie = "April";
        papuga1.kolor = "cytrynowy";
        papuga1.czyWrednyCharakter = false;
        papuga1.wiek = 5;

        Papuga papuga2 = new Papuga();
        papuga2.odmiana = "Nierozłączka";
        papuga2.imie = "Lea";
        papuga2.kolor = "błękitny";
        papuga2.czyWrednyCharakter = true;
        papuga2.wiek = 8;

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
