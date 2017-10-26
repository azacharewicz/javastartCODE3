package cwiczenie3_CompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KomputerCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Komputer> computers = new ArrayList<>();


        computers.add(new Komputer("nameComputer1", 1000, 1000));
        computers.add(new Komputer("SUPERComputer", 2000, 2000));
        computers.add(new Komputer("SUPERComputer", 2000, 3000));
        computers.add(new Komputer("SUPERComputer", 500, 5000));

        System.out.println("Po czym sortujemy:");
        System.out.println("memory, cpu, name?");
        String poCzymSortujemy = scanner.nextLine();
        //System.out.println(poCzymSortujemy);

        if ("name".equals(poCzymSortujemy)) {
            //sortowanie po NAME
            Collections.sort(computers);
            System.out.println(computers.toString());
        } else if ("memory".equals(poCzymSortujemy)) {
            //sortowanie po MEMORY
            MemoryComparator memoryComparator = new MemoryComparator();
            Collections.sort(computers, memoryComparator);
            System.out.println("Produkty posortowane po memory");
            System.out.println(computers.toString());
        } else {
            //sortowanie po CPU
            CpuComparator cpuComparator = new CpuComparator();
            Collections.sort(computers, cpuComparator);
            System.out.println("Produkty posortowane po memory");
            System.out.println(computers.toString());
        }

    }
}
