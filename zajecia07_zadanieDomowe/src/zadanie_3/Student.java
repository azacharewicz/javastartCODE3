package zadanie_3;

public class Student extends Human{
    private int nrIndex;
    private int level;


    public Student(String pozycja, String firstName, String lastName, int nrIndex, int level) {
       super(pozycja, firstName, lastName);
        this.nrIndex = nrIndex;
        this.level = level;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Nr indeksu: " + nrIndex + ", Semestr studiów: " + level);
        System.out.println();
    }
}
