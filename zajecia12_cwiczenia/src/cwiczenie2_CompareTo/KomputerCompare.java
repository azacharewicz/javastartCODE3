package cwiczenie2_CompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KomputerCompare {
    public static void main(String[] args) {

        List<Komputer> computers = new ArrayList<>();

        computers.add(new Komputer("nameComputer1", 1000, 1000));
        computers.add(new Komputer("SUPERComputer", 2000, 2000));
        computers.add(new Komputer("SUPERComputer", 2000, 3000));
        computers.add(new Komputer("SUPERComputer", 500, 5000));

        //posotruj liste po predkosci procesora
        Collections.sort(computers);
        System.out.println(computers.toString());

    }
}
