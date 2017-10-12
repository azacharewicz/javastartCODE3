public class zajecia02cwiczenie3 {

    public static void main(String[] args) {

        String liczba1JakoTekst = "12.0";
        double liczba1JakoLiczba = 12.0;
        String liczba2JakoTekst = "5.5";
        double liczba2JakoLiczba = 5.5;
        double sumaDwochLiczb = (liczba1JakoLiczba + liczba2JakoLiczba);
        double roznicaDwochLiczb = (liczba1JakoLiczba - liczba2JakoLiczba);
        double iloczynDwochLiczb = (liczba1JakoLiczba * liczba2JakoLiczba);
        double ilorazDwochLiczb = (liczba1JakoLiczba / liczba2JakoLiczba);

        System.out.println(liczba1JakoTekst + "+" + liczba2JakoTekst + "=" + sumaDwochLiczb);
        System.out.println(liczba1JakoTekst + "-" + liczba2JakoTekst + "=" + roznicaDwochLiczb);
        System.out.println(liczba1JakoTekst + "*" + liczba2JakoTekst + "=" + iloczynDwochLiczb);
        System.out.println(liczba1JakoTekst + "/" + liczba2JakoTekst + "=" + ilorazDwochLiczb);


        boolean aWiekszeOdZero = (liczba1JakoLiczba > 0);
        boolean sumaJestParzysta = (sumaDwochLiczb%2 == 0);
        boolean aLubBWiekszeod100 = ((liczba1JakoLiczba > 100) || (liczba2JakoLiczba > 100));
        boolean aIBWiekszeOD100 = ((liczba1JakoLiczba > 100) && (liczba2JakoLiczba > 100));

        System.out.println("Czy A jest większe od 0? " + (aWiekszeOdZero));
        System.out.println("Czy suma jest parzysta? " + (sumaJestParzysta));
        System.out.println("A lub B większe od 100? " + (aLubBWiekszeod100));
        System.out.println("A i B większe od 100? " + (aIBWiekszeOD100));



    }
}
