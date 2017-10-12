package zadanie_dodatkowe;

import java.util.Scanner;

public class TestKOT {
    public static void main(String[] args) {

        //1 sposób
        System.out.println(KOT.class.getName());

        //2 sposób
        byte ascii[] =  {75,79,84};
        String wyraz = new String(ascii);
        System.out.println(wyraz);

    }

}
