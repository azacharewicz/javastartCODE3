package cwiczenie_2;

public class DuplicateException extends Exception {
    public DuplicateException(){
        System.out.println("Taka wartość już istnieje!");
    }
}
