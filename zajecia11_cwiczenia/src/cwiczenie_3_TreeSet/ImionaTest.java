package cwiczenie_3_TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ImionaTest {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Jagoda");
        set.add("Róża");
        set.add("Malwina");
        set.add("Matylda");
        set.add("Anna");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next); //lub krócej //System.out.println(iterator.next());

        }
    }
}
