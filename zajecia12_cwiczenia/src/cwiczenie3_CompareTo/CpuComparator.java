package cwiczenie3_CompareTo;

import java.util.Comparator;

public class CpuComparator implements Comparator<Komputer> {

    @Override
    public int compare(Komputer k1, Komputer k2) {
        //napisów nie możemy porównać przez znak większości tylko przez compareTo()
               if(k1.getCpu() > k2.getCpu())
        return 1;
        else if(k1.getCpu() == k2.getCpu())
            return 0;
        else return -1;
    }
}
