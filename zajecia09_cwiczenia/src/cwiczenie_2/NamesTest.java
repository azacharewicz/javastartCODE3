package cwiczenie_2;

public class NamesTest {
    public static void main(String[] args) {

        NamesHolder nh = new NamesHolder();

        boolean brakWyjatkow = false;

        do {
            try {
                nh.add("Basia");
            } catch (DuplicateException de) {
                System.out.println("zduplikowany wpis");
                brakWyjatkow = false;
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("za duży numer indexu w tablicy");
                brakWyjatkow = false;
            }
        } while (brakWyjatkow);


        System.out.println(nh.size());

        System.out.println(nh.contains("Basia"));

    }


}
