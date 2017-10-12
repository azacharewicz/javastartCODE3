package cwiczenie_2;

import java.util.Scanner;

public class NamesHolder {

    String[] names = new String[10];
    int index = 0;

    public void add(String name) throws DuplicateException {
        if (name == null) throw new NullPointerException();
        if (index == names.length) throw new ArrayIndexOutOfBoundsException();
        if (name.contains(name) == true) throw new DuplicateException();
        names[index] = name;
        index++;

    }

    public boolean contains(String name) {
        int i = 0;
        if (name == null) throw new IllegalArgumentException();

        for (i = 0; i < name.length(); i++) {
            if (names[i].equals(names[i - 1]))
                return true;
        }
        return false;
    }


    public int size() {
        return names.length;
    }

}
