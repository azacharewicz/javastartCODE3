package zadanie_3;

public class TestKompetencjiGimnazjalisty {

    public static void main(String[] args) {

        MathQuiz mathQuiz = new MathQuiz(3, 5, 12, 15129);
        Statistics statistics = new Statistics();

        System.out.println("WITAMY NA EGZAMINIE GIMNAZJALMYM");
        System.out.println("Opowiedz na poniższe pytania");
        System.out.println();
        String response1 = mathQuiz.obsluzPytanie(mathQuiz.question1(), statistics);
        String response2 = mathQuiz.obsluzPytanie(mathQuiz.question2(), statistics);
        String response3 = mathQuiz.obsluzPytanie(mathQuiz.question3(), statistics);


        //odpowiedzi   ---------------------------------------------------------------------------------

        System.out.println("OTO TWOJE WYNIKI");
        System.out.println();
        System.out.println(response1);
        System.out.println(response2);
        System.out.println(response3);

        //suma punktów z testu   ---------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Suma punktów: " + statistics.sumaPunktow + "/" + statistics.liczbaPytan);

    }
}
